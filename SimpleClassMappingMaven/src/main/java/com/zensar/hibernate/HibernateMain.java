package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
        Configuration c = new Configuration().configure();
        SessionFactory f = c.buildSessionFactory();
        Session s = f.openSession();
        Transaction t = s.beginTransaction();
        
        Product p = new Product();
        p.setProductId(2001);
        p.setName("Mobile");
        p.setBrand("Vivo");
        p.setPrice(25600.00f);

        s.save(p);
        
        t.commit();
        s.close();
        
    }
}
