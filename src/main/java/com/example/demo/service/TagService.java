package com.example.demo.service;


import com.example.demo.bean.Tag;
import com.example.demo.dao.TagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagService {

    public Tag findByCode(String code) {
        return tagDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return tagDao.deleteByCode(code);
    }

    public List<Tag> findAll() {
        return tagDao.findAll();
    }

    @Autowired
    private TagDao tagDao;
}
