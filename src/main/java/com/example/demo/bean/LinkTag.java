package com.example.demo.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class LinkTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Link link;
    @ManyToOne
    private Tag tag;

    public LinkTag(Long id, Link link, Tag tag, BigDecimal nombre) {
        this.id = id;
        this.link = link;
        this.tag = tag;
        this.nombre = nombre;
    }

    private BigDecimal nombre;

    public LinkTag() {
    }

    public BigDecimal getNombre() {
        return nombre;
    }

    public void setNombre(BigDecimal nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}

