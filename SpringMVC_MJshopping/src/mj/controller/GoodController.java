package mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.Good;
import mj.service.GoodService;

/**
 * 处理物品请求控制器
 * */
@Controller
public class GoodController {
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("goodService")
	private GoodService goodService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/shop")
	 public String main(Model model){
		// 获得所有物品
		List<Good> good_list = goodService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("good_list", good_list);
		// 跳转到shop页面
		return "shop";
	}
}
