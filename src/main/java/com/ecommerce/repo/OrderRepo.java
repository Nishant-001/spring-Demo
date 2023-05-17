package com.ecommerce.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
    List<Order> findAllByUserId(Long userId);
}
