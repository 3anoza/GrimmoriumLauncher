package com.i3anoza.grimmorium.launcher.server.commands.authentication;


import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Introspected
@Serdeable.Deserializable
public record AuthenticateRequest(String name, String password) {
}
