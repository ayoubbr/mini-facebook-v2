package com.example.demo.service;


import com.example.demo.bean.Link;
import com.example.demo.bean.LinkTag;
import com.example.demo.dao.LinkTagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkTagService {
    @Autowired
    private LinkTagDao linkTagDao;
    @Autowired
    private TagService tagService;

    public List<LinkTag> findByLinkLibelle(String libelle) {
        return linkTagDao.findByLinkLibelle(libelle);
    }

    public int deleteByLinkLebelle(String libelle) {
        return linkTagDao.deleteByLinkLibelle(libelle);
    }

    public List<LinkTag> findAll() {
        return linkTagDao.findAll();
    }

    public void save(Link link, List<LinkTag> linkTags) {
        for (LinkTag linkTag : linkTags) {
            linkTag.setLink(link);
            if (linkTag.getTag() != null && linkTag.getTag().getCode() != null) {
                linkTag.setTag(tagService.findByCode(linkTag.getTag().getCode()));
            }
            linkTagDao.save(linkTag);

        }
    }
}
