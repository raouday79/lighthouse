package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CompaniesEntity;

public interface CompaniesDao extends JpaRepository <CompaniesEntity, Integer > {

}
