package com.CafeStore_TEST.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.CafeStore_TEST.entity.Cart;
import com.CafeStore_TEST.entity.User;

public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
