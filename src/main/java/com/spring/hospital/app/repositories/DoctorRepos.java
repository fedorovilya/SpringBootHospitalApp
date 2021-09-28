package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepos extends JpaRepository <Doctor, Integer> {

}
