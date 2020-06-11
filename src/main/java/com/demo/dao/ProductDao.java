package com.demo.dao;

import com.demo.entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Stateless
public class ProductDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public ProductDao() {
    }

    public Integer insertProduct(Product p)
    {
        em = emf.createEntityManager();
        //jj
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        Integer id = p.getId();
        em.close();
        return id;
    }

    public Integer updateProduct(int id, Product product)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Product p = em.find(Product.class, id);
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        p.setDescription(product.getDescription());
        p.setImage(product.getImage());
        em.getTransaction().commit();
        Integer success = p.getId();
        em.close();
        return success;
    }

    public void deleteProduct(int id)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Product p = em.find(Product.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Product> getProduct()
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Product> list = em.createQuery("SELECT c from Product c", Product.class).getResultList();

        em.getTransaction().commit();
        em.close();
        return list;
    }
}
