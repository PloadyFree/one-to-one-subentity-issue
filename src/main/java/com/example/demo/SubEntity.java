package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class SubEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mainId;

    @MapsId
    @JoinColumn(name = "mainId")
    @OneToOne(optional = false)
    private MainEntity mainEntity;
}