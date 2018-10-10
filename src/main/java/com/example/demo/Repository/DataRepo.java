package com.example.demo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepo {

    @Autowired
    SessionFactory s1;

    @Autowired
    SessionFactory s2;

    Session getSession1(){
        try {
           return s1.getCurrentSession();
        }catch (Exception ex){
           return s1.openSession();
        }
    }

    Session getSession2(){
        try {
            return s2.getCurrentSession();
        }catch (Exception ex){
            return s2.openSession();
        }
    }

    public void s(){
        getSession2().createSQLQuery("select * from actor").list();
    }

    public void s2(){
        getSession1().createSQLQuery("select * from bomcfg_globalmultmonthmoveupconfig").list();
    }

}
