package org.hibernate.tutorial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tutorial.domain.Employee;
import org.hibernate.tutorial.util.HibernateUtil;

/**
 * Created by xzh on 2017/4/21.
 */
public class EmployeeGet {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, 2);
        System.out.println(employee.getFirstname() + employee.getLastname());
    }

}
