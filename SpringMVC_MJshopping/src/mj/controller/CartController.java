package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mj.domain.Cart;
import mj.domain.Good;
import mj.service.CartService;
import mj.service.GoodService;

@Controller
public class CartController {

	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	
	@SuppressWarnings("unused")//取消警告
	@RequestMapping(value="/cartbutton")
	public ModelAndView cart(ModelAndView mv,
			HttpSession session,HttpServletRequest request,
			 HttpServletResponse response,
			String good_name,int good_number){
		String user_id=(String) session.getAttribute("numb");//将用户id的值赋值给cart_list
		Cart cartt=cartService.getAll(user_id,good_name);
		int b=0;
		if(cartt==null){
			Cart cart_2=cartService.insertcart(user_id, good_name, good_number);//如果不存在则插入数量
		}else
		{
			b=cartt.getCart_number();
			good_number=good_number+b;
			Cart cart3=cartService.updatecart(user_id, good_name, good_number);//如果存在则更新数量
		}
		List<Cart> cart=cartService.readcart(user_id);
		session.setAttribute("cart", cart);//从数据库里取值
		mv.setViewName("cart");
		return mv;
	}
	
	
}
