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
@Table(name="hsc_details")
public class StudentHSCEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int hsc_details_id;
	

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	int hsc_total;
	int hsc_obtained;
	String hsc_percentage;
	
	
	public int getHsc_details_id() {
		return hsc_details_id;
	}
	public void setHsc_details_id(int hsc_details_id) {
		this.hsc_details_id = hsc_details_id;
	}
	
	public int getHsc_total() {
		return hsc_total;
	}
	public void setHsc_total(int hsc_total) {
		this.hsc_total = hsc_total;
	}
	public int getHsc_obtained() {
		return hsc_obtained;
	}
	public void setHsc_obtained(int hsc_obtained) {
		this.hsc_obtained = hsc_obtained;
	}
	public String getHsc_percentage() {
		return hsc_percentage;
	}
	public void setHsc_percentage(String hsc_percentage) {
		this.hsc_percentage = hsc_percentage;
	}
	public StudentAcademicEntity getAcademicEntity() {
		return academicEntity;
	}
	public void setAcademicEntity(StudentAcademicEntity academicEntity) {
		this.academicEntity = academicEntity;
	}
	
	
	
}
