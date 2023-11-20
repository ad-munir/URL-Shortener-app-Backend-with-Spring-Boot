package com.urlShortener.backend.controller;

import com.urlShortener.backend.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/url/shortner")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping
    public String getOriginUrl(String url){
        return urlService.getOriginUrl(url);
    }

    @PostMapping
    public String generateShortUrl(String url){
        return urlService.generateShortUrl(url);
    }
}
