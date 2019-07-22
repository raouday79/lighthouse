package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SentEntity;

public interface SentDao extends JpaRepository<SentEntity, Integer> {

}
