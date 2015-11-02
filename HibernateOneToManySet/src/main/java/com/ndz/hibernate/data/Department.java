/**
 * 
 */
package com.ndz.hibernate.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author nijo
 *
 */
@Entity
@Table(name = "department")
public class Department {

  @Id
  @GeneratedValue
  @Column(name = "DEPARTMENT_ID")
  private Long departmentId;

  @Column(name = "DEPT_NAME")
  private String departmentName;

  @OneToMany(mappedBy = "department")
  private Set<Employee> employees;

  /**
   * @param departmentName
   */
  public Department(String departmentName) {
    super();
    this.departmentName = departmentName;
  }

  public Department() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @return the departmentId
   */
  public Long getDepartmentId() {
    return departmentId;
  }

  /**
   * @param departmentId the departmentId to set
   */
  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  /**
   * @return the departmentName
   */
  public String getDepartmentName() {
    return departmentName;
  }

  /**
   * @param departmentName the departmentName to set
   */
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * @return the employees
   */
  public Set<Employee> getEmployees() {
    return employees;
  }

  /**
   * @param employees the employees to set
   */
  public void setEmployees(Set<Employee> employees) {
    this.employees = employees;
  }



}
