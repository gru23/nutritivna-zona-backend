USE nutritivna_zona_en;

/*User*/
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES(1, 'Bojana', 'Popović', '1998-04-02', 'bojana', '$2a$10$E6QOnT1PHF118jKuavHJgug38cOSTbYrc6lvulxFNtOgkUsV8p8iK', 'ADMIN', 'bojana@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (2, 'Danijel', 'Savić', '2003-02-20', 'danijel.savic', '$2a$10$.vVYczETVBKE/SN3uqRgyOsdLr//otZU1WCnbDIzW1GiifNPvpZnG', 'CLIENT', 'danijel.savic@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (3, 'Mitra', 'Đokić', '1981-02-20', 'mitra.đokic', '$2a$10$IMt7phR2M8c2hvMBjORIpOG997/gPcPCWI3SxK1H0c.zVPEplYuxO', 'CLIENT', 'mitra.đokic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (4, 'Ljiljana', 'Mihajlović', '1998-05-11', 'ljiljana.mihajlovic', '$2a$10$lWXdvaHdK8OUCJ8MK2m1nO/KkXHGTX96foGYIerikDI4ayQ2RCl1C', 'CLIENT', 'ljiljana.mihajlovic@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (5, 'Stojanka', 'Ratković', '1984-09-08', 'stojanka.ratkovic', '$2a$10$a7fgfTjfylHzNgnTqgDh0uWikjpO02bTOHcfPhMLr9OQbjEAep.26', 'CLIENT', 'stojanka.ratkovic@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (6, 'Tijana', 'Martinović', '1995-12-03', 'tijana.martinovic', '$2a$10$PpzTmz89tYFUGWSUhV2jAOusIN4DNSpD87gPZf34iCNGL.nc1q9xW', 'CLIENT', 'tijana.martinovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (7, 'Aleksandar', 'Maksimović', '2002-12-11', 'aleksandar.maksimovic', '$2a$10$UNey5ydYrGrL8bmr9mZQzOWlXsgY5pifBpJzMTqlOTBU6MvhGjYrC', 'CLIENT', 'aleksandar.maksimovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (8, 'Zoran', 'Nedeljković', '1984-02-12', 'zoran.nedeljkovic', '$2a$10$yJJUGXxpUA5/svDdPf1/BOjEmyAJcYuyHIxMXKULbfzSdJYMTBCAy', 'CLIENT', 'zoran.nedeljkovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (9, 'Tatjana', 'Radić', '1989-06-24', 'tatjana.radic', '$2a$10$7Tl.Y3pdvvuCR7H2DJR2YOr72oBeiU4IgH4seVCwipE7/UDFVwY5i', 'CLIENT', 'tatjana.radic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (10, 'Slađana', 'Andrić', '1983-03-04', 'slađana.andric', '$2a$10$1a35nSYbKI0V19IUyh1wIuJaOXe8/K2SQ6aGeA2Ow65SEJTCxODfy', 'CLIENT', 'slađana.andric@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (11, 'Tanja', 'Ratković', '1996-01-12', 'tanja.ratkovic', '$2a$10$SJVsluEPb2NSO.an//8d3umZKVyKx36eQhQ62vC1vDkkeX8gA4Gxm', 'CLIENT', 'tanja.ratkovic@mail.com', false, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (12, 'Aleksandar', 'Savić', '1988-06-21', 'aleksandar.savic', '$2a$10$.g7.DvvSQkQncL.X2tfqcuPlldb0HjXsnFZhYi5CHJEn23Di8tFSS', 'CLIENT', 'aleksandar.savic@mail.com', false, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (13, 'Jovana', 'Mihailović', '1995-09-04', 'jovana.mihailovic', '$2a$10$NwCqSZJGb0eRTk5ZtH4tYuJNy5xRowqyPQLKuewdXgS6jpBWPz54W', 'CLIENT', 'jovana.mihailovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (14, 'Ratko', 'Đokić', '2001-02-27', 'ratko.đokic', '$2a$10$ZSGURmWjbPNm9nb0zGWbAuG5xvs/bXlmN7QVY1kfyr.7E2ErXoNBy', 'CLIENT', 'ratko.đokic@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (15, 'Milena', 'Golubović', '1983-06-13', 'milena.golubovic', '$2a$10$E5LITVjVjyGmuMD2myxZ8OswU488tW/QZICOLhN2H.BfMAtd4bcFO', 'CLIENT', 'milena.golubovic@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (16, 'Dragana', 'Andrić', '1982-06-25', 'dragana.andric', '$2a$10$8C6/Sryv6Lr6YjfU4BRZXuFoQi0fE8E3OMxhzBV/dDDA9mzQOCIpO', 'CLIENT', 'dragana.andric@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (17, 'Tijana', 'Đokić', '2001-11-09', 'tijana.đokic', '$2a$10$kxhDcF7.Vq54u0ZzdB0t7.tAnmoDfWs4du2./RZkBwwqryoSczjgy', 'CLIENT', 'tijana.đokic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (18, 'Milica', 'Perić', '1994-11-07', 'milica.peric', '$2a$10$bx6N.4WlYnswYap3S.DFVOHGAxBBOcT.bj979ZdK23TSufWhuLAzi', 'CLIENT', 'milica.peric@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (19, 'Jovana', 'Golubović', '2004-08-13', 'jovana.golubovic', '$2a$10$YTUl4uQljoTp9g/9rLTBIOUxsWDWvvUZ7Bu.r5xqHCogtz/bXAEQS', 'CLIENT', 'jovana.golubovic@mail.com', true, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (20, 'Stojanka', 'Ratković', '1997-01-11', 'stojanka.ratkovic1', '$2a$10$1y9Iust8K8/34JmhN7Fx6Oj5zBmwmk8bxg0idQ53x4sF1ZO/Hgrre', 'CLIENT', 'stojanka.ratkovic1@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (21, 'Gorana', 'Dučić', '1996-07-18', 'gorana.ducic', '$2a$10$fXgfB.b8IJU3eBTDCnkzdOQaqiEXgDsaNSpHDJjuukuZrFNzajxj6', 'CLIENT', 'gorana.ducic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (22, 'Anja', 'Savić', '1988-04-03', 'anja.savic', '$2a$10$9Wip/JSOSL/SQKHIXeq2CeHZOZA8cN/31sjz0eVzSHi2eRRxAS4SS', 'CLIENT', 'anja.savic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (23, 'Vida', 'Đokić', '1993-11-18', 'vida.đokic', '$2a$10$J14eC98lVLWp8SCffcV85OJRTiHIblY.dAPYoGQQ4dLLZX65kYeVK', 'CLIENT', 'vida.đokic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (24, 'Igor', 'Jović', '1981-04-12', 'igor.jovic', '$2a$10$eFLeueSjEmgD3A9P8HQtXOxXObidN1azCj1.lmQtW6U6aDCT4aQb2', 'CLIENT', 'igor.jovic@mail.com', true, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (25, 'Ana', 'Ratković', '1982-12-15', 'ana.ratkovic', '$2a$10$sZSyc.lM7AmTLYeBLqERvOkRLNGIetdAxMqEFKs2fFQNeaNJrccXq', 'CLIENT', 'ana.ratkovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (26, 'Ljiljana', 'Jovanović', '2000-04-14', 'ljiljana.jovanovic', '$2a$10$OXLKkwXoqEZZVRMVqk8lzOX1Wa3YhyM4xWvFNk.T2odLtiQBbUi7S', 'CLIENT', 'ljiljana.jovanovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (27, 'Stojanka', 'Golubović', '1996-04-03', 'stojanka.golubovic', '$2a$10$y.EQamUQHF.wPhDZFdpDc.h/ZRQbGIgAqcHOUnRYRqLQpFLW7yOEa', 'CLIENT', 'stojanka.golubovic@mail.com', false, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (28, 'Teodor', 'Mihajlović', '1981-07-16', 'teodor.mihajlovic', '$2a$10$1o3YLb3dQjzmvlYsDdvOMeKgINm5hE40l9s50L6TCH0WAvyN3NGE.', 'CLIENT', 'teodor.mihajlovic@mail.com', false, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (29, 'Jovica', 'Nedeljković', '1984-05-24', 'jovica.nedeljkovic', '$2a$10$6PxqjpsM0F6vNOkBozNT..Y0afkr1uNapmqdQlpYsLRrN2ukuIxw6', 'CLIENT', 'jovica.nedeljkovic@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (30, 'Jovan', 'Jovanović', '1980-07-18', 'jovan.jovanovic', '$2a$10$GzeXi8pcbW1srcSIyokb5eRUCqxWrRUCJRmLMyuzSYRmonAYen2jG', 'CLIENT', 'jovan.jovanovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (31, 'Jovana', 'Perić', '2002-05-06', 'jovana.peric', '$2a$10$bIT9kTDh2uL8PAfJymyPPOT9XU6DQEVsgPqtMHuCHUWyz.eOv9bbO', 'CLIENT', 'jovana.peric@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (32, 'Vanja', 'Mihajlović', '1988-04-28', 'vanja.mihajlovic', '$2a$10$pF/bbuNHZLA52Fd8pyeJE.SDhvsCly0RVQ/tMoL0M42QxPjMAvfFC', 'CLIENT', 'vanja.mihajlovic@mail.com', true, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (33, 'Tamara', 'Nedeljković', '1988-07-25', 'tamara.nedeljkovic', '$2a$10$G7/1s7d5gcIamflaFg4hEeNuxRoj2ch5DT50yfEO8Vk19X1BeC5M6', 'CLIENT', 'tamara.nedeljkovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (34, 'Ratko', 'Dučić', '1995-10-02', 'ratko.ducic', '$2a$10$GkQo5DwKssk5INOMxz0n1e67tqED/73kF.bb1UY1hQhXAYkHCniAS', 'CLIENT', 'ratko.ducic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (35, 'Ratko', 'Jovanović', '1999-08-02', 'ratko.jovanovic', '$2a$10$sUj.lflocpLxJxJ0P4q59OdYTst1gxh3ZOnaxE1t7sbqyf0D/eqeK', 'CLIENT', 'ratko.jovanovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (36, 'Emilija', 'Stevanović', '1995-10-07', 'emilija.stevanovic', '$2a$10$GOV2dPdvcNhaj2wAFbe6ROO0AfuwIE/h1oI0qz6gsCRfYqQg/tiW2', 'CLIENT', 'emilija.stevanovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (37, 'Aleksandar', 'Mitrović', '2004-03-13', 'aleksandar.mitrovic', '$2a$10$7ci1chcOCc0z3dw/InKFau1RD5WWJzgG6u5y4jbrR6MTRI3JsOwsS', 'CLIENT', 'aleksandar.mitrovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (38, 'Mirjana', 'Savić', '1995-02-03', 'mirjana.savic', '$2a$10$iXbXjIR5oGfVcq7At4ZjJOLO2y9AJnS4VKv1GkDEy7QK8FNjJZk3O', 'CLIENT', 'mirjana.savic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (39, 'Pero', 'Maksimović', '1988-08-19', 'pero.maksimovic', '$2a$10$9CLsTGDvRmXBQ7AfHgxrg.ZHmW245sz/Olj5LcL5122QPuNJh9ER.', 'CLIENT', 'pero.maksimovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (40, 'Tatjana', 'Savić', '1982-07-09', 'tatjana.savic', '$2a$10$B1Ls.W.FKxI/x.pp0qrns.92KTkCBH.Heaq2zDIYq47jQx7vf1BcO', 'CLIENT', 'tatjana.savic@mail.com', false, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (41, 'Miodrag', 'Dujlović', '2004-02-18', 'miodrag.dujlovic', '$2a$10$6857Ypm9V0D27dzJdJsfaORsIr6EhYwpn8pi43BetVDupSaD0yp1a', 'CLIENT', 'miodrag.dujlovic@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (42, 'Perica', 'Mirić', '1989-01-14', 'perica.miric', '$2a$10$wxh1HbnxSS2xZ8.B1I9eTuInmGNvEChhUI5mAwDlDYcvKh7Ezr/2m', 'CLIENT', 'perica.miric@mail.com', true, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (43, 'Sanja', 'Mirić', '1991-08-28', 'sanja.miric', '$2a$10$EFzTphJOmjqsYBiPADwVpuOkyMLhBBs0eFoxN7Qrr9hYY.MnwxGny', 'CLIENT', 'sanja.miric@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (44, 'Aleksandar', 'Radovanović', '1989-03-20', 'aleksandar.radovanovic', '$2a$10$ZNBm6GqE9.GV9WWUS5bhMOfSvyc0e52td3ZBWjrjeZPyNPu3KWxYm', 'CLIENT', 'aleksandar.radovanovic@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (45, 'Gorana', 'Dejanović', '1989-01-25', 'gorana.dejanovic', '$2a$10$Fa.lQWU3HQcBlG2aRaKshe/D7FRwHTSN/6NYTXRInEjvHJ7po3JO6', 'CLIENT', 'gorana.dejanovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (46, 'Stojanka', 'Dučić', '1994-04-01', 'stojanka.ducic', '$2a$10$TWfUB6Bx7DQv8uzUqntbCOTf38yXf.ywZFiNApgKdzmR5fB1CBqka', 'CLIENT', 'stojanka.ducic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (47, 'Martina', 'Golubović', '1996-06-27', 'martina.golubovic', '$2a$10$M9YRiKonQ/9CY.UL0aze/.puGEW1c1aKjwaCAmp9lCQIgkr8Da32q', 'CLIENT', 'martina.golubovic@mail.com', true, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (48, 'Miodrag', 'Savanović', '1980-08-19', 'miodrag.savanovic', '$2a$10$hSmp0tnzL30yRkFZHkr75O1lvU..ycu6lB8K9ju2BopMi5IQv0I4.', 'CLIENT', 'miodrag.savanovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (49, 'Gorana', 'Dejanović', '1980-04-04', 'gorana.dejanovic1', '$2a$10$gcwcjSRs6z4lOz0NVTqDCun9a4kP5wfR7S1OVGvIFwVIwSK03JWqG', 'CLIENT', 'gorana.dejanovic1@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (50, 'Katarina', 'Perić', '1997-03-25', 'katarina.peric', '$2a$10$udHLjlWmT4T7atXsFp2XpekGjr6LqxI5yvFTTsB0FeKkkqYjhYNay', 'CLIENT', 'katarina.peric@mail.com', true, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (51, 'Vanja', 'Perić', '1982-11-02', 'vanja.peric', '$2a$10$GAszPgy94nbfizsH8P0lkOVWWw4JUDrsP4ghKrazTnbEK8ucAxHv2', 'CLIENT', 'vanja.peric@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (52, 'Perica', 'Savić', '1983-12-10', 'perica.savic', '$2a$10$zO0Pq.iqHgHZWDnHFuD6qewjwQqMsCYIp0HatCqx8G2825.wJn6ri', 'CLIENT', 'perica.savic@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (53, 'Simo', 'Stevanović', '1986-06-16', 'simo.stevanovic', '$2a$10$aZxEVC.QU7v1MZKyhFsDFu42O0okuQY1he7.2pCrqChSat2bO4dvu', 'CLIENT', 'simo.stevanovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (54, 'Aleksandar', 'Maksimović', '1994-04-27', 'aleksandar.maksimovic1', '$2a$10$vz7AYua4LvmBwUZR.r3eD.Z2wEg9zKQrcGk3wOoOa8a2VyzjxRAT.', 'CLIENT', 'aleksandar.maksimovic1@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (55, 'Milena', 'Mihailović', '1982-09-11', 'milena.mihailovic', '$2a$10$Aw9Q0W4.SNcX8mChzvOere/r1FzkcOA/IGACX7AT3Iy/QIlMRPzBK', 'CLIENT', 'milena.mihailovic@mail.com', false, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (56, 'Teodor', 'Dučić', '1995-02-05', 'teodor.ducic', '$2a$10$r9EEdUTFYcZ71ra0imWAd.JYNHBRhL/Nn8c5tGbF8T1dgJVmJZJUq', 'CLIENT', 'teodor.ducic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (57, 'Vesna', 'Mitrović', '1990-01-06', 'vesna.mitrovic', '$2a$10$58xilvZNF.lvQX844nyHIeyA5zFK6n9Vpit0oAcdvfzFSBGJoYgQK', 'CLIENT', 'vesna.mitrovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (58, 'Pero', 'Dučić', '1993-12-14', 'pero.ducic', '$2a$10$oqTx1g0fduvJMEICv.Uk3eiOcZVEMaf65IHE.uMG4GGw7wp58xdgi', 'CLIENT', 'pero.ducic@mail.com', false, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (59, 'Stefan', 'Andrić', '2002-05-22', 'stefan.andric', '$2a$10$OHQ.0sXyWefQTQJ3hqFG8.gnH/SUMzGME1euCKO3LXYmYv4rR4XK2', 'CLIENT', 'stefan.andric@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (60, 'Mihajlo', 'Radovanović', '1992-11-01', 'mihajlo.radovanovic', '$2a$10$MFABQ2JHx0wjeB4qT20Pj.UAfVBiEw.N3UXLDRM1DW1nzWKQZmySG', 'CLIENT', 'mihajlo.radovanovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (61, 'Stoja', 'Ratković', '1988-03-24', 'stoja.ratkovic', '$2a$10$uOxmxFOFwVhUGMgW19NwuOiIkalt.54NI./KECSTNgr.lskMYfdfe', 'CLIENT', 'stoja.ratkovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (62, 'Zoran', 'Mirić', '1994-05-10', 'zoran.miric', '$2a$10$SWwEtNtknsM6YdYChs2Vr.pG7B/Bb9AmuIs7k/c233dqQ35fZcnoK', 'CLIENT', 'zoran.miric@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (63, 'Tijana', 'Martinović', '2002-11-27', 'tijana.martinovic1', '$2a$10$bZpHFPaFmWAsQIQWUJcWy.tbm0SEuoMVopL4YL4JOeYLeVY9EN9Te', 'CLIENT', 'tijana.martinovic1@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (64, 'Aleksandar', 'Perić', '1985-12-02', 'aleksandar.peric', '$2a$10$29yRpZjkAHR891cXlY5wWeOG.zvRtZWoQT.8/Z/U8uaT5IvT2AnG2', 'CLIENT', 'aleksandar.peric@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (65, 'Ljiljana', 'Nedeljković', '1983-03-18', 'ljiljana.nedeljkovic', '$2a$10$z5zpejw7DjbHWSFXEaUh.uubYf9kP/U7YIF6U6qA4Af4d3NsQXl46', 'CLIENT', 'ljiljana.nedeljkovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (66, 'Strahinja', 'Maksimović', '1980-06-09', 'strahinja.maksimovic', '$2a$10$B5bf5xgaNqUzCetY6jpkB.54esn9Geh3Z2k5RyfkCf3mOIXkcx0jy', 'CLIENT', 'strahinja.maksimovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (67, 'Slađana', 'Ratković', '1980-10-25', 'slađana.ratkovic', '$2a$10$ZCg/92iCNSwUhV/y6TeqvOK9jJO5BbBMt5w.fwXp6GsKgrbd8dvRy', 'CLIENT', 'slađana.ratkovic@mail.com', true, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (68, 'Emilija', 'Dejanović', '1983-06-13', 'emilija.dejanovic', '$2a$10$JMcefFVi9D.CMMsS7rG.iONnkrkhPDnXcj1GxEBjoDyveJo226Y7G', 'CLIENT', 'emilija.dejanovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (69, 'Mitra', 'Maksimović', '2001-12-01', 'mitra.maksimovic', '$2a$10$87rc/SfU3uyFoNmp71qoTORyXOGTKeiTiW.ldeSPRvatQ6cDdzwDO', 'CLIENT', 'mitra.maksimovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (70, 'Manja', 'Jovanović', '1982-08-26', 'manja.jovanovic', '$2a$10$8D4C1N9IIlc5.qC8MFQMDuywOq/a7I/eu1P5LWXFOm79Fjen8Q1fm', 'CLIENT', 'manja.jovanovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (71, 'Simo', 'Dučić', '1981-01-02', 'simo.ducic', '$2a$10$LiN/IbQCH7GnW.RiTgg43OFMWes/.bxeZV/8skOJ3mDe9TnXcR8/i', 'CLIENT', 'simo.ducic@mail.com', true, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (72, 'Milica', 'Radovanović', '1987-08-08', 'milica.radovanovic', '$2a$10$83F3uh8Ts96MnscVNMKcFeaIq.u9hvOkBfFjRyg8zPEILvtat7RCq', 'CLIENT', 'milica.radovanovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (73, 'Strahinja', 'Jović', '1981-12-11', 'strahinja.jovic', '$2a$10$DBb14pUSs0Vx.V2FO/4bJei/5JOH93bo3ljCEHpdKUXu3bQEkZPly', 'CLIENT', 'strahinja.jovic@mail.com', false, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (74, 'Dejan', 'Jović', '2005-05-04', 'dejan.jovic', '$2a$10$LshIaKauAMYb59Ib44BmN.R6nnAx6RrafblR1tT4a4wiiRzzWPmB2', 'CLIENT', 'dejan.jovic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (75, 'Tatjana', 'Đokić', '1981-01-15', 'tatjana.đokic', '$2a$10$h/HVzZdY1YzBe9pzhsbJM.gz43qSLOWSIoGGO7aSymminPa/DGQTq', 'CLIENT', 'tatjana.đokic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (76, 'Manja', 'Golubović', '2004-05-01', 'manja.golubovic', '$2a$10$kf59ZVWXpPajRhUovptsmuZdDOrGDoJ1DH038oz6dLV/AqjbIlt3m', 'CLIENT', 'manja.golubovic@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (77, 'Tanja', 'Dučić', '1991-05-15', 'tanja.ducic', '$2a$10$0QdLLXlK3efJJWyoQidvCOxlSxjCNQ2okzEWzuPNYrmVAn.zl.pwm', 'CLIENT', 'tanja.ducic@mail.com', false, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (78, 'Tijana', 'Savić', '2004-06-04', 'tijana.savic', '$2a$10$wPGribSls/m8CUMSv79Ob.lK4rqfYQzSkbUi5b4GAQcqyw9D18CNC', 'CLIENT', 'tijana.savic@mail.com', false, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (79, 'Zoran', 'Savić', '1987-05-19', 'zoran.savic', '$2a$10$itf7KVePva.xqnzs2yrOqeaGUW3krqxkHxSfa3DLV2K9H0Ktga182', 'CLIENT', 'zoran.savic@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (80, 'Kristijan', 'Mitrović', '1998-06-06', 'kristijan.mitrovic', '$2a$10$zXqxNnhcK0SD14A/9FE5mON7y2/g84hoBZQe2R1LMVy/1uJpVHo5m', 'CLIENT', 'kristijan.mitrovic@mail.com', false, true, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (81, 'Manja', 'Jović', '1998-03-12', 'manja.jovic', '$2a$10$Bq6Fk4InsnzstizgD6tv9uNAfB5AFRg6UoKXBfIfJYd8yyLqsLjcC', 'CLIENT', 'manja.jovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (82, 'Vida', 'Mirić', '1982-10-21', 'vida.miric', '$2a$10$C8D5HHcWHmSqk88scKYJTe2Fe3WahrKMSQVor1Tq/LtsYIM61uY.K', 'CLIENT', 'vida.miric@mail.com', true, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (83, 'Sanja', 'Mitrović', '1996-06-13', 'sanja.mitrovic', '$2a$10$uJGk.3/QGCxI7I2WBOsZ2utBn/GNdiYxIHAdOjioI1gC3aN9Oidte', 'CLIENT', 'sanja.mitrovic@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (84, 'Gordana', 'Kočić', '1987-09-18', 'gordana.kocic', '$2a$10$2Lw8w63DJhqnnjuhVRDwXe42CFnAIVDZgLDah1nDqJmz.ZqJ2o.o2', 'CLIENT', 'gordana.kocic@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (85, 'Simo', 'Jovanović', '1987-02-02', 'simo.jovanovic', '$2a$10$So52N.0MtarWu3S.uQCB5eENLoMh4ONjXJJFw4nGVOqJAgkllLBFC', 'CLIENT', 'simo.jovanovic@mail.com', true, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (86, 'Stojanka', 'Dujlović', '1983-06-16', 'stojanka.dujlovic', '$2a$10$yi5Hd7MD.qqH6ck4tlKdbelefP/wVT5G0mSz25Sj7yTd2BqyvSfT2', 'CLIENT', 'stojanka.dujlovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (87, 'Danijela', 'Dučić', '1980-10-04', 'danijela.ducic', '$2a$10$lHL3/DzMNUnOXaH7oT8ubOPBitpW/UAvFIrOGaACmIhh0LPDT5Uu2', 'CLIENT', 'danijela.ducic@mail.com', false, true, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (88, 'Stefan', 'Jovanović', '1997-08-19', 'stefan.jovanovic', '$2a$10$LuQUm0EZJcAtAh8vZv1z0.BIQOGBh2upOauWu.BAf/9yoPYUSja0a', 'CLIENT', 'stefan.jovanovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (89, 'Tamara', 'Kočić', '1988-10-02', 'tamara.kocic', '$2a$10$JGADXTHTCZAU7R.tU/EluOhJsCxkBu7bwYtuEJdhXo9W.WqEsg6Oe', 'CLIENT', 'tamara.kocic@mail.com', false, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (90, 'Gorana', 'Đokić', '2003-01-10', 'gorana.đokic', '$2a$10$37jW1gxSO1NrXCbfwpcLQuw9dQaGt7dfEhl/sOBy31cbiy9aM9odq', 'CLIENT', 'gorana.đokic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (91, 'Danijel', 'Mihailović', '1983-03-15', 'danijel.mihailovic', '$2a$10$.Ew5THie3oh0ceaghu2owuinlywHMPF1Em8/9nu9s7UaWsB.fB4Cq', 'CLIENT', 'danijel.mihailovic@mail.com', false, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (92, 'Mara', 'Radovanović', '1995-06-21', 'mara.radovanovic', '$2a$10$yhteYYnsc1KAec3BpTNvhe9JJEiW3Bm6vgV/V5sNdqB/95lr2dzVa', 'CLIENT', 'mara.radovanovic@mail.com', true, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (93, 'Zoran', 'Petrović', '1988-12-26', 'zoran.petrovic', '$2a$10$79P9PlHPqpW0bpwZlpcm2..pj7Snb4vAnvR8ENtSkcC4uxdbFBo0y', 'CLIENT', 'zoran.petrovic@mail.com', false, false, true, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (94, 'Vesna', 'Nedeljković', '1997-10-25', 'vesna.nedeljkovic', '$2a$10$oROVWF8sYtlxs3.coiQAje.iV7F2bqvjcc08sNmg8NwL9S2IB8Wau', 'CLIENT', 'vesna.nedeljkovic@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (95, 'Tanja', 'Mitrović', '1998-02-16', 'tanja.mitrovic', '$2a$10$EmysbtE1ZvpynVDYPzhBE.v.Nypo2QlnXm3vhaCZqlA8.DIl7NnyC', 'CLIENT', 'tanja.mitrovic@mail.com', false, false, false, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (96, 'Katarina', 'Savanović', '2004-10-21', 'katarina.savanovic', '$2a$10$0H./38xMriJJwknQTmuP/ObyWL9QGB66RxuWB1WqYMggQVfcvLVHq', 'CLIENT', 'katarina.savanovic@mail.com', false, false, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (97, 'Simo', 'Stevanović', '1991-07-10', 'simo.stevanovic1', '$2a$10$PDLy3tXshrd2gThoUDWBTuIGVu6Si.koU2lClqPrLwKGjKDPMUscm', 'CLIENT', 'simo.stevanovic1@mail.com', false, true, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (98, 'Mladen', 'Dejanović', '1981-07-26', 'mladen.dejanovic', '$2a$10$Ao/ybLTfOsRKQFHlPVJ9beT9EFi1R3dQeIgpTAEJgYSc4mre214yG', 'CLIENT', 'mladen.dejanovic@mail.com', true, true, false, true);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (99, 'Anja', 'Perić', '1997-12-02', 'anja.peric', '$2a$10$q78Ei9owHvZlYGNMB9cAEuyKocSK0xWN4DmDhhvWvkJDdFURZPxkm', 'CLIENT', 'anja.peric@mail.com', false, false, true, false);
INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) VALUES (100, 'Teodor', 'Radovanović', '1985-12-25', 'teodor.radovanovic', '$2a$10$0sUSpPqXzGjy32Up9oUoBewKCxb6w8PoKtGnEN5NpCI.qmpiE1xHK', 'CLIENT', 'teodor.radovanovic@mail.com', true, true, false, true);



/*meal_type*/
INSERT IGNORE INTO meal_type (id, name, ordinal) VALUES (1, 'Doručak', 1);
INSERT IGNORE INTO meal_type (id, name, ordinal) VALUES (2, 'Jutarnja užina', 2);
INSERT IGNORE INTO meal_type (id, name, ordinal) VALUES (3, 'Ručak', 3);
INSERT IGNORE INTO meal_type (id, name, ordinal) VALUES (4, 'Večernja užina', 4);
INSERT IGNORE INTO meal_type (id, name, ordinal) VALUES (5, 'Večera', 5);

/*menu_type*/
INSERT IGNORE INTO menu_type (id, name) VALUES (1, 'Redukcijska dijeta');
INSERT IGNORE INTO menu_type (id, name) VALUES (2, 'Jelovnik za dobijanje mase');
INSERT IGNORE INTO menu_type (id, name) VALUES (3, 'Detoksikaconi jelovnik');
INSERT IGNORE INTO menu_type (id, name) VALUES (4, 'Medicinski prilagođen jelovnik');

/*symptoms*/
INSERT IGNORE INTO symptom (id, name) VALUES (1, 'nadutost donjeg dijela stomaka');
INSERT IGNORE INTO symptom (id, name) VALUES (2, 'nadutost gornjeg dijela stomaka');
INSERT IGNORE INTO symptom (id, name) VALUES (3, 'nadutost cijelog abdomena');
INSERT IGNORE INTO symptom (id, name) VALUES (4, 'žgaravica');
INSERT IGNORE INTO symptom (id, name) VALUES (5, 'podrigivanje');
INSERT IGNORE INTO symptom (id, name) VALUES (6, 'opstipacija');
INSERT IGNORE INTO symptom (id, name) VALUES (7, 'dijareja');
INSERT IGNORE INTO symptom (id, name) VALUES (8, 'gasovi nakon obroka');
INSERT IGNORE INTO symptom (id, name) VALUES (9, 'pad energije');
INSERT IGNORE INTO symptom (id, name) VALUES (10, 'umor');
INSERT IGNORE INTO symptom (id, name) VALUES (11, 'pospanost');
INSERT IGNORE INTO symptom (id, name) VALUES (12, 'glavobolja');
INSERT IGNORE INTO symptom (id, name) VALUES (13, 'aritmija');
INSERT IGNORE INTO symptom (id, name) VALUES (14, 'zamućen vid');
INSERT IGNORE INTO symptom (id, name) VALUES (15, 'povećana želja za slatkišima');
INSERT IGNORE INTO symptom (id, name) VALUES (16, 'povećana želja za slanom hranom');

/*Ingredient*/
INSERT IGNORE INTO ingredient (id, name) VALUES (1, 'hljeb,integralni');
INSERT IGNORE INTO ingredient (id, name) VALUES (2, 'humus');
INSERT IGNORE INTO ingredient (id, name) VALUES (3, 'salata po izboru');
INSERT IGNORE INTO ingredient (id, name) VALUES (4, 'suncokratove sjemenke');
INSERT IGNORE INTO ingredient (id, name) VALUES (5, 'puter');
INSERT IGNORE INTO ingredient (id, name) VALUES (6, 'med');
INSERT IGNORE INTO ingredient (id, name) VALUES (7, 'banana');
INSERT IGNORE INTO ingredient (id, name) VALUES (8, 'suncokretove sjemenke');
INSERT IGNORE INTO ingredient (id, name) VALUES (9, 'grašak');
INSERT IGNORE INTO ingredient (id, name) VALUES (10, 'luk');
INSERT IGNORE INTO ingredient (id, name) VALUES (11, 'mrkva');
INSERT IGNORE INTO ingredient (id, name) VALUES (12, 'celer');
INSERT IGNORE INTO ingredient (id, name) VALUES (13, 'piletina');
INSERT IGNORE INTO ingredient (id, name) VALUES (14, 'hljeb');
INSERT IGNORE INTO ingredient (id, name) VALUES (15, 'voćka');
INSERT IGNORE INTO ingredient (id, name) VALUES (16, 'jabuka');
INSERT IGNORE INTO ingredient (id, name) VALUES (17, 'bademi');

INSERT IGNORE INTO ingredient (id, name) VALUES (18, 'zobene pahuljice');
INSERT IGNORE INTO ingredient (id, name) VALUES (19, 'orašasti plodovi');
INSERT IGNORE INTO ingredient (id, name) VALUES (20, 'oslić');
INSERT IGNORE INTO ingredient (id, name) VALUES (21, 'krompir');
INSERT IGNORE INTO ingredient (id, name) VALUES (22, 'tunjevina');
INSERT IGNORE INTO ingredient (id, name) VALUES (23, 'zelena salata');
INSERT IGNORE INTO ingredient (id, name) VALUES (24, 'šumsko voće');
INSERT IGNORE INTO ingredient (id, name) VALUES (25, 'tikvice');
INSERT IGNORE INTO ingredient (id, name) VALUES (26, 'leblebije');
INSERT IGNORE INTO ingredient (id, name) VALUES (27, 'jogurt');
INSERT IGNORE INTO ingredient (id, name) VALUES (28, 'avokado');
INSERT IGNORE INTO ingredient (id, name) VALUES (29, 'pureći narezak');
INSERT IGNORE INTO ingredient (id, name) VALUES (30, 'zeleni čaj');
INSERT IGNORE INTO ingredient (id, name) VALUES (31, 'limun');
INSERT IGNORE INTO ingredient (id, name) VALUES (32, 'paradajz');
INSERT IGNORE INTO ingredient (id, name) VALUES (33, 'mješavina povrća');
INSERT IGNORE INTO ingredient (id, name) VALUES (34, 'sirni namaz');

/*ingredient_quantity*/
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (1, '105', 'g', 1, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (2, '105', 'g', 1, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (3, '105', 'g', 1, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (4, '105', 'g', 1, 8);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (5, '2', 'g', 2, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (6, '2', 'g', 2, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (7, '2', 'g', 2, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (8, '2', 'g', 2, 8);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (9, '150', 'g', 3, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (10, '150', 'g', 3, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (11, '150', 'g', 3, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (12, '150', 'g', 3, 8);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (13, '8', 'g', 4, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (14, '8', 'g', 4, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (15, '8', 'g', 4, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (16, '8', 'g', 4, 8);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (17, '5', 'g', 5, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (18, '5', 'g', 5, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (19, '5', 'g', 5, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (20, '5', 'g', 5, 8);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (21, '8', 'g', 6, 1);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (22, '8', 'g', 6, 5);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (23, '8', 'g', 6, 7);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (24, '8', 'g', 6, 8);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (25, '154', 'g', 7, 2);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (26, '154', 'g', 7, 6);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (30, '16', 'g', 8, 2);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (31, '16', 'g', 8, 6);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (32, '180', 'g', 9, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (33, '50', 'g', 10, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (34, '100', 'g', 11, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (35, '50', 'g', 12, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (36, '150', 'g', 13, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (37, '35', 'g', 14, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (38, '220', 'g', 15, 3);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (39, '220', 'g', 16, 4);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (40, '18', 'g', 17, 4);


INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (41, '100', 'g', 18, 9);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (42, '50', 'g', 15, 9);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (43, '30', 'g', 19, 10);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (44, '100', 'g', 20, 11);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (45, '70', 'g', 21, 11);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (46, '20', 'g', 10, 11);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (47, '100', 'g', 1, 12);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (48, '100', 'g', 22, 12);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (49, '50', 'g', 23, 12);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (50, '100', 'g', 27, 13);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (51, '100', 'g', 24, 13);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (52, '200', 'g', 16, 14);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (53, '300', 'g', 25, 15);

INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (54, '300', 'g', 26, 16);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (55, '70', 'g', 32, 16);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (56, '60', 'g', 31, 16);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (57, '60', 'g', 27, 17);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (58, '60', 'g', 18, 17);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (59, '100', 'g', 7, 18);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (60, '300', 'g', 13, 19);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (61, '150', 'g', 33, 19);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (62, '100', 'g', 1, 20);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (63, '200', 'g', 28, 20);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (64, '100', 'g', 1, 21);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (65, '90', 'g', 29, 21);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (66, '30', 'g', 34, 21);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (67, '200', 'g', 16, 22);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (68, '20', 'g', 6, 22);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (69, '30', 'g', 17, 22);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (70, '250', 'g', 13, 23);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (71, '300', 'g', 25, 23);
INSERT IGNORE INTO ingredient_quantity (id, value, unit, ingredient_id, meal_in_menu_id) VALUES (72, '100', 'g', 16, 24);

/*Meal*/
INSERT IGNORE INTO meal (id, name, description) VALUES (1, 'Integralni hljeb sa humusom', 'Dvije snite hljeba namazati humusom');
INSERT IGNORE INTO meal (id, name, description) VALUES (2, 'Banana i sjemenke suncokreta', 'Sve sastojke pomjesati');
INSERT IGNORE INTO meal (id, name, description) VALUES (3, 'Paprikas sa graskom i mesom', 'Jesti uz jednu snitu hljeba');
INSERT IGNORE INTO meal (id, name, description) VALUES (4, 'Voce i bademi', '');

INSERT IGNORE INTO meal (id, name, description) VALUES (5, 'Zobena kaša sa voćem', 'Skuvati zobene pahuljice i dodati svježe voće po izboru');
INSERT IGNORE INTO meal (id, name, description) VALUES (6, 'Orašasti plodovi', 'Izmješati tri vrste orašastih plodova');
INSERT IGNORE INTO meal (id, name, description) VALUES (7, 'Pohovani oslić i krompir salata', 'Oslić ispržiti, servirati uz kuvani krompir sa crvenim lukom');
INSERT IGNORE INTO meal (id, name, description) VALUES (8, 'Sendvič sa tunjevinom', 'Integralno pecivo, tunjevina i zelena salata');
INSERT IGNORE INTO meal (id, name, description) VALUES (9, 'Smoothie sa šumskim voćem', 'Izblendati jogurt i šumsko voće');
INSERT IGNORE INTO meal (id, name, description) VALUES (10, 'Zelena jabuka', 'Jedna veća zelena jabuka');
INSERT IGNORE INTO meal (id, name, description) VALUES (11, 'Čorba od tikvica', 'Tikvice propržiti i kuvati u povrtnom temeljcu');
INSERT IGNORE INTO meal (id, name, description) VALUES (12, 'Salata sa leblebijama', 'Leblebije, paradajz i limunov sok');
INSERT IGNORE INTO meal (id, name, description) VALUES (13, 'Jogurt sa ovsenim pahuljicama', 'Pahuljice preliti jogurtom i ostaviti 5 minuta');
INSERT IGNORE INTO meal (id, name, description) VALUES (14, 'Banana', 'Jedna banana');
INSERT IGNORE INTO meal (id, name, description) VALUES (15, 'Pileća supa sa povrćem', 'Kuvati piletinu i povrće dok sve ne omekša');
INSERT IGNORE INTO meal (id, name, description) VALUES (16, 'Avokado tost', 'Tost premazati namazom od avokada');
INSERT IGNORE INTO meal (id, name, description) VALUES (17, 'Tost sendvič sa puretinom', 'Tost sendvič sa puretinom, listom salate i sirnim namazom');
INSERT IGNORE INTO meal (id, name, description) VALUES (18, 'Kaša od jabuke', 'Jabuke izblendirati i posuti medom i cimetom ');
INSERT IGNORE INTO meal (id, name, description) VALUES (19, 'Musaka sa tikvicama', 'Pileće meso propržiti i zajedno sa tikvicama propržiti');
INSERT IGNORE INTO meal (id, name, description) VALUES (20, 'jabuka', 'Zelenu jabuku oguliti');

/*Measures*/
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (1, '2025-03-06', '84', '95', '100', '190', '81', 2);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (2, '2025-04-06', '88', '93', '98', '190', '88', 2);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (3, '2025-05-06', '85', '90', '96', '190', '85', 2);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (4, '2025-05-06', '90', '95', '100', '190', '90', 2);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (5, '2025-06-06', '90', '95', '100', '190', '90', 7);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (6, '2025-07-06', '60', '70', '75', '170', '65', 8);

INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (7, '2025-05-19', '85', '96', '99', '190', '88', 5);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (8, '2025-05-26', '84', '94', '97', '190', '86', 5);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (9, '2025-05-20', '61', '72', '70', '174', '63', 6);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (10, '2025-05-26', '59', '70', '69', '174', '92', 6);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (11, '2025-05-19', '91', '95', '100', '188', '90', 7);
INSERT IGNORE INTO measures (id, date, waist_circumference, stomach_circumference, hips_circumference, height, body_mass, user_id)
VALUES (12, '2025-05-19', '66', '74', '72', '169', '66', 8);

/*Food diary*/
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (1, '2025-03-06', 2);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (2, '2025-03-07', 2);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (3, '2025-03-08', 2);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (4, '2025-03-09', 3);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (5, '2025-01-01', 3);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (6, '2025-01-02', 3);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (7, '2025-02-06', 3);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (8, '2025-10-06', 4);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (9, '2025-10-07', 4);

INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (10, '2025-05-26', 5);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (11, '2025-05-26', 6);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (12, '2025-05-26', 7);
INSERT IGNORE INTO food_diary (id, date, user_id) VALUES (13, '2025-05-26', 8);

/*Menu*/
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (1, 'Jelovnik 7', 'Ponedeljak', 1, 2);
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (2, 'Jelovnik 8', 'Utorak', 2,2);
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (3, 'Jelovnik 7', 'Srijeda', 4,3);

INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (4, 'Jelovnik 9', 'Ponedeljak', 1, 5);
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (5, 'Jelovnik 10', 'Ponedeljak', 2, 6);
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (6, 'Jelovnik 11', 'Ponedeljak', 3, 7);
INSERT IGNORE INTO menu (id, name, day_in_week, menu_type_id, user_id) VALUES (7, 'Jelovnik 12', 'Ponedeljak', 4, 8);

/*Meal_in_menu*/
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (1, 1, 1, 1);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (2, 2, 2, 1);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (3, 3, 3, 1);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (4, 4, 4, 1);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (5, 1, 1, 2);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (6, 2, 2, 2);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (7, 2, 2, 3);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (8, 1,5, 3);

INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (9, 5, 1, 4);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (10, 6, 2, 4);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (11, 7, 3, 4);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (12, 8, 5, 4);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (13, 9, 1, 5);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (14, 10, 2, 5);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (15, 11, 3, 5);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (16, 12, 5, 5);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (17, 13, 1, 6);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (18, 14, 2, 6);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (19, 15, 3, 6);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (20, 16, 5, 6);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (21, 17, 1, 7);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (22, 18, 2, 7);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (23, 19, 3, 7);
INSERT IGNORE INTO meal_in_menu (id, meal_id, meal_type_id, menu_id) VALUES (24, 20, 5, 7);

/*Meal_in_menu_has_ingredient*/
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 2);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 3);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 4);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 5);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (1, 6);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (2, 7);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (2, 8);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 9);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 10);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 11);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 12);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 13);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 14);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (3, 15);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (4, 16);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (4, 17);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 2);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 3);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 4);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 5);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (5, 6);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (6, 7);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (6, 8);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 2);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 3);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 4);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 5);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (7, 6);

INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 2);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 3);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 4);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 5);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (8, 6);


INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (9, 18);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (9, 15);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (10, 19);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (11, 20);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (11, 21);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (11, 10);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (12, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (12, 22);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (12, 23);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (13, 27);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (13, 24);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (14, 16);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (15, 25);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (16, 26);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (16, 32);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (16, 31);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (17, 27);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (17, 18);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (18, 7);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (19, 13);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (19, 33);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (20, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (20, 28);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (21, 1);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (21, 29);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (21, 34);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (22, 16);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (22, 6);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (22, 17);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (23, 13);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (23, 25);
INSERT IGNORE INTO meal_in_menu_has_ingredient (meal_in_menu_id, ingredient_id) VALUES (24, 16);


/*meal_in_food_diary*/
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (1, '2025-03-06', '09:00:00', 'Obrok 1', 'ponedjeljak', 1, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (2, '2025-03-06', '12:00:00', 'Obrok 2', 'ponedjeljak', 1, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (3, '2025-03-06', '16:00:00', 'Obrok 3', 'ponedjeljak', 1, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (4, '2025-03-06', '19:00:00', 'Obrok 4', 'ponedjeljak', 1, 5);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (5, '2025-01-01', '09:00:00', 'Obrok 5', 'ponedjeljak', 5, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (6, '2025-01-01', '12:00:00', 'Obrok 6', 'ponedjeljak', 5, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (7, '2025-01-01', '16:00:00', 'Obrok 7', 'ponedjeljak', 5, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (8, '2025-01-01', '19:00:00', 'Obrok 8', 'ponedjeljak', 5, 5);

INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (9, '2025-05-26', '09:00:00', 'Obrok 9', 'ponedjeljak', 10, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (10, '2025-05-26', '12:00:00', 'Obrok 10', 'ponedjeljak', 10, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (11, '2025-05-26', '16:00:00', 'Obrok 11', 'ponedjeljak', 10, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (12, '2025-05-26', '19:00:00', 'Obrok 12', 'ponedjeljak', 10, 5);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (13, '2025-05-26', '09:00:00', 'Obrok 13', 'ponedjeljak', 11, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (14, '2025-05-26', '12:00:00', 'Obrok 14', 'ponedjeljak', 11, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (15, '2025-05-26', '16:00:00', 'Obrok 15', 'ponedjeljak', 11, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (16, '2025-05-26', '19:00:00', 'Obrok 16', 'ponedjeljak', 11, 5);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (17, '2025-05-26', '09:00:00', 'Obrok 17', 'ponedjeljak', 12, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (18, '2025-05-26', '12:00:00', 'Obrok 18', 'ponedjeljak', 12, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (19, '2025-05-26', '16:00:00', 'Obrok 19', 'ponedjeljak', 12, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (20, '2025-05-26', '19:00:00', 'Obrok 20', 'ponedjeljak', 12, 5);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (21, '2025-05-26', '09:00:00', 'Obrok 21', 'ponedjeljak', 13, 1);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (22, '2025-05-26', '12:00:00', 'Obrok 22', 'ponedjeljak', 13, 2);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (23, '2025-05-26', '16:00:00', 'Obrok 23', 'ponedjeljak', 13, 3);
INSERT IGNORE INTO meal_in_food_diary (id, date, time, name, day_in_week, food_diary_id, meal_type_id) VALUES (24, '2025-05-26', '19:00:00', 'Obrok 24', 'ponedjeljak', 13, 5);

/*meal_in_food_diary_has_symptom*/
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (1, 1);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (2, 2);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (3, 3);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (4, 4);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (5, 5);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (6, 6);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (7, 7);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (8, 8);

INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (9, 1);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (10, 6);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (11, 8);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (12, 7);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (13, 1);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (14, 2);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (15, 16);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (16, 3);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (17, 15);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (18, 11);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (19, 15);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (20, 12);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (21, 7);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (22, 14);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (23, 10);
INSERT IGNORE INTO meal_in_food_diary_has_symptom (meal_in_food_diary_id, symptom_id) VALUES (24, 9);

/*questionnaire_answers*/
INSERT IGNORE INTO questionnaire_answers (id, date, current_goal, daily_meals_number, non_consumed_groceries, mandatory_food, allergy_intolerance, supplementation, medical_condition, self_preparing_food, physical_activity_level, daily_activities, bedtime, user_id)
VALUES (1, '2025-03-26', 'Povećanje mišićne mase', 'pet puta', null, 'meso i jaja', null, null, null, null, null, null, 'Liježem u 23 č, ustajem u 7 č.', 2);

INSERT IGNORE INTO questionnaire_answers (id, date, current_goal, daily_meals_number, non_consumed_groceries, mandatory_food, allergy_intolerance, supplementation, medical_condition, self_preparing_food, physical_activity_level, daily_activities, bedtime, user_id)
VALUES
    (2, '2025-03-27', 'Mršavljenje', 'tri puta', 'slatkiši, gazirani sokovi', 'povrće i integralne žitarice', 'gluten', 'vitamin D', null, 'Sam pripremam većinu obroka', 'umjerena fizička aktivnost', 'sjedeći posao, povremene šetnje', 'Liježem u 22 č, ustajem u 6 č.', 2),

    (3, '2025-03-28', 'Održavanje trenutne težine', 'četiri puta', null, 'voće', null, null, null, null, 'niska fizička aktivnost', 'rad od kuće, rijetko izlazim', 'Liježem u 00 č, ustajem u 8 č.', 3),

    (4, '2025-03-29', 'Povećanje energije tokom dana', 'dva puta', 'meso', 'zeleni čaj i orašasti plodovi', 'laktoza', null, 'problemi sa štitnjačom', 'Ne pripremam sam obroke', 'blaga fizička aktivnost', 'puno hodanja na poslu', 'Liježem u 21 č, ustajem u 5 č.', 4),

    (5, '2025-04-01', 'Detoksikacija', 'tri puta', null, 'čajevi i voće', null, 'magnezijum', null, 'Pola obroka spremam sam', 'nema fizičke aktivnosti', 'domaćinstvo i briga o djeci', 'Liježem u 23:30, ustajem u 7:30', 5),

    (6, '2025-04-02', 'Povećanje mišićne mase', 'šest puta', 'mliječni proizvodi', 'meso, jaja i proteini', null, 'protein sirutke', null, 'Sam spremam obroke', 'intenzivni treninzi', 'teretana + fizički posao', 'Liježem u 22 č, ustajem u 6 č.', 6),

    (7, '2025-04-03', 'Regulacija šećera u krvi', 'tri puta', null, 'povrće i žitarice', null, null, 'dijabetes tip 2', 'Dijelim pripremu sa partnerom', 'umjerena fizička aktivnost', 'uredski posao, rekreativna šetnja', 'Liježem u 00 č, ustajem u 7 č.', 7),

    (8, '2025-04-04', 'Poboljšanje varenja', 'četiri puta', 'brza hrana', 'fermentisani proizvodi', 'orašasti plodovi', null, null, 'Sam pripremam obroke', 'blaga fizička aktivnost', 'studentski život, hodanje', 'Liježem u 01 č, ustajem u 9 č.', 8);
