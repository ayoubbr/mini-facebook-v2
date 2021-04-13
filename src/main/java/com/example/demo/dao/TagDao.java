package com.example.demo.dao;
import com.example.demo.bean.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagDao extends JpaRepository<Tag, Long> {


    Tag findByCode(String code);

    int deleteByCode(String code);


}

