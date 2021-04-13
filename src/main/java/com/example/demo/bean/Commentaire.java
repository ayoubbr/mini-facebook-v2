package com.example.demo.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String user;
    private String contenu;
    private String dateCommentaire;


    @ManyToOne
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(String dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

