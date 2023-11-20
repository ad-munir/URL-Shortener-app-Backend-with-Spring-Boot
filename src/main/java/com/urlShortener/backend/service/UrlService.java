package com.urlShortener.backend.service;

import com.urlShortener.backend.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepo;

    public String getOriginUrl(String url) {
        urlRepo.findByShortUrl(url);
        return null;
    }

    public String generateShortUrl(String url) {
        return null;
    }
}
