package io.codeforall.fanstatics.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mymanytomany");

        EntityManager em = emf.createEntityManager();

        Researcher researcher = new Researcher();
        researcher.setName("Joana");

        researcher.setLaboratory(new ArrayList<>());

        em.getTransaction().begin();
        em.persist(researcher);


        Laboratory laboratory = new Laboratory();
        laboratory.setName("Química Orgânica");

        em.persist(laboratory);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
