package com.zandolsi.examples.oauth2.server2server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ClientController {
    @Autowired
    private OAuth2RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, String> home() {

        Map<String, String> result = restTemplate.getForObject("http://localhost:8281", Map.class);
        result.put("client message", "client api");
        return result;
    }
}
