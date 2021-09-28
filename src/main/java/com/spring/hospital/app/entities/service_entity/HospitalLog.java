package com.spring.hospital.app.entities.service_entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "hospital_logs")
public class HospitalLog {
    @Id
    @Column(name = "order_or_treatment_id")
    private int id;

    @Column(name = "operation_type")
    private String operationType;

    @Column(name = "log_date")
    private Timestamp logDate;
}
