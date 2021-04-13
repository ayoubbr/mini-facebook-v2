package com.example.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Status;
import com.example.demo.service.StatusService;

@RestController
@RequestMapping("mini-facebook/status")
public class StatusProvided {
    @PutMapping("/")
    public void update(@RequestBody Status status) {
        statusService.update(status);
    }

    @PostMapping("/")
    public int save(@RequestBody Status status) {

        return statusService.save(status);
    }

    @GetMapping("/ref/{ref}")
    public Status findByRef(@PathVariable String ref) {
        return statusService.findByRef(ref);
    }


    @GetMapping("/")
    public List<Status> findAll() {
        return statusService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return statusService.deleteByRef(ref);
    }


    @Autowired
    private StatusService statusService;
}
