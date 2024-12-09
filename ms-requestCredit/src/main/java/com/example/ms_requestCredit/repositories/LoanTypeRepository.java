package com.example.ms_requestCredit.repositories;

import com.example.ms_requestCredit.entities.LoanTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanTypeRepository extends JpaRepository<LoanTypeEntity, Long> {
    List<LoanTypeEntity> findByRutClient(String rutClient);

    void deleteByRutClient(String rut);
}
