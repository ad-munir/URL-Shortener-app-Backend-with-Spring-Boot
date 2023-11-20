package com.urlShortener.backend.service;

import com.google.common.hash.Hashing;
import com.urlShortener.backend.entity.Url;
import com.urlShortener.backend.repository.UrlRepository;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;

@Service
public class UrlService {

    @Autowired
    UrlRepository urlRepo;

    public String getOriginUrl(String url) {
        return urlRepo.findByShortUrl(url).getOriginUrl();
    }

    public Url getShortUrl(String url) {

        if (!isUrlValid(url)) {
            System.out.println("URL is not valid !");
            return  null;
        }

        Url obj = new Url(null, url, "https://shrt.com/" + generateShortUrl(url));
        return urlRepo.save(obj);
    }


    public static String generateShortUrl(String url) {
        return Hashing.murmur3_32_fixed().hashString(url, Charset.defaultCharset()).toString();
    }


    public static boolean isUrlValid(String url) {
        return UrlValidator.getInstance().isValid(url);
    }
}
