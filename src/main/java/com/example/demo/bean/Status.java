package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Status implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String contenu;
    private String user;
    private BigDecimal totalJaime;
    private BigDecimal totalCommentaire;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateStatus;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "status")
    private List<Commentaire> commentaires;

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BigDecimal getTotalJaime() {
        return totalJaime;
    }

    public void setTotalJaime(BigDecimal totalJaime) {
        this.totalJaime = totalJaime;
    }

    public BigDecimal getTotalCommentaire() {
        return totalCommentaire;
    }

    public void setTotalCommentaire(BigDecimal totalCommentaire) {
        this.totalCommentaire = totalCommentaire;
    }

    public Date getDateStatus() {
        return dateStatus;
    }

    public void setDateStatus(Date dateStatus) {
        this.dateStatus = dateStatus;
    }
}