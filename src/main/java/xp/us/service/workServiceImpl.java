package xp.us.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xp.us.commons.JsonUtils;
import xp.us.mapper.WorkNameMapper;
import xp.us.mapper.WorkTextMapper;
import xp.us.pojo.WorkName;
import xp.us.pojo.WorkNameExample;
import xp.us.pojo.WorkText;
import xp.us.pojo.WorkTextExample;
import xp.us.pojo.WorkTextExample.Criteria;

@Service
public class workServiceImpl implements workService {
    
	@Autowired
	private WorkNameMapper workNameMapper;
	
	@Autowired
	private WorkTextMapper workTextMapper;
	
	@Override
	public String getAllTexts(int workid) {
		List<WorkText> test_list=new ArrayList<>();
		WorkTextExample workTextExample=new WorkTextExample();
		Criteria criteria=workTextExample.createCriteria();
		criteria.andWorkidEqualTo(workid);
		List<WorkText> workTexts=workTextMapper.selectByExample(workTextExample);
		for (WorkText text:workTexts) {
			int textid=text.getTextid();
			WorkText worktext=workTextMapper.selectByPrimaryKey(textid);
			test_list.add(worktext);
		}
		
		String s=JsonUtils.objectToJson(workTexts);
		return s;
	}

	@Override
	public List<WorkName> getWorkName(WorkName workName) {
		WorkNameExample workNameExample=new WorkNameExample();
		//获取所以的案例名
		List<WorkName> workNames=workNameMapper.selectByExample(workNameExample);
		//加载自动加载好第一个
		return workNames;
	}

	@Override
	public WorkText seeTextByid(int textid) {
		WorkText workText=workTextMapper.selectByPrimaryKey(textid);
		return workText;
	}

}
