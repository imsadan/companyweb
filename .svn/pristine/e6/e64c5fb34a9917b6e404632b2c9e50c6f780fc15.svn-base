package xp.us.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xp.us.commons.Page;
import xp.us.mapper.NewsListMapper;
import xp.us.pojo.NewsList;
import xp.us.pojo.NewsListExample;

@Service
public class newSercieImpl implements newService{
    
	@Autowired
	private NewsListMapper newsListMapper;
	
	@Override
	public List<NewsList> getBaseInfo(NewsList newsList) {
		NewsListExample example=new NewsListExample();
		List<NewsList> newsLists=newsListMapper.selectByExample(example);
		return newsLists;
	}

	@Override
	public NewsList getMainInfoById(int id) {
		NewsList newsList=newsListMapper.selectByPrimaryKey(id);
		return newsList;
	}
	
	@Override
	public int selectCount() {
		return newsListMapper.selectCount();
	}

	@Override
	public Page<NewsList> findByPage(int currentPage) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		Page<NewsList> pages=new Page<>();
		//当前页面
		pages.setCurrPage(currentPage);
		//显示数据
		int pageSize=3;
		pages.setPageSize(pageSize);
		//总数
		int totalCount=newsListMapper.selectCount();
		pages.setTotalCount(totalCount);
		//总页数
		double tc=totalCount;
		Double number=Math.ceil(tc/pageSize);
		pages.setTotalPage(number.intValue());
		
		map.put("start",(currentPage-1)*pageSize);
		map.put("size",pages.getPageSize());
		//每页显示数据
		List<NewsList> list=newsListMapper.findByPage(map);
		pages.setLists(list);
		return pages;
	}

}
