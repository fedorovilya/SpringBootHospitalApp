package com.spring.hospital.app.entities.service_entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "hospital_logs")
public class HospitalLog {
    @Id
    @Column(name = "order_or_treatment_id")
    private int id;
}
