package com.demo.dao;

import com.demo.entity.Categories;
import com.demo.entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
@Stateless
public class CategoryDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();
    public List<Categories> getCategory()
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Categories> list = em.createQuery("SELECT c from Categories c", Categories.class).getResultList();

        em.getTransaction().commit();
        em.close();
        return list;
    }
}
