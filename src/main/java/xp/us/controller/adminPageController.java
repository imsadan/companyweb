package xp.us.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.JsonUtils;
import xp.us.commons.commonReturn;
import xp.us.pojo.AboutTeam;
import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.NewsList;
import xp.us.pojo.UserList;
import xp.us.pojo.WorkName;
import xp.us.pojo.WorkText;
import xp.us.service.adminAllbasicService;
import xp.us.service.newService;
import xp.us.service.workService;

@Controller
public class adminPageController {

	@Autowired
	private workService workService;
	@Autowired
	private newService newService;

	@Autowired
	private adminAllbasicService adminAllbasicService1;

	
	@RequestMapping("/{page}")
	public String pageString(@PathVariable String page){
		return page;
	}
    
	@RequestMapping("/in")
	public String pageString1(){
		return "admin";
	}

	
	//首页广告
	@RequestMapping("/adv/save")
	@ResponseBody
	public commonReturn addIndexPic(IndexAdv indexAdv){
		adminAllbasicService1.addAdvPic(indexAdv);
		return commonReturn.ok();
	}
	
	//编辑首页广告
	@RequestMapping("/edit")
	public String editAdv(@RequestParam Integer id,Model model){
		IndexAdv adv=adminAllbasicService1.findbyId(id);
		List<IndexAdv> list=new ArrayList<>();
		list.add(adv);
		model.addAttribute("adv",list);
		return "editshow";
	}
	
	//更新首页广告
	@RequestMapping("/adv/update")
	@ResponseBody
	public commonReturn addUpdatePic(IndexAdv indexAdv){
		adminAllbasicService1.updatePic(indexAdv);
		return commonReturn.ok();
	}
	
	@RequestMapping("/adv/delete")
	@ResponseBody
	public commonReturn deleteIndexAdv(@RequestParam Integer id){
		adminAllbasicService1.deleteIndexAdv(id);
		return commonReturn.ok();
	}
	
	//首页合作客户
	@RequestMapping("/custom/save")
	@ResponseBody
	public commonReturn addIndexCustom(IndexCustom indexCustom){
		adminAllbasicService1.addCustom(indexCustom);
		return commonReturn.ok();
	}
	
	//首页合作客户id查找
	@RequestMapping(value="/custom/edit",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getCustomById(@RequestParam Integer id){
		IndexCustom custom=adminAllbasicService1.findCustomById(id);
		String s=JsonUtils.objectToJson(custom);
		return s;
	}
	
	//更新客户信息
	@RequestMapping("/custom/update")
	@ResponseBody
	public commonReturn addUpdateCustom(IndexCustom indexCustom){
		adminAllbasicService1.updateCustom(indexCustom);
		return commonReturn.ok();
	}
	
	//删除客户信息
	@RequestMapping("/page/delete")
	@ResponseBody
	public commonReturn deleteCustom(@RequestParam Integer id){
		adminAllbasicService1.deleteCustom(id);
		return commonReturn.ok();
	}
	
		
	//获取产品的导航栏信息
	@RequestMapping(value="/get/workname",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getWorkname(WorkName workName){
		List<WorkName> list=workService.getWorkName(workName);
		String string=JsonUtils.objectToJson(list);
		return string;
	}
	
	//删除导航标签
	@RequestMapping("/nav/delete")
	@ResponseBody
	public commonReturn deleteNav(@RequestParam Integer workid){
		adminAllbasicService1.deleteNav(workid);
		return commonReturn.ok();
	}

	//新闻列表
	@RequestMapping("/article")
	public String newsPages(@RequestParam(value="currentPage",defaultValue="1",required=false)
	     Integer currentPage,Model model,NewsList newsList){
		model.addAttribute("pagemsg2",newService.findByPage(currentPage));
		return "article";
	}
	
	//添加新闻
	@RequestMapping("/news/save")
	@ResponseBody
	public commonReturn insertNews(NewsList newsList){
		adminAllbasicService1.insertNews(newsList);
		return commonReturn.ok();
	}
	
	//删除新闻
	@RequestMapping("/article/delete")
	@ResponseBody
	public commonReturn deleteArticle(@RequestParam Integer id){
		adminAllbasicService1.deleteNews(id);
		return commonReturn.ok();
	}
	
	//首页id查找新闻
	@RequestMapping(value="/news/edit",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getNewsById(@RequestParam Integer id){
		NewsList newsList=adminAllbasicService1.findNewsById(id);
		List<NewsList> list=new ArrayList<>();
		list.add(newsList);
		String s=JsonUtils.objectToJson(list);
		return s;
	}
	
	//更新新闻
	@RequestMapping("/news/update")
	@ResponseBody
	public commonReturn UpdateNews(NewsList newsList){
		adminAllbasicService1.updateNews(newsList);
		return commonReturn.ok();
	}
	
	//按id获取的产品信息
	@RequestMapping(value="/get/works",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getWork(@RequestParam Integer workid){
		List<WorkText> workTexts=adminAllbasicService1.getWorkTexts(workid);
		String string=JsonUtils.objectToJson(workTexts);
		return string;
	}
	
	//删除产品
	@RequestMapping("/worktext/delete")
	@ResponseBody
	public commonReturn deleteWorktext(@RequestParam Integer textid){
		adminAllbasicService1.deleteWorktext(textid);
		return commonReturn.ok();
	}
	
	//按照id查找
	@RequestMapping(value="/worktext/edit",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getWorktextById(@RequestParam Integer textid){
		WorkText workText=adminAllbasicService1.findWorkText(textid);
		List<WorkText> list=new ArrayList<>();
		list.add(workText);
		String s=JsonUtils.objectToJson(list);
		return s;
	}
   
	//更新产品
	@RequestMapping("/worktext/update")
	@ResponseBody
	public commonReturn UpdateWorktext(WorkText workText){
		adminAllbasicService1.updateWorktext(workText);
		return commonReturn.ok();
	}
	
	//添加产品
	@RequestMapping("/worktext/save")
	@ResponseBody
	public commonReturn addworktext(WorkText workText,@RequestParam Integer workid){
		adminAllbasicService1.addworktext(workText, workid);
		return commonReturn.ok();
	}
	
	//登录用户
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	@ResponseBody
	public commonReturn userLogin(String name,String password,HttpSession httpSession){
		try {
			commonReturn result=adminAllbasicService1.userLogin(name, password, httpSession);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return commonReturn.build(500,e.getMessage());
		}
	}
	
	//管理用户(显示)
	@RequestMapping("/get/users")
	@ResponseBody
	public String getAllRootUser(UserList userList){
		List<UserList> list=adminAllbasicService1.getAllRootUser(userList);
		String result=JsonUtils.objectToJson(list);
		return result;
	}
	
	//注册管理员
	@RequestMapping(value="/user/register",method=RequestMethod.POST)
	@ResponseBody
	public commonReturn saveUser(UserList userList){
		try {
			commonReturn result=adminAllbasicService1.saveUser(userList);
			return result;
		} catch (Exception e) {
			return commonReturn.build(500,e.getMessage());
		}
	}
	
	
	//验证
	@RequestMapping("/user/check/{param}/{type}")
	@ResponseBody
	public Object checkUser(@PathVariable String param,
			@PathVariable Integer type,String callback){
		commonReturn result=null;
		// 参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = commonReturn.build(400, "校验内容不能为空");
		}
		if (type == null) {
			result = commonReturn.build(400, "校验内容类型不能为空");
		}
		if (type != 1) {
			result = commonReturn.build(400, "校验内容类型错误");
		}
		// 校验出错
		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(
						result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}
		// 调用服务
			try {
				result = adminAllbasicService1.checkUser(param, type);

			} catch (Exception e) {
				result =commonReturn.build(500, e.getMessage());
			}

			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(
						result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
      }
	
	//删除管理员
	@RequestMapping("/manager/delete")
	@ResponseBody
	public commonReturn deleteUser(@RequestParam Integer id){
		adminAllbasicService1.deleteUser(id);
		return commonReturn.ok();
	}
	
	//id查找新闻
	@RequestMapping("/editNews/{id}")
	public String editNews(@PathVariable Integer id,Model model){
		NewsList newsList=adminAllbasicService1.findNewsbyId(id);
		List<NewsList> list=new ArrayList<>();
		list.add(newsList);
		model.addAttribute("news",list);
		return "editarticle";
	}
	
	//注销
	@RequestMapping("/user/exit")
	public String loginOut(HttpSession httpSession){
		adminAllbasicService1.loginOut(httpSession);
		return "redirect:/";
	}
	
	//查找要修改的个人信息
	@RequestMapping("/edit/manager")
	public String findManagerById(@RequestParam Integer id,Model model){
		UserList list=adminAllbasicService1.findManagerById(id);
		List<UserList> lists=new ArrayList<>();
		lists.add(list);
		model.addAttribute("updateUser",lists);
		return "editmanager";
	}
	
	//更新管理员信息
	@RequestMapping(value="/user/update",method=RequestMethod.POST)
	@ResponseBody
	public commonReturn updateManager(UserList userList,HttpSession httpSession){
		adminAllbasicService1.updateManager(userList,httpSession);
		return commonReturn.ok();
	}
	
	//获取团队成员信息
	@RequestMapping(value="/get/team",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getTeams(AboutTeam aboutTeam){
		List<AboutTeam> list=adminAllbasicService1.getTeams(aboutTeam);
		String s=JsonUtils.objectToJson(list);
		return s;
	}
	
	//id获取修改成员
	@RequestMapping(value="/team/edit",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getTeamEdit(@RequestParam Integer id){
		AboutTeam aboutTeam=adminAllbasicService1.findAboutTeamById(id);
		String result=JsonUtils.objectToJson(aboutTeam);
		return result;
	}
	
	//删除团队成员
	@RequestMapping("/team/delete")
	@ResponseBody
	public commonReturn deleteTeam(@RequestParam Integer id){
		adminAllbasicService1.deleteTeam(id);
		return commonReturn.ok();
	}
	
	//更新成员信息
	@RequestMapping("/team/update")
	@ResponseBody
	public commonReturn updateTeam(AboutTeam aboutTeam){
		adminAllbasicService1.updateTeam(aboutTeam);
		return commonReturn.ok();
	}
	
	@RequestMapping("/team/save")
	@ResponseBody
	public commonReturn saveTeam(AboutTeam aboutTeam){
		adminAllbasicService1.addTeam(aboutTeam);
		return commonReturn.ok();
	}
	
	
}
