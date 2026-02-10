package is.nutritivna_zona.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import is.nutritivna_zona.models.AuthorizationRules;
import is.nutritivna_zona.models.Rule;
import is.nutritivna_zona.services.JwtUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration

@EnableMethodSecurity
public class WebSecurityConfig {

    private final AuthorizationFilter authorizationFilter;
    private final JwtUserDetailsService jwtUserDetailsService;

    public WebSecurityConfig(AuthorizationFilter authorizationFilter, JwtUserDetailsService jwtUserDetailsService) {
        this.authorizationFilter = authorizationFilter;
        this.jwtUserDetailsService = jwtUserDetailsService;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        AuthorizationRules authorizationRules = new ObjectMapper()
                .readValue(new ClassPathResource("rules.json").getInputStream(), AuthorizationRules.class);

        http.cors(cors -> cors.configurationSource(corsConfigurationSource()))
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> {

                    auth.requestMatchers(
                            "/v3/api-docs/**",
                            "/swagger-ui/**",
                            "/swagger/**",
                            "/swagger-ui.html",
                            "/swagger-resources/**",
                            "/webjars/**"
                    ).permitAll();

                    // Allow login and signup
                    auth.requestMatchers(HttpMethod.POST, "/login", "/sign-up","/confirm-email/**").permitAll();

                    auth.requestMatchers(HttpMethod.GET, "/profile-verify").permitAll();


                    // Apply rules from rules.json
                    for (Rule rule : authorizationRules.getRules()) {
                        if (rule.getMethods().isEmpty()) {
                            auth.requestMatchers(rule.getPattern())
                                    .hasAnyAuthority(rule.getRoles().toArray(new String[0]));
                        } else {
                            for (String method : rule.getMethods()) {
                                auth.requestMatchers(HttpMethod.valueOf(method), rule.getPattern())
                                        .hasAnyAuthority(rule.getRoles().toArray(new String[0]));
                            }
                        }
                    }

                    // Optional: deny everything not matched above
                    // auth.anyRequest().denyAll();
                })
                .addFilterBefore(authorizationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }




    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(List.of("*"));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public GrantedAuthorityDefaults grantedAuthorityDefaults() {
        return new GrantedAuthorityDefaults(""); // Removes the ROLE_ prefix
    }
}

