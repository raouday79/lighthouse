package com.example.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentLoginEntity;
import com.example.demo.repository.StudentLoginDao;

@Service
public class StudentLoginService {
	@Autowired 
	StudentLoginDao sld ;
	
	@Autowired
	EntityManager entityManager;
	
	
	public StudentLoginEntity loginValidation(String username, String password)
	{
		com.example.demo.entity.StudentLoginEntity entity = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<StudentLoginEntity> query = builder.createQuery(StudentLoginEntity.class);
		
		
				
		
		return entity;
	}

}
