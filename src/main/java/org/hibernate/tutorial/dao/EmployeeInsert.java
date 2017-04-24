package org.hibernate.tutorial.dao;

import org.hibernate.Interceptor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.util.HibernateUtil;

import java.sql.Date;

/**
 * Created by xzh on 2017/4/21.
 */
public class EmployeeInsert {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = new Employee("tarcy","xzh",new Date(System.currentTimeMillis()),"188170507687");
        Integer id = (Integer)session.save(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("id is: " + id);
    }
}
