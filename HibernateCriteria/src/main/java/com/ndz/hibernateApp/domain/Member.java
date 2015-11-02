/**
 * 
 */
package com.ndz.hibernateApp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nijo
 *
 */
@Entity
@Table(name = "member_details")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer pnum;
  private String caption;
  private Integer ethnicity;
  private Integer weight;
  private Integer height;
  private boolean is_veg;
  private boolean drink;
  private Date dob;

  /**
   * 
   */
  public Member() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param caption
   * @param ethnicity
   * @param weight
   * @param height
   * @param is_veg
   * @param drink
   * @param dob
   */
  public Member(String caption, Integer ethnicity, Integer weight, Integer height, boolean is_veg,
      boolean drink, Date dob) {
    super();
    this.caption = caption;
    this.ethnicity = ethnicity;
    this.weight = weight;
    this.height = height;
    this.is_veg = is_veg;
    this.drink = drink;
    this.dob = dob;
  }

  /**
   * @param id
   * @param caption
   * @param ethnicity
   * @param weight
   * @param height
   * @param is_veg
   * @param drink
   * @param dob
   */
  public Member(Integer pnum, String caption, Integer ethnicity, Integer weight, Integer height,
      boolean is_veg, boolean drink, Date dob) {
    super();
    this.pnum = pnum;
    this.caption = caption;
    this.ethnicity = ethnicity;
    this.weight = weight;
    this.height = height;
    this.is_veg = is_veg;
    this.drink = drink;
    this.dob = dob;
  }

  /**
   * @return the pnum
   */
  public Integer getPnum() {
    return pnum;
  }

  /**
   * @param pnum the pnum to set
   */
  public void setPnum(Integer pnum) {
    this.pnum = pnum;
  }

  /**
   * @return the caption
   */
  public String getCaption() {
    return caption;
  }

  /**
   * @param caption the caption to set
   */
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * @return the ethnicity
   */
  public Integer getEthnicity() {
    return ethnicity;
  }

  /**
   * @param ethnicity the ethnicity to set
   */
  public void setEthnicity(Integer ethnicity) {
    this.ethnicity = ethnicity;
  }

  /**
   * @return the weight
   */
  public Integer getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  /**
   * @return the height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * @param height the height to set
   */
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * @return the is_veg
   */
  public boolean isIs_veg() {
    return is_veg;
  }

  /**
   * @param is_veg the is_veg to set
   */
  public void setIs_veg(boolean is_veg) {
    this.is_veg = is_veg;
  }

  /**
   * @return the drink
   */
  public boolean isDrink() {
    return drink;
  }

  /**
   * @param drink the drink to set
   */
  public void setDrink(boolean drink) {
    this.drink = drink;
  }

  /**
   * @return the dob
   */
  public Date getDob() {
    return dob;
  }

  /**
   * @param dob the dob to set
   */
  public void setDob(Date dob) {
    this.dob = dob;
  }

}
