package xp.us.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import xp.us.commons.Mail;
import xp.us.commons.MailUtil;
import xp.us.commons.Mailpojo;
import xp.us.commons.commonReturn;
import xp.us.commons.pageHelps;
import xp.us.mapper.AboutTeamMapper;
import xp.us.mapper.IndexAdvMapper;
import xp.us.mapper.IndexCustomMapper;
import xp.us.mapper.NewsListMapper;
import xp.us.mapper.UserListMapper;
import xp.us.mapper.WorkNameMapper;
import xp.us.mapper.WorkTextMapper;
import xp.us.pojo.AboutTeam;
import xp.us.pojo.AboutTeamExample;
import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.NewsList;
import xp.us.pojo.NewsListExample;
import xp.us.pojo.UserList;
import xp.us.pojo.UserListExample;
import xp.us.pojo.WorkText;
import xp.us.pojo.WorkTextExample;
import xp.us.pojo.WorkTextExample.Criteria;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class adminAllbasicServiceImpl implements adminAllbasicService{
    
	@Autowired
	private IndexAdvMapper indexAdvMapper;	
	@Autowired
	private IndexCustomMapper indexCustomMapper;
	@Autowired
	private WorkNameMapper workNameMapper;
	@Autowired
	private NewsListMapper newsListMapper;
	@Autowired
	private WorkTextMapper workTextMapper;
	@Autowired
	private UserListMapper userListMapper;
	@Autowired
	private AboutTeamMapper aboutTeamMapper;
	
	@Override
	public commonReturn addAdvPic(IndexAdv indexAdv) {
		IndexAdv indexAdv2=new IndexAdv();
		indexAdv2.setId(indexAdv.getId());
		indexAdv2.setImage(indexAdv.getImage());
		indexAdv2.setAdvname(indexAdv.getAdvname());
		//补充
		indexAdv2.setAdvarticle("");
		indexAdv2.setAdvurl("");
		indexAdvMapper.insert(indexAdv2);
		return commonReturn.ok();
	}


	@Override
	public IndexAdv findbyId(int id) {
		IndexAdv adv=indexAdvMapper.selectByPrimaryKey(id);
		return adv;
	}


	@Override
	public commonReturn updatePic(IndexAdv indexAdv) {
		indexAdvMapper.updateByPrimaryKey(indexAdv);
		return commonReturn.ok();
	}
    

	@Override
	public commonReturn deleteIndexAdv(int id) {
		indexAdvMapper.deleteByPrimaryKey(id);
		return commonReturn.ok();
	}

	@Override
	public commonReturn addCustom(IndexCustom indexCustom) {
		IndexCustom custom=new IndexCustom();
		custom.setId((int) (Math.random()*9999));
		custom.setName(indexCustom.getName());
		custom.setImage(indexCustom.getImage());
		custom.setOther(indexCustom.getOther());
		indexCustomMapper.insert(custom);
		return commonReturn.ok();
	}
    

	@Override
	public IndexCustom findCustomById(int id) {
		IndexCustom custom=indexCustomMapper.selectByPrimaryKey(id);
		return custom;
	}


	@Override
	public commonReturn updateCustom(IndexCustom indexCustom) {
		indexCustomMapper.updateByPrimaryKey(indexCustom);
		return commonReturn.ok();
	}


	@Override
	public commonReturn deleteCustom(int id) {
		indexCustomMapper.deleteByPrimaryKey(id);
		return commonReturn.ok();
	}


	@Override
	public commonReturn deleteNav(int workid) {
		workNameMapper.deleteByPrimaryKey(workid);
		return commonReturn.ok();
	}


	@Override
	public pageHelps getNews(int page, int rows) {
		NewsListExample example=new NewsListExample();
		//分页
		PageHelper.startPage(page,rows);
		List<NewsList> newsLists=newsListMapper.selectByExample(example);
		pageHelps reHelps=new pageHelps();
		reHelps.setRows(newsLists);
		//取值
		PageInfo<NewsList> pageInfo=new PageInfo<>();
		reHelps.setTotal((int)pageInfo.getTotal());
		return reHelps;
	}


	@Override
	public commonReturn insertNews(NewsList newsList) {
		NewsList list=new NewsList();
		list.setNewname(newsList.getNewname());
		list.setNewtext(newsList.getNewtext());
		list.setMaintext(newsList.getMaintext());
		list.setImage(newsList.getImage());
		//补全
		list.setId((int) (Math.random()*100));
        list.setNewdate(new Date());
        //添加
        newsListMapper.insert(list);
        return commonReturn.ok();
	}


	@Override
	public commonReturn deleteNews(int id) {
		newsListMapper.deleteByPrimaryKey(id);
		return commonReturn.ok();
	}


	@Override
	public NewsList findNewsById(int id) {
		NewsList newsList=newsListMapper.selectByPrimaryKey(id);
		return newsList;
	}


	@Override
	public commonReturn updateNews(NewsList newsList) {
		newsList.setNewdate(new Date());
		newsListMapper.updateByPrimaryKey(newsList);
		return commonReturn.ok();
	}


	@Override
	public List<WorkText> getWorkTexts(int workid) {
		//保存产品的list
		List<WorkText> list=new ArrayList<>();
		//按workid查找对应的产品（1对多）
		WorkTextExample example=new WorkTextExample();
		Criteria criteria=example.createCriteria();
		criteria.andWorkidEqualTo(workid);
		List<WorkText> workTexts=workTextMapper.selectByExample(example);
		for(WorkText text:workTexts){
			int textid=text.getTextid();
			//获取单个产品
			WorkText workText=workTextMapper.selectByPrimaryKey(textid);
			list.add(workText);
		}
		return list;
	}


	@Override
	public commonReturn deleteWorktext(int textid) {
		workTextMapper.deleteByPrimaryKey(textid);
		return commonReturn.ok();
	}


	@Override
	public WorkText findWorkText(int textid) {
		WorkText text=workTextMapper.selectByPrimaryKey(textid);
		return text;
	}


	@Override
	public commonReturn updateWorktext(WorkText workText) {
		workTextMapper.updateByPrimaryKey(workText);
		return commonReturn.ok();
	}


	@Override
	public commonReturn addworktext(WorkText workText, int workid) {
		WorkText workText2=new WorkText();
		workText2.setTextid(workText.getTextid());
		workText2.setTextname(workText.getTextname());
		workText2.setWorkid(workid);
		workText2.setDiec(workText.getDiec());
		workText2.setImage(workText.getImage());
		workTextMapper.insert(workText2);
		return commonReturn.ok();
	}


	@Override
	public commonReturn userLogin(String name, String password,HttpSession httpSession) {
		UserListExample example=new UserListExample();
		xp.us.pojo.UserListExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(name);
		List<UserList> list=userListMapper.selectByExample(example);
		if (list.size()==0||list==null) {
			return commonReturn.build(400,"用户名或密码错误");
		}
		
		UserList user=list.get(0);
		user.setLogindate(new Date());
		userListMapper.updateByPrimaryKey(user);
		//对比密码
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())) {
			return commonReturn.build(400,"用户名或密码错误");
		}
		
		httpSession.setAttribute("userLogin",user);
		return commonReturn.ok();
	}


	@Override
	public List<UserList> getAllRootUser(UserList userList) {
		UserListExample example=new UserListExample();
		List<UserList> list=userListMapper.selectByExample(example);
		return list;
	}


	@Override
	public commonReturn saveUser(UserList userList) {
		int id=(int)(Math.random()*9999);
		userList.setId(id);
		//密码处理
		userList.setPassword(DigestUtils.md5DigestAsHex(userList.getPassword().getBytes()));
		userList.setCreatedate(new Date());
		userListMapper.insert(userList);
		return commonReturn.ok();
	}


	@Override
	public commonReturn checkUser(String content, Integer type) {
		UserListExample example=new UserListExample();
		xp.us.pojo.UserListExample.Criteria criteria=example.createCriteria();
		if (type==1) {
			criteria.andNameEqualTo(content);
		}
		//查询
		List<UserList> list=userListMapper.selectByExample(example);
		if (list==null||list.size()==0) {
			return commonReturn.ok(true);
		}
		return commonReturn.ok(false);
	}


	@Override
	public commonReturn deleteUser(int id) {
		userListMapper.deleteByPrimaryKey(id);
		return commonReturn.ok();
	}


	@Override
	public NewsList findNewsbyId(int id) {
		NewsList newsList=newsListMapper.selectByPrimaryKey(id);
		return newsList;
	}


	@Override
	public commonReturn loginOut(HttpSession httpSession) {
		httpSession.removeAttribute("userLogin");
		return commonReturn.ok();
	}


	@Override
	public UserList findManagerById(int id) {
		UserList userList=userListMapper.selectByPrimaryKey(id);
		return userList;
	}


	@Override
	public commonReturn updateManager(UserList userList,HttpSession httpSession) {
		userListMapper.updateByPrimaryKey(userList);
		httpSession.setAttribute("userLogin", userList);
		return commonReturn.ok();
	}


	@Override
	public List<AboutTeam> getTeams(AboutTeam aboutTeam) {
		AboutTeamExample example=new AboutTeamExample();
		List<AboutTeam> aboutTeams=aboutTeamMapper.selectByExample(example);
		return aboutTeams;
	}


	@Override
	public AboutTeam findAboutTeamById(int id) {
		AboutTeam team=aboutTeamMapper.selectByPrimaryKey(id);
		return team;
	}


	@Override
	public commonReturn deleteTeam(int id) {
		aboutTeamMapper.deleteByPrimaryKey(id);
		return commonReturn.ok();
	}


	@Override
	public commonReturn updateTeam(AboutTeam aboutTeam) {
		aboutTeamMapper.updateByPrimaryKey(aboutTeam);
		return commonReturn.ok();
	}


	@Override
	public commonReturn addTeam(AboutTeam aboutTeam) {
		AboutTeam aboutTeam2=new AboutTeam();
		aboutTeam2.setId(aboutTeam.getId());
		aboutTeam2.setName(aboutTeam.getName());
		aboutTeam2.setIntro(aboutTeam.getIntro());
		aboutTeam2.setImage(aboutTeam.getImage());
		//添加
		aboutTeamMapper.insert(aboutTeam2);
		return commonReturn.ok();
	}


	@Override
	public commonReturn sendMail(Mailpojo mailpojo) {
		 Mail mail = new Mail();
	        // 设置邮件服务器 
	        mail.setHost("smtp.163.com");
	        // 发件人邮件地址
	        mail.setSender("13646738449@163.com");
	        // 发件人名称
	        mail.setName(mailpojo.getEmail());
	        // 登录账号,一般都是和邮箱名一样吧  
	        mail.setUsername("13646738449@163.com");
	        // 发件人邮箱的登录密码  
	        mail.setPassword("1012665655");
	        // 接收人  
	        mail.setReceiver("1012665655@qq.com");
	        mail.setSubject("信普官网邮件信息接收反馈");
	        //内容信息
	        mail.setMessage("<h3 style=\"color:red;\">姓名:</h3>"+"<p style=\"font-size:20px;\">"+mailpojo.getUsername()+"</p>"+"<h3 style=\"color:red;\">手机联系电话:</h3>"+"<p style=\"font-size:20px;\">"+mailpojo.getPhone()+"</p>"+"<h3 style=\"color:red;\">具体的信息或反馈:</h3>"+"<p style=\"font-size:20px;\">"+mailpojo.getInformation()+"</p>");
	        
	        new MailUtil().send(mail);
		return commonReturn.ok();
	}






}
