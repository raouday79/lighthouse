package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recruiting_companies")
public class CompaniesEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int campany_id;
	String company_name;
	String company_description;
	String eligibilty_criteria;
	
	
	public int getCampany_id() {
		return campany_id;
	}
	public void setCampany_id(int campany_id) {
		this.campany_id = campany_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_description() {
		return company_description;
	}
	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}
	public String getEligibilty_criteria() {
		return eligibilty_criteria;
	}
	public void setEligibilty_criteria(String eligibilty_criteria) {
		this.eligibilty_criteria = eligibilty_criteria;
	}
	

}
