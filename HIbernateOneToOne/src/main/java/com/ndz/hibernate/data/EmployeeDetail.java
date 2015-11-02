/**
 * 
 */
package com.ndz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author nijo
 *
 */
@Entity
@Table(name = "employeedetail")
public class EmployeeDetail {

  @Id
  @Column(name = "employee_id", unique = true, nullable = false)
  @GeneratedValue(generator = "gen")
  @GenericGenerator(name = "gen", strategy = "foreign",
      parameters = @Parameter(name = "property", value = "employee") )
  private Long employeeId;

  @Column(name = "street")
  private String street;

  @Column(name = "city")
  private String city;

  @Column(name = "state")
  private String state;

  @Column(name = "country")
  private String country;

  @OneToOne
  @PrimaryKeyJoinColumn
  private Employee employee;

  /**
   * @param street
   * @param city
   * @param state
   * @param country
   */
  public EmployeeDetail(String street, String city, String state, String country) {
    super();
    this.street = street;
    this.city = city;
    this.state = state;
    this.country = country;
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
   * @return the street
   */
  public String getStreet() {
    return street;
  }

  /**
   * @param street the street to set
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * @param country the country to set
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * @return the employee
   */
  public Employee getEmployee() {
    return employee;
  }

  /**
   * @param employee the employee to set
   */
  public void setEmployee(Employee employee) {
    this.employee = employee;
  }



}
