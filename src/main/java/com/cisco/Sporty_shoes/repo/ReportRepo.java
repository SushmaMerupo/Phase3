package com.cisco.Sporty_shoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.Sporty_shoes.Entity.Report;


public interface ReportRepo extends JpaRepository<Report, String> {
	
	
	
}
