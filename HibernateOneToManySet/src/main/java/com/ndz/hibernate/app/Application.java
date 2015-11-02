/**
 * 
 */
package com.ndz.hibernate.app;

import java.util.Date;
import java.util.List;

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
    System.out.println("Hibernate One to Many Exmaple \n");

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    Department department = new Department();
    department.setDepartmentName("Sales");
    session.save(department);

    Employee employee = new Employee("NIJO", "GEORGE", new Date(41188), "9961813268");
    Employee employee2 = new Employee("NITHIN", "THOMAS", new Date(51188), "9961813269");

    employee.setDepartment(department);
    employee2.setDepartment(department);

    session.save(employee);
    session.save(employee2);

    session.getTransaction().commit();
    session.close();

  }

}
