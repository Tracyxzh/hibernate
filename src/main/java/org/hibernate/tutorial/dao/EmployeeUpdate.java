package org.hibernate.tutorial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.util.HibernateUtil;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by xzh on 2017/4/21.
 */
public class EmployeeUpdate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, 3);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date date = dateFormat.parse("2014-06-23");
            employee.setBirthDate(new java.sql.Date(date.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        session.update(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println(employee.getBirthDate());
    }
}
