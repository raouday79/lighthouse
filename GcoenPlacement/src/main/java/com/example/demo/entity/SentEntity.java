package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sent")
public class SentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sent_id;
	int message_id;
	
	String message;
	LocalDate date;
	
	public int getSent_id() {
		return sent_id;
	}
	public void setSent_id(int sent_id) {
		this.sent_id = sent_id;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
