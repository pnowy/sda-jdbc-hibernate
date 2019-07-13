package com.github.pnowy.sda.db.jdbc;

import javax.persistence.EntityManager;

public class EntityManagerExample {

    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();

        entityManager.getTransaction().begin();

        Employee e = new Employee();
        e.setName("JPA Franek");

        entityManager.persist(e);

        entityManager.getTransaction().commit();
        entityManager.close();

        JpaUtil.close();
    }

}
