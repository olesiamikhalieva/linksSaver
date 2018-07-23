package com.linksSaver.service;

import com.linksSaver.entity.Link;

import java.util.List;

public interface LinksSaverService {

    List<Link> userList();

    Link getById(long id);

    void remove(Link link);

    void add(Link link);

    void update(Link link);

    void saveOrUpdate(Link link);

}
