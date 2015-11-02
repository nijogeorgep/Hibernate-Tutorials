package org.gradle;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.ndz.hibernate.data.Employee;

public class PersonTest {
  @Test
  public void canConstructAPersonWithAName() {
    Employee person = new Employee("Larry", "page", new Date(), "9961813268");
    assertEquals("Larry", person.getFirstname());
  }
}
