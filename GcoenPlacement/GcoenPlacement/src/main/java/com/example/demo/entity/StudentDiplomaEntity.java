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
@Table(name="deploma_details")
public class StudentDiplomaEntity {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int deploma_details_id;
	
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	
	int diploma_total;
	int diploma_obtained;
	String diploma_percentage;
	public int getDeploma_details_id() {
		return deploma_details_id;
	}
	public void setDeploma_details_id(int deploma_details_id) {
		this.deploma_details_id = deploma_details_id;
	}
	
	public int getDiploma_total() {
		return diploma_total;
	}
	public void setDiploma_total(int diploma_total) {
		this.diploma_total = diploma_total;
	}
	public int getDiploma_obtained() {
		return diploma_obtained;
	}
	public void setDiploma_obtained(int diploma_obtained) {
		this.diploma_obtained = diploma_obtained;
	}
	public String getDiploma_percentage() {
		return diploma_percentage;
	}
	public void setDiploma_percentage(String diploma_percentage) {
		this.diploma_percentage = diploma_percentage;
	}
	public StudentAcademicEntity getAcademicEntity() {
		return academicEntity;
	}
	public void setAcademicEntity(StudentAcademicEntity academicEntity) {
		this.academicEntity = academicEntity;
	}
	
	
	

}
