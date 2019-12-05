package com.praveen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "VEHICLE_OWNER_DETAILS")
public class OwnerEntity {

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	
	private Integer Userid;
	private String firstName;
	
	private String lastName;
	private String email;
	private Long phno;
	private String gender;
	
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		this.Userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}