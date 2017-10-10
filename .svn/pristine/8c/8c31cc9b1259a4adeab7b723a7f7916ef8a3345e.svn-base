package xp.us.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xp.us.commons.Mailpojo;
import xp.us.commons.commonReturn;
import xp.us.service.adminAllbasicService;

@Controller
public class mailController {
     
	@Autowired
	private adminAllbasicService adminAllbasicService;
	
	@RequestMapping("/send/mail")
	@ResponseBody
	public commonReturn sendMail(Mailpojo mailpojo){
        adminAllbasicService.sendMail(mailpojo);
        return commonReturn.ok();
	}   
}
