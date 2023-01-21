package com.dewacoding.loansservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dewacoding.loansservice.model.Loans;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {
	
	List<Loans> findByCustomerIdOrderByStartDateDesc(int customerdId);
}
