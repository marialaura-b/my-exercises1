package io.codeforall.fanstatics.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oneonecascade_exercise");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Car car = new Car();
        car.setModel("Corsa");
        car.setMake("Opel");

        em.persist(car);

        Car car1 = new Car();
        car1.setModel("Golf");
        car1.setMake("Volkswagen");
        em.persist(car1);

        Owner owner = new Owner();
        owner.setName("Maria");
        owner.setCar(car);
        em.persist(owner);
        car.setOwner(owner);
        car1.setOwner(owner);

        Owner owner1 = new Owner();
        owner1.setName("João");
        owner1.setCar(car1);

        em.persist(owner);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}