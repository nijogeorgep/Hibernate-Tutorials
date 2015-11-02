package com.ndz.hibernateApp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.ndz.hibernateApp.domain.Member;
import com.ndz.hibernateApp.util.HibernateUtil;

/**
 * Hibernate
 *
 */
public class App {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();

    session.beginTransaction();

    Member member = new Member();

    session.save(member);

    // session.getTransaction().commit();
    Query q = session.createQuery("From Member ");

    List<Member> resultList = q.list();

    System.out.println("num of members:" + resultList.size());
    for (Member next : resultList) {
      System.out.println("next employee: " + next);
    }

    Criteria criteria = session.createCriteria(Member.class);

    
    criteria.addOrder(Order.asc("pnum"));
    criteria.addOrder(Order.desc("pnum"));
    

    criteria.add(Restrictions.eq("caption", ""));
    
    criteria.setMaxResults(10);
    criteria.setFirstResult(20);
    
    criteria.uniqueResult();
    

    session.getTransaction().commit();
    // session2.close();
  }
}
