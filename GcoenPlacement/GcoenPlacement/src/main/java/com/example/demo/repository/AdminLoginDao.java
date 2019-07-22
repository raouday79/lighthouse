package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AdminLoginEntity;

public interface AdminLoginDao extends JpaRepository<AdminLoginEntity, Integer>{

}
