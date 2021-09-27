package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepos extends JpaRepository <Patient, Integer> {

}
