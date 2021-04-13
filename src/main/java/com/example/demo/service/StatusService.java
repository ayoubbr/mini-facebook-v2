package com.example.demo.service;

import com.example.demo.bean.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Status;
import com.example.demo.dao.StatusDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusDao statusDao;
    @Autowired
    private CommentaireService commentaireService;

    public void update(Status status) {
        statusDao.save(status);
    }

    public void prepare(Status status) {
        List<Commentaire> comm = commentaireService.findByStatusRef(status.getRef());
        status.setCommentaires(comm);
    }

    public int save(Status status) {
        if (findByRef(status.getRef()) != null) {
            return -1;
        } else {
            prepare(status);
            statusDao.save(status);
            return 1;
        }
    }

    public List<Status> findAll() {
        return statusDao.findAll();
    }

    public Status findByRef(String ref) {
        return statusDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        int resultCommentaire = commentaireService.deleteByStatusRef(ref);
        int resultStatus = statusDao.deleteByRef(ref);
        return resultStatus + resultCommentaire;
    }

}
