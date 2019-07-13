package com.github.pnowy.sda.db.jdbc;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateExample {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

//        Transaction transaction = session.beginTransaction();
        try {
            Employee e = new Employee();
            e.setName("Franek");

            session.save(e);

//            transaction.commit();
        } catch (Exception e) {
//            transaction.rollback();
        }
        HibernateUtil.getSessionFactory().close();
    }

}
