package com.ndz.hibernateApp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToOne
  private Department department;

  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public Employee(String name, Department department) {
    super();
    this.name = name;
    this.department = department;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the department
   */
  public Department getDepartment() {
    return department;
  }

  /**
   * @param department the department to set
   */
  public void setDepartment(Department department) {
    this.department = department;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Employee [id=");
    builder.append(id);
    builder.append(", name=");
    builder.append(name);
    builder.append(", department=");
    builder.append(department);
    builder.append("]");
    return builder.toString();
  }

}
