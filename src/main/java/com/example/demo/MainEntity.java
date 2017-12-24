package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class MainEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mainId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mainEntity", optional = false)
    @PrimaryKeyJoinColumn
    private SubEntity subEntity;
}