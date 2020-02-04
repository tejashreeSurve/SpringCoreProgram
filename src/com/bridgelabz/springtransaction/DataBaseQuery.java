package com.bridgelabz.springtransaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public interface DataBaseQuery {
public void insert(Candidate candidate);
public void delete(Candidate candidate);
public void update(Candidate candidate);
}
