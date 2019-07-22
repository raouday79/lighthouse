package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_academic")
public class StudentAcademicEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int student_academic_id;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="student_id", referencedColumnName="student_id")
	StudentLoginEntity loginEntity;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="branch_id", name="branch_id")
	BranchEntity branchEntity;
	
	String current_year;
	String first_name;
	String last_name;
	String gender	;
	String contact;
	String address;
	String category;
	String intership_details;
	String ncc;
	String backlog_history;
	String backlog_live;
	String paper_presentation_details;
	String project_completion;
	String image;
	String resume;
	
	
	
	
	public int getStudent_academic_id() {
		return student_academic_id;
	}
	public void setStudent_academic_id(int student_academic_id) {
		this.student_academic_id = student_academic_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getIntership_details() {
		return intership_details;
	}
	public void setIntership_details(String intership_details) {
		this.intership_details = intership_details;
	}
	
	public String getNcc() {
		return ncc;
	}
	public void setNcc(String ncc) {
		this.ncc = ncc;
	}
	public String getPaper_presentation_details() {
		return paper_presentation_details;
	}
	public void setPaper_presentation_details(String paper_presentation_details) {
		this.paper_presentation_details = paper_presentation_details;
	}
	public String getProject_completion() {
		return project_completion;
	}
	public void setProject_completion(String project_completion) {
		this.project_completion = project_completion;
	}
	public StudentLoginEntity getLoginEntity() {
		return loginEntity;
	}
	public void setLoginEntity(StudentLoginEntity loginEntity) {
		this.loginEntity = loginEntity;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public BranchEntity getBranchEntity() {
		return branchEntity;
	}
	public void setBranchEntity(BranchEntity branchEntity) {
		this.branchEntity = branchEntity;
	}
	public String getCurrent_year() {
		return current_year;
	}
	public void setCurrent_year(String current_year) {
		this.current_year = current_year;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getBacklog_history() {
		return backlog_history;
	}
	public void setBacklog_history(String backlog_history) {
		this.backlog_history = backlog_history;
	}
	public String getBacklog_live() {
		return backlog_live;
	}
	public void setBacklog_live(String backlog_live) {
		this.backlog_live = backlog_live;
	}
	

}
