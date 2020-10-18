package com.mizanthecoder;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {

    public void save(Student student) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(student);

        tr.commit();
    }

    public void update(Student student) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);

        tr.commit();
    }

    public void del(Student student) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        tr.commit();
    }

    public Student getById(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Student student = (Student) session.get(Student.class, id);
        tr.commit();
        return student;
    }

    public List<Student> getAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tr = session.beginTransaction();
        List<Student> list = session.createQuery("FROM Student").list();
        tr.commit();
        return list;
    }
}
