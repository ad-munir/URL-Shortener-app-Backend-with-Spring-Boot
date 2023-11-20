package com.urlShortener.backend.controller;

import com.urlShortener.backend.entity.Url;
import com.urlShortener.backend.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/url/shortener")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping
    public String getOriginUrl(@RequestParam String url){
        return urlService.getOriginUrl(url);
    }

    @PostMapping
    public Url generateShortUrl(@RequestParam String url){
        return urlService.getShortUrl(url);
    }
}
