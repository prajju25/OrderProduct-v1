package com.brillio.order.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.brillio.order.model.Order;

public interface IOrderRepo extends JpaRepository<Order, String>{

	@Query("select o from Order o where o.userId = (?1)")
	List<Order> findAllByUserID(int userId);
}
