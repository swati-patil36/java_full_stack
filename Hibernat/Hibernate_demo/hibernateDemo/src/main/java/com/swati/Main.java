package com.swati;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1= new Student();
        s1.setRollNo(106);
        s1.setsName("Boby");
        s1.setsAge(39); 

        //Student s2 = null; // for fetching

        // Configuration cfg= new Configuration();
        // cfg.addAnnotatedClass(com.swati.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration()
                            .configure()
                            .addAnnotatedClass(com.swati.Student.class)
                            .buildSessionFactory();

        Session session = sf.openSession();

        //s1=session.find(Student.class, 102); // Deleting the data from the database and if this used no need for line no 11,12,13
        Transaction transaction = session.beginTransaction();  // no need to beging the transaction for fetching the data , use only when we manupulate the data in the database like insert, update, delete
        
        //session.remove(s1);  // for deleting the data from the database, should be before commit() for deleting the data from the database
        //session.persist(s1);  // not for fetching
        session.merge(s1);  // for updating the data in the database, should be before commit() for updating the data in the database
        transaction.commit(); // no need for fetching  the data from the database

       // s2 = session.find(Student.class, 103); // fetching the data from the database

        //session.merge(s1); // should be before commit() for updating the data in the database
        session.close();
        sf.close();

        System.out.println(s1);
        
    }
}