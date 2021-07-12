package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

//custmer/notice/list.detail......
//Restcontroller = 그냥 리턴값 페이지에 띄울때
@Controller //view 를 설정하는경우
@RequestMapping("/customer/notice")
public class NoticeController {
	
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list") 
	public String list(Model model) {
		
		
		int page=1;
		String field = "title";
		String query="";
		
		
		List<NoticeView> list= service.getList(page,field,query);
		model.addAttribute("list","list");   //EL 처럼  view 단에 쓴다
		
		
		return "customer.notice.list";	//TilesViewResolver    //tiles가 우선순위 더높다
		//return "customer/notice/list"; //ResourceViewResolver
		//return "/customer/notice/list" 인데 mapping 값이랑 같으면 생략 가능 
	}
	
	
	@RequestMapping("detail")
	public String detail() {
		return "customer.notice.detail";
	}
}
