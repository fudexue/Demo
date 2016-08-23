package com.service.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.entity.DemoEntity;
import com.service.service.DemoService;

@Controller
public class DemoController {
	public static final Logger logger = Logger.getLogger(DemoController.class);
	@Resource
	private DemoService demoService;

	/**
	 * 首页
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("/index.html")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		logger.info(" " + " " + " 获取到数据");
		List<DemoEntity> demoList = demoService.getDemoList();
		model.put("demoList", demoList);
		return "index";
	}
}
