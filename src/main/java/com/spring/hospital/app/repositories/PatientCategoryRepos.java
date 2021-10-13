package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.PatientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientCategoryRepos extends JpaRepository<PatientCategory, Integer> {
}
