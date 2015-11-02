/**
 * 
 */
package com.ndz.hibernate.app;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ndz.hibernate.data.Employee;
import com.ndz.hibernate.data.EmployeeDetail;
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
    System.out.println("Hibernate One to One Exmaple \n");

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    EmployeeDetail employeeDetail = new EmployeeDetail("Elenthikara", "Cochin", "Kerala", "India");
    Employee employee = new Employee("NIJO", "GEORGE", new Date(41188), "9961813268");

    employeeDetail.setEmployee(employee);
    employee.setEmployeeDetail(employeeDetail);

    session.save(employee);

    List<Employee> employees = session.createQuery("from Employee").list();
    for (Employee employe : employees) {
      System.out.println(employe.getFirstname() + "," + employe.getLastname() + ","
          + employe.getCellphone() + "," + employe.getBirthDate());
    }

    session.getTransaction().commit();
    session.close();

  }

}
