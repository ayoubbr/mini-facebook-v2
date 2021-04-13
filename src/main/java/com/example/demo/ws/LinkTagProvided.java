package com.example.demo.ws;


import com.example.demo.bean.Link;
import com.example.demo.bean.LinkTag;
import com.example.demo.service.LinkTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("projet-mini-facebook/linkTag")

public class LinkTagProvided {
    @GetMapping("/libelle/{libelle}")
    public List<LinkTag> findByLinkLebelle(@PathVariable String libelle) {
        return linkTagService.findByLinkLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLinkLebelle(@PathVariable String libelle) {
        return linkTagService.deleteByLinkLebelle(libelle);
    }

    @PostMapping("/")
    public void save(@RequestBody Link link,List<LinkTag> linkTags) {
        linkTagService.save(link, linkTags);
    }

    @GetMapping("/")
    public List<LinkTag> findAll() {
        return linkTagService.findAll();
    }

    @Autowired
    private LinkTagService linkTagService;
}
