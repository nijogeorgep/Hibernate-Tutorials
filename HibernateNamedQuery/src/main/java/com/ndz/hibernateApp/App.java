package com.ndz.hibernateApp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ndz.hibernateApp.domain.Department;
import com.ndz.hibernateApp.domain.Employee;
import com.ndz.hibernateApp.util.HibernateUtil;

/**
 * Hibernate
 *
 */
public class App {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();

    Department department = new Department("java");
    session.save(department);

    session.save(new Employee("Jakab Gipsz", department));
    session.save(new Employee("Captain Nemo", department));

    session.getTransaction().commit();
    Query q = session.createQuery("From Employee ");

    List<Employee> resultList = q.list();

    System.out.println("num of employess:" + resultList.size());
    for (Employee next : resultList) {
      System.out.println("next employee: " + next);
    }
    
    //Named Query in Different Session
    
    Session session2 = HibernateUtil.getSessionFactory().openSession();
    // Update record using named query
    Query query = session2.getNamedQuery(Department.UPDATE_DEPARTMENT_BY_ID).setInteger("id", 1)
        .setString("name", "Finance");
    query.executeUpdate();

    // Get named query instance
    query = session2.getNamedQuery(Department.GET_DEPARTMENT_BY_ID).setInteger("id", 1);
    // Get all departments (instances of DepartmentEntity)
    Department department2 = (Department) query.uniqueResult();
    System.out.println(department2.getName());


    session2.getTransaction().commit();
    //session2.close();
  }
}
