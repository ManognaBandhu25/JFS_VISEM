package com.skillnext1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(
                "Manasa",     // name
                7,            // sem
                "ALML",        // dept
                "Maachine learning", // course
                "manasa@gmail.com"  // email
        );

        session.persist(student);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}