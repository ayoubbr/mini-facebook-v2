package com.example.demo.ws;

import com.example.demo.bean.Commentaire;
import com.example.demo.bean.Status;
import com.example.demo.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mini-facebook/commentaire")
public class CommentaireProvided {


    @PostMapping("/")
    public int save(@RequestBody Commentaire commentaire) {
        return commentaireService.save(commentaire);
    }
//
//    @PostMapping("/")
//    public int save(@RequestBody Status status) {
//        return commentaireService.save(status);
//    }

    @GetMapping("/code/{code}")
    public Commentaire findByCode(@PathVariable String code) {
        return commentaireService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return commentaireService.deleteByCode(code);
    }

    @GetMapping("/status/ref/{ref}")
    public List<Commentaire> findByStatusRef(@PathVariable String ref) {
        return commentaireService.findByStatusRef(ref);
    }

    @DeleteMapping("/status/ref/{ref}")
    public int deleteByStatusRef(@PathVariable String ref) {
        return commentaireService.deleteByStatusRef(ref);
    }

    @GetMapping("/")
    public List<Commentaire> findAll() {
        return commentaireService.findAll();
    }

    @Autowired
    private CommentaireService commentaireService;
}
