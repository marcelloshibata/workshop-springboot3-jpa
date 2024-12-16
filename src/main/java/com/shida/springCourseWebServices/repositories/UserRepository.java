package com.shida.springCourseWebServices.repositories;

import com.shida.springCourseWebServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
