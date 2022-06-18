package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.HomeDto;

public interface PreferencesRepository extends JpaRepository <HomeDto,Long> {
	
	//@Query("select dto  from HomeDto where userId = :userId")
HomeDto findByUserId (long userId);
}
