package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepos extends JpaRepository <Treatment, Integer> {

}
