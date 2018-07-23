package com.linksSaver.dao;

import com.linksSaver.entity.Link;
import java.util.List;

public interface LinksSaverDao {

    List<Link> userList();

    Link getById(long id);

    void remove(Link link);

    void  add(Link link);

    void update(Link link);

    void saveOrUpdate(Link link);
}
