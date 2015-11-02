/**
 * 
 */
package com.ndz.hibernate.app;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;

import com.ndz.hibernate.data.Employee;
import com.ndz.hibernate.data.Meeting;
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
    System.out.println("Hibernate Many to Many Exmaple \n");

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();

    Meeting meeting1 = new Meeting("Quaterly Sales meeting");
    Meeting meeting2 = new Meeting("Weekly Status meeting");

    Employee employee1 = new Employee("NIJO", "GEORGE", new Date(41188), "9961813268");
    Employee employee2 = new Employee("RENJU", "GEORGE", new Date(51188), "8147735345");

    employee1.getMeetings().add(meeting1);
    employee2.getMeetings().add(meeting2);
    employee1.getMeetings().add(meeting2);

    session.save(employee1);
    session.save(employee2);

   /* List<Employee> employees = session.createQuery("from Employee").list();
    for (Employee employee : employees) {
      System.out.println(employee.getFirstname() + "," + employee.getLastname() + ","
          + employee.getCellphone() + "," + employee.getBirthDate());
    }
*/
    session.getTransaction().commit();
    session.close();

  }

}
