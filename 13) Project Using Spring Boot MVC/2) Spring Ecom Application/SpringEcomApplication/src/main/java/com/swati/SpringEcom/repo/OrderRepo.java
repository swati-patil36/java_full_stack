package com.swati.SpringEcom.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.SpringEcom.model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

    Optional<Order> findByOrderId(String orderId);
    
}
