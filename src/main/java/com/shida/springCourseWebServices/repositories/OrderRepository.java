package com.shida.springCourseWebServices.repositories;

import com.shida.springCourseWebServices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
