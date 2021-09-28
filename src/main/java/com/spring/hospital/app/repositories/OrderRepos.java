package com.spring.hospital.app.repositories;

import com.spring.hospital.app.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepos extends JpaRepository <Order, Integer> {

}
