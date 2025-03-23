package com.i3anoza.grimmorium.launcher.server.commands.authentication;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDateTime;

@Serdeable.Serializable
public record AuthenticateResponse(String accessToken, LocalDateTime expiresAtUtc) {
}
