package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDAO {

    public void save(EntityManagerFactory entityManagerFactory) {

        Course course = new Course("Js", 4, 1000.00);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course);
        transaction.commit();

        entityManager.close();
    }

    public void update(EntityManagerFactory entityManagerFactory) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course = entityManager.find(Course.class, 3);

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        course.setTitle("Spring");
        transaction.commit();


        entityManager.close();
    }

    public void saveAll() {

    }

    public void add() {

    }

    public void delete(EntityManagerFactory entityManagerFactory) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course = entityManager.find(Course.class, 2);

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.remove(course);
        transaction.commit();

        entityManager.close();
    }

    public void read(EntityManagerFactory entityManagerFactory) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();

//        transaction.begin();
        Course course = entityManager.find(Course.class, 3);
//        transaction.commit();

        System.out.println(course.toString());

        entityManager.close();

    }
}
