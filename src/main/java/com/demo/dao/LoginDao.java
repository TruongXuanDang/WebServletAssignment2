package com.demo.dao;

import com.demo.entity.Product;
import com.demo.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Stateless
public class LoginDao {


     public static boolean validate(String username, String password){
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
         EntityManager em = emf.createEntityManager();
         User user = null;
         em = emf.createEntityManager();
         //jj
         try {
             em.getTransaction().begin();
              user = em.createQuery("SELECT c from User c where c.username= :pram1 and c.password= :pram2",
                     User.class).setParameter("pram1",username).setParameter("pram2", password).getSingleResult();
         } catch (Exception e) {
             e.printStackTrace();
         }
         em.close();
         return user != null;
     }

}
