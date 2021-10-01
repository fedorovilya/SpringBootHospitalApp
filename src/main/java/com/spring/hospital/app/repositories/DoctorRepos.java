package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.entities.DoctorCategory;
import com.spring.hospital.app.entities.DoctorSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepos extends JpaRepository <Doctor, Integer> {
    List<Doctor> findByFirstNameAndLastNameAndMiddleNameAndAndDoctorCategoryAndDoctorSpecialty(String firstName,
                                                                                               String lastName,
                                                                                               String middleName,
                                                                                               DoctorCategory doctorCategory,
                                                                                               DoctorSpecialty doctorSpecialty);
    List<Doctor> findByFirstNameAndLastNameAndMiddleName(String firstName, String lastName, String middleName);
    List<Doctor> findByFirstName(String firstName);
    List<Doctor> findByLastName(String lastName);
    List<Doctor> findByMiddleName(String middleName);
    List<Doctor> findByDoctorCategory(DoctorCategory doctorCategory);
    List<Doctor> findByDoctorSpecialty(DoctorSpecialty doctorSpecialty);
}
