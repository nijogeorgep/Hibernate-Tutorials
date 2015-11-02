/**
 * 
 */
package com.ndz.hibernate.data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

  @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
  private EmployeeDetail employeeDetail;



  /**
   * @param firstname
   * @param lastname
   * @param birthDate
   * @param cellphone
   */
  public Employee(String firstname, String lastname, Date birthDate, String cellphone) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthDate = birthDate;
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
   * @return the employeeDetail
   */
  public EmployeeDetail getEmployeeDetail() {
    return employeeDetail;
  }

  /**
   * @param employeeDetail the employeeDetail to set
   */
  public void setEmployeeDetail(EmployeeDetail employeeDetail) {
    this.employeeDetail = employeeDetail;
  }


}
