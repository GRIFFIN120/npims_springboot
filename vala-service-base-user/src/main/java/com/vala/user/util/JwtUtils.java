package com.vala.user.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;

public class JwtUtils {

    public static final String TOKEN_LOGIN_NAME = "loginName";
    public static final String TOKEN_LOGIN_ID = "userId";
    public static final String TOKEN_SUCCESS = "success";
    public static final String TOKEN_FAIL = "fail";


    private static final long EXPIRE_TIME = 24*60*60*1000;


    private static final String TOKEN_SECRET = "lypwin";


    public static String sign(String username, Integer userId){

        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);

        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);

        HashMap<String, Object> header = new HashMap<>(2);

        header.put("typ","JWT");
        header.put("alg","HS256");

        return JWT.create().withHeader(header).withClaim(TOKEN_LOGIN_NAME, username)
                .withClaim(TOKEN_LOGIN_ID, userId).withExpiresAt(date).sign(algorithm);
    }

    public static String verity(String token){
        String result = TOKEN_SUCCESS;
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            result += jwt.getClaims().get(TOKEN_LOGIN_NAME).asString();
            return result;
        }catch (IllegalArgumentException e){
            return TOKEN_FAIL + e.getMessage();
        }catch (JWTVerificationException e){
            return TOKEN_FAIL + e.getMessage();
        }catch (Exception e){
            return TOKEN_FAIL + e.getMessage();
        }
    }

}
