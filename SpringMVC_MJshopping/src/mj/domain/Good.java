package mj.domain;

import java.io.Serializable;

public class Good implements Serializable{

	public String good_id ;
	public String good_name;
	public int good_price;
	
	public String getGood_id() {
		return good_id;
	}

	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public int getGood_price() {
		return good_price;
	}

	public void setGood_price(int good_price) {
		this.good_price = good_price;
	}

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public String toString() {
		return "Good [good_id=" + good_id +",good_name="+good_name + ", good_price="
				+ good_price + "]";
	}
	
	
}
