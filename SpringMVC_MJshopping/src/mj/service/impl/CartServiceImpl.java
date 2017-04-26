package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Cart;
import mj.mapper.CartMapper;
import mj.service.CartService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;


	@Override
	public Cart insertcart(String user_id, String good_name, int good_number) {
		return cartMapper.insertcart(user_id,good_name,good_number);
	}

	@Override
	public List<Cart> readcart(String user_id) {
		return cartMapper.readcart(user_id);
	}

	@Override
	public Cart updatecart(String user_id, String good_name, int good_number) {
		return cartMapper.updatecart(user_id,good_name,good_number);
	}

	@Override
	public Cart getAll(String user_id, String good_name) {
		return cartMapper.getAll(user_id, good_name);
	}



}
