package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="backlog_subject")
public class StudentBacklogEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int backlog_id;
	
	int semester_id;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="student_academic_id",referencedColumnName="student_academic_id")
	StudentAcademicEntity academicEntity;
	
	int subject_id;
	
	String status;
	
	
	public int getBacklog_id() {
		return backlog_id;
	}
	public void setBacklog_id(int backlog_id) {
		this.backlog_id = backlog_id;
	}
	public int getSemester_id() {
		return semester_id;
	}
	public void setSemester_id(int semester_id) {
		this.semester_id = semester_id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public StudentAcademicEntity getAcademicEntity() {
		return academicEntity;
	}
	public void setAcademicEntity(StudentAcademicEntity academicEntity) {
		this.academicEntity = academicEntity;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	
	

}
