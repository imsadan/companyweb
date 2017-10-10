package xp.us.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.JsonUtils;
import xp.us.pojo.AboutTeam;
import xp.us.service.mapService;
import xp.us.service.teamService;

@Controller
public class mapController {
    
	@Autowired
	private mapService mapService;
	
	@Autowired
	private teamService teamService;
	
	@RequestMapping("/about")
	public String map(AboutTeam aboutTeam,Model model){
		List<AboutTeam> list=teamService.getAllteams(aboutTeam);
		model.addAttribute("teams", list);
		return "about";
	}
	
/*	@RequestMapping(value="/about/getTeam",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getTeams(AboutTeam aboutTeam){
		List<AboutTeam> list=teamService.getAllteams(aboutTeam);
		String result=JsonUtils.objectToJson(list);
		return result;
	}*/
	
	@RequestMapping(value="/maps",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String returnMapJson(){
		String result=mapService.getMapInfo();
		return result;
	}
}
