/**
 * 
 */
package com.ndz.hibernate.data;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

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

  @SuppressWarnings("deprecation")
  @OneToMany(cascade = {CascadeType.ALL})
  @JoinColumn(name = "department_id")
  @IndexColumn(name = "idx")
  private List<Employee> employees;

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
