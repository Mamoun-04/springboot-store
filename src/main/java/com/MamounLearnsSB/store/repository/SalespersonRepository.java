package com.MamounLearnsSB.store.repository;

import com.MamounLearnsSB.store.model.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {
}
