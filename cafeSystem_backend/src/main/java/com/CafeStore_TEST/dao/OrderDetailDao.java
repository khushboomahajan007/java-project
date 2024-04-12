package com.CafeStore_TEST.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CafeStore_TEST.entity.OrderDetail;
import com.CafeStore_TEST.entity.User;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>
{

	public List<OrderDetail> findByUser(User user);
	
	public List<OrderDetail> findByOrderStatus(String status);
}
