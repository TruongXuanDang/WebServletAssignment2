package com.demo.dao;

import com.demo.entity.Product;
import com.demo.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Stateless
public class UserDao {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    static EntityManager em = emf.createEntityManager();

    public UserDao(){
    }
    public static Integer insertUser(User user)
    {
        em = emf.createEntityManager();
        //jj
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        Integer id = user.getId();
        em.close();
        return id;
    }
    public List<User> getUser()
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> list = em.createQuery("SELECT c from User c", User.class).getResultList();

        em.getTransaction().commit();
        em.close();
        return list;
    }

}
