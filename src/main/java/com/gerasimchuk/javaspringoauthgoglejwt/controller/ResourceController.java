package com.gerasimchuk.javaspringoauthgoglejwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/secured")
    public Resource getSecuredResource() {
        return new Resource("Secured resource");
    }

    @GetMapping("/unsecured")
    public Resource getUnsecuredResource() {
        return new Resource("Unsecured resource");
    }

    private record Resource(String message) {
    }
}
