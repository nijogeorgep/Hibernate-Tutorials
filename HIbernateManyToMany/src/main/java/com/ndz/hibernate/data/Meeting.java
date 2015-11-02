/**
 * 
 */
package com.ndz.hibernate.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author nijo
 *
 */
@Entity
@Table(name="meeting")
public class Meeting {

  @Id
  @Column(name = "MEETING_ID")
  @GeneratedValue
  private Long meetingId;

  @Column(name = "SUBJECT")
  private String subject;

  @Column(name = "MEETING_DATE")
  private Date meetingDate;

  @ManyToMany(mappedBy = "meetings")
  private Set<Employee> employees = new HashSet<Employee>();

  /**
   * @param subject
   */
  public Meeting(String subject) {
    super();
    this.subject = subject;
    this.meetingDate = new Date(System.currentTimeMillis());
  }

  /**
   * @return the meetingId
   */
  public Long getMeetingId() {
    return meetingId;
  }

  /**
   * @param meetingId the meetingId to set
   */
  public void setMeetingId(Long meetingId) {
    this.meetingId = meetingId;
  }

  /**
   * @return the subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * @param subject the subject to set
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * @return the meetingDate
   */
  public Date getMeetingDate() {
    return meetingDate;
  }

  /**
   * @param meetingDate the meetingDate to set
   */
  public void setMeetingDate(Date meetingDate) {
    this.meetingDate = meetingDate;
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
