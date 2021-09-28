package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.PatientContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientContactRepos extends JpaRepository <PatientContact, Integer>{

}
