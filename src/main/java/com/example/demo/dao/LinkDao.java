package com.example.demo.dao;


import com.example.demo.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface LinkDao extends JpaRepository<Link, Long> {

   Link findByLibelle(String libelle);

   int deleteByLibelle(String libelle);



}

