package com.shida.springCourseWebServices.repositories;

import com.shida.springCourseWebServices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
