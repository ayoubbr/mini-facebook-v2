package com.example.demo.dao;

import com.example.demo.bean.LinkTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkTagDao extends JpaRepository<LinkTag, Long> {

    int deleteByLinkLibelle(String libelle);


    List<LinkTag> findByLinkLibelle(String libelle);
}
