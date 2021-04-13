package com.example.demo.dao;

import com.example.demo.bean.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//ref de status : liste de commentaires :: dans le commentaire Dao
@Repository
public interface CommentaireDao extends JpaRepository<Commentaire, Long> {


    Commentaire findByCode(String code);

    @Transactional
    int deleteByCode(String code);

    List<Commentaire> findByStatusRef(String ref);

    @Transactional
    int deleteByStatusRef(String ref);

}


