package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
