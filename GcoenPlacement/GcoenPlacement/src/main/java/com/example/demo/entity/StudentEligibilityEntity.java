package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_eligibility")
public class StudentEligibilityEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eligibility_id;
	int student_academic_id;
	int campany_id;
	String status;
	public int getEligibility_id() {
		return eligibility_id;
	}
	public void setEligibility_id(int eligibility_id) {
		this.eligibility_id = eligibility_id;
	}
	public int getStudent_academic_id() {
		return student_academic_id;
	}
	public void setStudent_academic_id(int student_academic_id) {
		this.student_academic_id = student_academic_id;
	}
	public int getCampany_id() {
		return campany_id;
	}
	public void setCampany_id(int campany_id) {
		this.campany_id = campany_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
