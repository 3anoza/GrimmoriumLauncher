package com.i3anoza.grimmorium.launcher.server.controllers;

import com.i3anoza.grimmorium.launcher.server.commands.authentication.AuthenticateRequest;
import com.i3anoza.grimmorium.launcher.server.commands.authentication.AuthenticateResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.time.Clock;
import java.time.LocalDateTime;

@Controller("api/auth")
public class AuthController {

    public AuthController(){

    }

    @Post
    public HttpResponse<?> login(@Body AuthenticateRequest request) {
        return HttpResponse.ok(new AuthenticateResponse("token_value", LocalDateTime.now(Clock.systemUTC())));
    }
}
