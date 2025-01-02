package com.shida.springCourseWebServices.repositories;

import com.shida.springCourseWebServices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
