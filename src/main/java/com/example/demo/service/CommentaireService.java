package com.example.demo.service;

import com.example.demo.bean.Commentaire;
import com.example.demo.bean.Status;
import com.example.demo.dao.CommentaireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireService {

    public int save(Commentaire commentaire) {
        if (findByCode(commentaire.getCode()) != null) {
            return -1;
        }
        Status status = statusService.findByRef(commentaire.getStatus().getRef());
        commentaire.setStatus(status);
        if (status == null) {
            return -2;
        } else {
            statusService.update(status);
            commentaireDao.save(commentaire);
            return 1;
        }
    }

    public Commentaire findByCode(String code) {
        return commentaireDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return commentaireDao.deleteByCode(code);
    }

    public List<Commentaire> findByStatusRef(String ref) {
        return commentaireDao.findByStatusRef(ref);
    }

    public int deleteByStatusRef(String ref) {
        return commentaireDao.deleteByStatusRef(ref);
    }

    public List<Commentaire> findAll() {
        return commentaireDao.findAll();
    }

    @Autowired
    private CommentaireDao commentaireDao;
    @Autowired
    private StatusService statusService;

}

