package com.linksSaver.dao;

import com.linksSaver.entity.Link;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class LinksSaverDaoImpl implements LinksSaverDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Link> userList() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Link> theQuery = currentSession.createQuery("from Link", Link.class);
        return theQuery.getResultList();
    }

    @Override
    public Link getById(long id) {
        Session currentSession = sessionFactory.getCurrentSession();
  currentSession.get(Link.class, id);
        return null;
    }

    @Override
    public void remove(Link link) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.remove(link);
    }

    @Override
    public void add(Link link) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(link);
    }

    @Override
    public void update(Link link) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(link);
    }


    @Override
    public void saveOrUpdate(Link link) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(link);
    }

}
