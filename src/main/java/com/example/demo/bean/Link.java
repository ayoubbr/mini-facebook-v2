package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String description;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "link")
    private List<LinkTag> linkTags;

    public Link(Long id, String libelle, String description, List<LinkTag> linkTags) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.linkTags = linkTags;
    }

    public List<LinkTag> getLinkTags() {
        return linkTags;
    }

    public void setLinkTags(List<LinkTag> linkTags) {
        this.linkTags = linkTags;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Link(Long id, String libelle, String description) {
        super();
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public Link() {
        super();
        // TODO Auto-generated constructor stub
    }


}


