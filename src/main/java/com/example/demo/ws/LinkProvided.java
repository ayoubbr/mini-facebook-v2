package com.example.demo.ws;

import com.example.demo.bean.Link;
import com.example.demo.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mini-facebook/link")
public class LinkProvided {

    @PostMapping("/")
    public int save(@RequestBody Link link) {
        return linkService.save(link);
    }

    @GetMapping("/libelle/{libelle}")
    public Link findByLibelle(@PathVariable String libelle) {
        return linkService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return linkService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Link> findAll() {
        return linkService.findAll();
    }

    @Autowired
    private LinkService linkService;
}
