package xp.us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.JsonUtils;
import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexCustom;
import xp.us.service.IndexPicService;

@Controller
public class pageController {
   
	@Autowired
	private IndexPicService indexPicService;
	
	@RequestMapping("/")
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping("/adminlogin")
	public String admin(){
		return "login";
	}
	
	@RequestMapping(value="/index/getTabPic1",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getAdvs(IndexAdv indexAdv){
		List<IndexAdv> list=indexPicService.getAdvs(indexAdv);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
	@RequestMapping(value="/index/custom",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getcustom(IndexCustom indexCustom){
		List<IndexCustom> list=indexPicService.getCustoms(indexCustom);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
}
