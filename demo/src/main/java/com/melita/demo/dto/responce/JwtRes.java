package com.melita.demo.dto.responce;

import lombok.Data;

@Data
public class JwtRes {

    String accessToken;
    Long expiresIn;

}
