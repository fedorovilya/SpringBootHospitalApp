package com.spring.hospital.app.services;

import com.spring.hospital.app.entities.*;
import com.spring.hospital.app.repositories.OrderRepos;
import com.spring.hospital.app.repositories.PatientRepos;
import com.spring.hospital.app.repositories.TreatmentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepos orderRepos;
    private TreatmentRepos treatmentRepos;
    private PatientRepos patientRepos;

    @Autowired
    public void setOrderRepos(OrderRepos orderRepos) {
        this.orderRepos = orderRepos;
    }
    @Autowired
    public void setTreatmentRepos(TreatmentRepos treatmentRepos) {
        this.treatmentRepos = treatmentRepos;
    }
    @Autowired
    public void setPatientRepos(PatientRepos patientRepos) {
        this.patientRepos = patientRepos;
    }

    public List<Order> getOrdersByAll(){
        return orderRepos.findAll();
    }

    public Order getOrderById(Integer id){
        Optional<Order> order = Optional.of(orderRepos.getById(id));
        return order.orElse(null);
    }

    public List <Order> findOrdersByParams(Integer id, Integer patientId, String lastName, String firstName, String middleName, Timestamp timestamp){
        List <Order> orders = null;

        if (id != null) {
            orders.add(getOrderById(id));
            return orders;
        }
/*        if (lastName != null)

            return orders;
        return orders;*/
        return orders;
    }

    public void saveOrder(Order order){
        orderRepos.save(order);
    }

    public void saveOrderWithParams(Integer id, Integer patientId){
        Order order = new Order();
        Patient patient = new Patient();
        if (patientRepos.existsById(id)) patient = patientRepos.getById(id);

        order.setId(id);
        order.setPatient(patient);
        order.setDatatime(new Timestamp(System.currentTimeMillis()));

        orderRepos.save(order);
    }

    public void editOrderWithParams(Integer id, Integer patientId){
        if(orderRepos.existsById(id)){
            saveOrderWithParams(id, patientId);
        }
    }

    public List <Treatment> getOrderTreatmentsByOrderId(Integer id){
        Order order = orderRepos.getById(id);
        List<Treatment> treatments = order.getTreatments();
        return treatments;
    }

    public void deleteOrderById(Integer id){
        orderRepos.deleteById(id);
    }
}
