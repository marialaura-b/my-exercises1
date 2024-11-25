package io.codeforall.fanstatics.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        Car car = new Car();
        car.setModel("Corsa");
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();

        Owner owner = new Owner();
        owner.setName("Maria");
        owner.setCar(car);
        em.getTransaction().begin();
        em.persist(owner);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}