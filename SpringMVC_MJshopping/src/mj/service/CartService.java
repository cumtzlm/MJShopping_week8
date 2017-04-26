package mj.service;

import java.util.List;

import mj.domain.Cart;

public interface CartService {
	
	Cart insertcart(String user_id,String good_name,int good_number);
	
	Cart updatecart(String user_id,String good_name,int good_number);
	
	List<Cart> readcart(String user_id);

	Cart getAll(String user_id,String good_name);


}
