package com.urlShortener.backend.controller;

import com.urlShortener.backend.entity.Url;
import com.urlShortener.backend.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/shortener")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("url/{url}")
    public String getOriginUrl(@PathVariable String url){
        return urlService.getOriginUrl(url);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url){
        return urlService.getShortUrl(url);
    }
}
