package com.zandolsi.examples.oauth2.server2server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public Principal user(Principal user) {
        LOGGER.info("AS /user has been called");
        LOGGER.debug("user info: " + user.toString());
        return user;
    }
}
