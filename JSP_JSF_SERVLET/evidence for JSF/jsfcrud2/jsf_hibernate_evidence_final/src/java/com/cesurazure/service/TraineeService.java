
package com.cesurazure.service;

import com.cesurazure.entity.Trainee;
import com.cesurazure.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TraineeService {
    
    public void save(Trainee trainee){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(trainee);
        tr.commit();
    }
    
    public void update(Trainee trainee){ 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(trainee);
        tr.commit();
    }
    
    public void delete(Trainee trainee){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(trainee);
        tr.commit();
    }
    
    public Trainee getById(int id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Trainee trainee = (Trainee) session.get(Trainee.class, id);
        tr.commit();
        return trainee;   
    }
    
    public List<Trainee> getAll(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        List<Trainee> list = session.createQuery("FROM Trainee").list();
        tr.commit();
        return list;
    }
}
