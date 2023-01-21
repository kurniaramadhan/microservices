package com.dewacoding.accountsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dewacoding.accountsservice.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	Accounts findByCustomerId(int customerId);
}
