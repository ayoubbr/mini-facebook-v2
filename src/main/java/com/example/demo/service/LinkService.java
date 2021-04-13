package com.example.demo.service;


import java.util.List;

import com.example.demo.bean.Link;
import com.example.demo.dao.LinkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service

public class LinkService {

    @Autowired
    private LinkDao linkDao;
    @Autowired
    private LinkTagService linkTagService;

    public int save(Link link) {
        if (findByLibelle(link.getLibelle()) != null) {
            return -1;
        } else {
            linkDao.save(link);
            linkTagService.save(link, link.getLinkTags());
            return 1;
        }
    }

    public Link findByLibelle(String libelle) {
        return linkDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        int deleteByLinkLibelle = linkTagService.deleteByLinkLebelle(libelle);
        int deleteByLibelle = linkDao.deleteByLibelle(libelle);
        return deleteByLibelle + deleteByLinkLibelle;
    }


    public List<Link> findAll() {

        return linkDao.findAll();
    }


}
