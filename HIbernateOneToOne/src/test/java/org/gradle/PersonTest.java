package org.gradle;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.ndz.hibernate.data.Employee;

public class PersonTest {
  @Test
  public void canConstructAPersonWithAName() {
    Employee person =
        new Employee("Larry", "Page", new Date(System.currentTimeMillis()), "9961813268");
    assertEquals("Larry", person.getFirstname());
  }
}
