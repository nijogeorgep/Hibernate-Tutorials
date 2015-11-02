/**
 * 
 */
package com.ndz.hibernate.app;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ndz.hibernate.data.Department;
import com.ndz.hibernate.data.Employee;
import com.ndz.hibernate.util.HibernateUtil;

/**
 * @author nijo
 *
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Hibernate One to Many Exmaple List \n");

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    Department department = new Department();
    department.setDepartmentName("Sales");

    Employee emp1 = new Employee("Nina", "Mayers", "111");
    Employee emp2 = new Employee("Tony", "Almeida", "222");

    department.setEmployees(new ArrayList<Employee>());
    department.getEmployees().add(emp1);
    department.getEmployees().add(emp2);

    session.save(department);

    session.getTransaction().commit();
    session.close();

  }

}
