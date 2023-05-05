package com.example.ejonespringboot.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Obj {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    Long id;
    private String ubication;
    private String position;
    private String fullName;
    private String image;
    private String user;

    public Obj(Long id, String ubication, String position, String fullName, String image, String user) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
        this.user = user;
    }
    public Obj(){}
}
