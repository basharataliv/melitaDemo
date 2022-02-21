package com.melita.demo.service;

import com.melita.demo.dto.responce.JwtRes;

public interface LoginService {

    JwtRes validateUserAndGetToken(String username, String pwd);

}
