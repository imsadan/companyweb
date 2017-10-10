package xp.us.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.pojo.WorkName;
import xp.us.pojo.WorkText;
import xp.us.service.workService;

@Controller
public class workController {
   
	@Autowired
	private workService workService;
	
	//tab框
	@RequestMapping(value="/work/getText", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String workTexts( Integer workid){
		 String result=workService.getAllTexts(workid);		 
		 return result;
	}
	
	//加载works页面并显示标题
	@RequestMapping("/works")
	public String getAllWorkName(WorkName workName,Model model){
		List<WorkName> workNameslist=workService.getWorkName(workName);
		model.addAttribute("workname",workNameslist);
		return "works";
	}
	
	//详细产品信息
	@RequestMapping("/works_list")
	public String  getTextsById(@RequestParam Integer textid,Model model){
		WorkText workText=workService.seeTextByid(textid);
		List<WorkText> list=new ArrayList<>();
		list.add(workText);
		model.addAttribute("desc",list);
		return "works_list";
	}
	
	
	
	
	
}
