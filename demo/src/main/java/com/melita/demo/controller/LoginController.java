package com.melita.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melita.demo.dto.responce.JwtRes;
import com.melita.demo.service.LoginService;

@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("login")
    public JwtRes login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        return loginService.validateUserAndGetToken(username, pwd);

    }
}