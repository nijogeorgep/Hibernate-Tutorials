package com.ndz.hibernateApp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
    @NamedQuery(name = Department.GET_DEPARTMENT_BY_ID,
        query = Department.GET_DEPARTMENT_BY_ID_QUERY),
    @NamedQuery(name = Department.UPDATE_DEPARTMENT_BY_ID,
        query = Department.UPDATE_DEPARTMENT_BY_ID_QUERY)})
public class Department implements Serializable {

  static final String GET_DEPARTMENT_BY_ID_QUERY = "from Department d where d.id = :id";
  public static final String GET_DEPARTMENT_BY_ID = "GET_DEPARTMENT_BY_ID";

  static final String UPDATE_DEPARTMENT_BY_ID_QUERY =
      "UPDATE Department d SET d.name=:name where d.id = :id";
  public static final String UPDATE_DEPARTMENT_BY_ID = "UPDATE_DEPARTMENT_BY_ID";

  @Id
  @GeneratedValue
  private Long id;


  private String name;

  @OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
  private List<Employee> employees = new ArrayList<Employee>();



  public Department() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Department(String name) {
    super();
    this.name = name;
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
   * @return the employees
   */
  public List<Employee> getEmployees() {
    return employees;
  }

  /**
   * @param employees the employees to set
   */
  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }



}
