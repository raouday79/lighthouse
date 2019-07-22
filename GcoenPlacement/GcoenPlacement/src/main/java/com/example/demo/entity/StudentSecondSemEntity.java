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
@Table(name="second_semester_details")
public class StudentSecondSemEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int second_semester_details_id;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	
	@Column(name="second_sem_total")
	int total;
	@Column(name="second_sem_obtained")
	int obtained;
	@Column(name="second_sem_percentage")
	String percentage;
	public int getSecond_semester_details_id() {
		return second_semester_details_id;
	}
	public void setSecond_semester_details_id(int second_semester_details_id) {
		this.second_semester_details_id = second_semester_details_id;
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
