package com.zensar.hibernate;
/**
 * 
 * @author Risha Ansari
 * @creation_date 1 october 2019 10.12am
 * @modification_date 1 october 2019 10.12am
 * @version 1.0
 * @copyright Zensar technologies
 * @description It is an entity class
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;


public class HibernateMain
{
    public static void main( String[] args )
    {
       Configuration c=new Configuration().configure();
       SessionFactory sf=c.buildSessionFactory();
       Session s=sf.openSession();
       Transaction t=s.beginTransaction();
       Product p=new Product();
       p.setProductId(1001);
       p.setProductName("Laptop");
       p.setBrand("Lenovo");
       p.setPrice(40000);
       s.save(p);
       System.out.println("Product is saved");
       t.commit();
       s.close();
       
    }
}
