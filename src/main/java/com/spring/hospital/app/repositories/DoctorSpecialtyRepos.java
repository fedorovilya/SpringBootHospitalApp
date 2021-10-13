package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.DoctorSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorSpecialtyRepos extends JpaRepository<DoctorSpecialty, Integer> {
    DoctorSpecialty findBySpecialtyName(String specialtyName);
}
