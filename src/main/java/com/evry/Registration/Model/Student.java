package com.evry.Registration.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="student")
public class Student extends AbstractStudent {		
	
	@Column(name="FirstName")
	private String FirstName;
	
	@Column(name="LastName")
	private String LastName;
	
	@Column(name="Gender")
	private String gender;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-mm-yyyy")
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Nationality")
	private String Nationality;


	@Column(name="BloodGroup")
	private String bloodgroup;
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNationality() {
		return Nationality;
	}


	public void setNationality(String nationality) {
		Nationality = nationality;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	
	public String getLastName() {
		return LastName;
	}
	
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}		
}
