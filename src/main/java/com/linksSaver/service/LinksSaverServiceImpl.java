package com.linksSaver.service;

import com.linksSaver.dao.LinksSaverDao;
import com.linksSaver.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinksSaverServiceImpl implements LinksSaverService {

    @Autowired
    private LinksSaverDao linksSaverDao;


    @Override
    public List<Link> userList() {
        return linksSaverDao.userList();
    }

    @Override
    public Link getById(long id) {
        return linksSaverDao.getById(id);
    }

    @Override
    public void remove(Link link) {
        linksSaverDao.remove(link);
    }

    @Override
    public void add(Link link) {
        linksSaverDao.add(link);
    }

    @Override
    public void update(Link link) {
        linksSaverDao.update(link);
    }

    @Override
    public void saveOrUpdate(Link link) {
        linksSaverDao.saveOrUpdate(link);
    }
}
