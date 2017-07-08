package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Items;
import service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	@RequestMapping(value = "/list")
	public ModelAndView list() throws Exception{
		List<Items> list = itemsService.list();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", list);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
}
