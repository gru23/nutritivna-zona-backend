package is.nutritivna_zona.services;

import is.nutritivna_zona.models.dto.LoginResponse;
import is.nutritivna_zona.models.requests.LoginRequest;


public interface AuthService {
    LoginResponse login(LoginRequest request);

}


