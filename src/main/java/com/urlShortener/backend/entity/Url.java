package com.urlShortener.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="urls")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String originUrl;
    String shortUrl;
}
