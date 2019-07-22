package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ssc_details")
public class StudentSSCEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ssc_details_id;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	int ssc_total;
	int ssc_obtained;
	String ssc_percentage;
	
	
	public int getSsc_details_id() {
		return ssc_details_id;
	}
	public void setSsc_details_id(int ssc_details_id) {
		this.ssc_details_id = ssc_details_id;
	}
	public String getSsc_percentage() {
		return ssc_percentage;
	}
	public void setSsc_percentage(String ssc_percentage) {
		this.ssc_percentage = ssc_percentage;
	}
	public StudentAcademicEntity getAcademicEntity() {
		return academicEntity;
	}
	public void setAcademicEntity(StudentAcademicEntity academicEntity) {
		this.academicEntity = academicEntity;
	}
	public int getSsc_total() {
		return ssc_total;
	}
	public void setSsc_total(int ssc_total) {
		this.ssc_total = ssc_total;
	}
	public int getSsc_obtained() {
		return ssc_obtained;
	}
	public void setSsc_obtained(int ssc_obtained) {
		this.ssc_obtained = ssc_obtained;
	}

}
