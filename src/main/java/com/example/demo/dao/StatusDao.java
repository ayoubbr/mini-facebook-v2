package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.Status;

@Repository
public interface StatusDao extends JpaRepository<Status, Long> {

    Status findByRef(String ref);
    int deleteByRef(String ref);
}