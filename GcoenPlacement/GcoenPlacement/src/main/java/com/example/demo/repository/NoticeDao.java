package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.NoticeEntity;

public interface NoticeDao extends JpaRepository<NoticeEntity, Integer> {

}
