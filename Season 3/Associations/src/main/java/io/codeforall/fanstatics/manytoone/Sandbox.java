package io.codeforall.fanstatics.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mymanytoone");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        Department dep1 = new Department();
        dep1.setName(("HR"));

        Department dep2 = new Department();
        dep2.setName(("Finance"));


        Employee e1 = new Employee();
        e1.setName("João");
        e1.setDepartment(dep1);

        Employee e2 = new Employee();
        e2.setName("Fernando");
        e2.setDepartment(dep1);


        em.persist(dep1);
        em.persist(dep2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
