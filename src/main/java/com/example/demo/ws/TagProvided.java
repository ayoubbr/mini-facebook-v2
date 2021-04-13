package com.example.demo.ws;

import com.example.demo.bean.Tag;
import com.example.demo.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mini-facebook/tag")
public class TagProvided {

    @GetMapping("/code/{code}")
    public Tag findByCode(@PathVariable String code) {
        return tagService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return tagService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Tag> findAll() {
        return tagService.findAll();
    }

    @Autowired
    private TagService tagService;
}
