package io.codeforall.fanstatics.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oneone_exercise");

        EntityManager em = emf.createEntityManager();

        Car car = new Car();
        car.setModel("Corsa");
        car.setMake("Opel");

        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();

        Owner owner = new Owner();
        owner.setName("Maria");

        em.getTransaction().begin();
        em.persist(owner);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}