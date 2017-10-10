package xp.us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.JsonUtils;
import xp.us.commons.commonReturn;
import xp.us.pojo.ComeStatistic;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.NewsList;
import xp.us.service.adminstatisticService;

@Controller
public class adminstatisticController {
    
	@Autowired
	private adminstatisticService adminstatisticService;
	
	@RequestMapping("/admin/statistic")
	@ResponseBody
	public String returnSumJson(){
		List<Integer> list=adminstatisticService.getOtherSum();
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
	//统计
	@RequestMapping("/comeIn/index")
	@ResponseBody
	public commonReturn statisticSum(ComeStatistic comeStatistic){
		adminstatisticService.getComeStatistic(comeStatistic);
		return commonReturn.ok();
	}
	
	//显示
	@RequestMapping("/get/adminSum")
	@ResponseBody
	public String showStstistic(){
		List<ComeStatistic> list=adminstatisticService.showAllStatistics();
		String s=JsonUtils.objectToJson(list);
		return s;
	}
	
	//显示局部信息
	@RequestMapping(value="/get/article",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getArticles(NewsList newsList){
		List<NewsList> list=adminstatisticService.getNewslist(newsList);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
	
	@RequestMapping(value="/get/custom",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getCustoms(IndexCustom indexCustom){
		List<IndexCustom> list=adminstatisticService.getCustom(indexCustom);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
}
