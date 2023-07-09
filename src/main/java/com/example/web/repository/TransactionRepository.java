package com.example.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.web.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer>{

	public List<Transaction> findByProcessSatausOrderByCollectionId(String processStatus);

	public List<Transaction> findAllByCollectionId(String string);
}
