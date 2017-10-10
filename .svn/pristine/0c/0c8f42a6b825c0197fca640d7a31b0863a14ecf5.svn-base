package xp.us.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.JsonUtils;
import xp.us.commons.Page;
import xp.us.pojo.NewsList;
import xp.us.service.newService;

@Controller
public class newController {
    
	@Autowired
	private newService newService;
	
	
	@RequestMapping("/reads/{id}")
	public String getMainInfo(@PathVariable Integer id,Model model){
		NewsList newsList=newService.getMainInfoById(id);
		List<NewsList> list=new ArrayList<>();
		list.add(newsList);
		model.addAttribute("readsList",list);
		List<NewsList> list2=newService.getBaseInfo(newsList);
		model.addAttribute("newsAll",list2);
		return "read_list";
	}
	
	
	@RequestMapping(value="/get/reads",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getNewsAll(NewsList newsList){
		List<NewsList> list=newService.getBaseInfo(newsList);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
	
	@RequestMapping(value="/get/pageNews",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getPageNews(@RequestParam(value="currentPage",defaultValue="1",required=false)
    Integer currentPage){
		Page<NewsList> page=newService.findByPage(currentPage);
		List<Page<NewsList>> list=new ArrayList<>();
		list.add(page);
		String s=JsonUtils.objectToJson(list);
		return s;
		
	}
	
	@RequestMapping(value="/getAll/news",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getNews(NewsList newsList){
		List<NewsList> list=newService.getBaseInfo(newsList);
		String string=JsonUtils.objectToJson(list);
		return string;
	}
	
	
}
