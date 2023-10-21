/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.LeitoresVc;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vivic
 */
public class LeitoresVc_DAO extends DAOAbstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LeitoresVc.class);
        criteria.add(Restrictions.eq("idleitoresVc", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(LeitoresVc.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }
    
    public LeitoresVc fazerLogin(String nomeLeitoresVc, String senhaVc) {
    try {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LeitoresVc.class);
        criteria.add(Restrictions.eq("nomeLeitorVc", nomeLeitoresVc ));
        criteria.add(Restrictions.eq("senhaVc", senhaVc ));

        LeitoresVc leitoresVc = (LeitoresVc) criteria.uniqueResult();

        session.getTransaction().commit();

        return leitoresVc;
    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}

    
}
