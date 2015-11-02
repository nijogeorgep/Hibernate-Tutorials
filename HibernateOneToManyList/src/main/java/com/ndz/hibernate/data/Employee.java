/**
 * 
 */
package com.ndz.hibernate.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author nijo
 *
 */
@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue
  @Column(name = "employee_id")
  private Long employeeId;

  @Column(name = "firstname")
  private String firstname;

  @Column(name = "lastname")
  private String lastname;

  @Column(name = "birth_date")
  private Date birthDate;

  @Column(name = "cell_phone")
  private String cellphone;

  @ManyToOne
  @JoinColumn(name = "department_id", insertable = false, updatable = false, nullable = false)
  private Department department;

  /**
   * @param firstname
   * @param lastname
   * @param birthDate
   * @param cellphone
   */
  public Employee(String firstname, String lastname, String cellphone) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthDate = new Date(System.currentTimeMillis());
    this.cellphone = cellphone;
  }

  /**
   * @return the employeeId
   */
  public Long getEmployeeId() {
    return employeeId;
  }

  /**
   * @param employeeId the employeeId to set
   */
  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  /**
   * @return the firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * @param firstname the firstname to set
   */
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * @return the lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * @param lastname the lastname to set
   */
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   * @return the birthDate
   */
  public Date getBirthDate() {
    return birthDate;
  }

  /**
   * @param birthDate the birthDate to set
   */
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  /**
   * @return the cellphone
   */
  public String getCellphone() {
    return cellphone;
  }

  /**
   * @param cellphone the cellphone to set
   */
  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
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



}
