package mj.domain;

import java.io.Serializable;

public class Cart implements Serializable{

	public String cart_id;
	public String cart_name;
	public int cart_number;
	public String getCart_id() {
		return cart_id;
	}


	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}


	public String getCart_name() {
		return cart_name;
	}


	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}


	public int getCart_number() {
		return cart_number;
	}


	public void setCart_number(int cart_number) {
		this.cart_number = cart_number;
	}


	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cart_name=" + cart_name + ", cart_number="
				+ cart_number + "]";
	}
	
	
}
