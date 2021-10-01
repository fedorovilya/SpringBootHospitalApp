package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.DoctorCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepos extends JpaRepository<DoctorCategory,Integer> {
    DoctorCategory findByCategoryName(String categoryName);
}
