package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="eight_semester_details")
public class StudentEightSemEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eight_semester_details_id;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	@Column(name="eight_sem_total")
	int total;
	@Column(name="eight_sem_obtained")
	int obtained;
	@Column(name="eight_sem_percentage")
	String percentage;
	public int getEight_semester_details_id() {
		return eight_semester_details_id;
	}
	public void setEight_semester_details_id(int eight_semester_details_id) {
		this.eight_semester_details_id = eight_semester_details_id;
	}
	public StudentAcademicEntity getAcademicEntity() {
		return academicEntity;
	}
	public void setAcademicEntity(StudentAcademicEntity academicEntity) {
		this.academicEntity = academicEntity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getObtained() {
		return obtained;
	}
	public void setObtained(int obtained) {
		this.obtained = obtained;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	
	
	
	
}
