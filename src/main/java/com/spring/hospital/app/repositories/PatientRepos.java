package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepos extends JpaRepository <Patient, Integer> {

}
