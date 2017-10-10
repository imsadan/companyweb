package xp.us.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Data;

import xp.us.commons.commonReturn;
import xp.us.mapper.AboutTeamMapper;
import xp.us.mapper.ComeStatisticMapper;
import xp.us.mapper.IndexCustomMapper;
import xp.us.mapper.NewsListMapper;
import xp.us.mapper.UserListMapper;
import xp.us.mapper.WorkTextMapper;
import xp.us.pojo.ComeStatistic;
import xp.us.pojo.ComeStatisticExample;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.IndexCustomExample;
import xp.us.pojo.NewsList;
import xp.us.pojo.NewsListExample;


@Service
public class adminstatisticServiceImpl implements adminstatisticService {
    

	@Autowired
	private IndexCustomMapper indexCustomMapper;
	@Autowired
	private NewsListMapper newsListMapper;
	@Autowired
	private WorkTextMapper workTextMapper;
	@Autowired
	private UserListMapper userListMapper;
	@Autowired
	private AboutTeamMapper aboutTeamMapper;
	@Autowired
	private ComeStatisticMapper comeStatisticMapper;
	
	@Override
	public List<Integer> getOtherSum() {
		//管理员人数
		int manager=userListMapper.getSum();
		//展示产品
		int work_text=workTextMapper.getSum();
		//新闻
		int news=newsListMapper.selectCount();
		//团队
		int teams=aboutTeamMapper.getSum();
		//合作客户
		int custom=indexCustomMapper.getSum();
		
		List<Integer> list=new ArrayList<>();
		list.add(manager);
		list.add(work_text);
		list.add(news);
		list.add(teams);
		list.add(custom);
		return list;
	}

	@Override
	public commonReturn getComeStatistic(ComeStatistic comeStatistic) {
        Date data=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        String dataString=sf.format(data);
        ComeStatisticExample example=new ComeStatisticExample();
        //获取所有存在的统计数据
        List<ComeStatistic> list=comeStatisticMapper.selectByExample(example);
        boolean flag = false;
        for(ComeStatistic statistic:list){
        	if (statistic.getComedata().equals(dataString)) {
				statistic.setComesum(statistic.getComesum()+1);
				statistic.setComedata(dataString);
				comeStatisticMapper.updateByData(statistic);
				flag=false;
				break;
			}
        	flag=true;
        }
        if (flag==true) {
			comeStatistic.setComesum(1);
			comeStatistic.setComedata(dataString);
			comeStatisticMapper.insert(comeStatistic);
		}
		return commonReturn.ok();
	}

	@Override
	public List<ComeStatistic> showAllStatistics() {
		ComeStatisticExample example=new ComeStatisticExample();
		List<ComeStatistic> list=comeStatisticMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<NewsList> getNewslist(NewsList newsList) {
		NewsListExample example=new NewsListExample();
		List<NewsList> list=newsListMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<IndexCustom> getCustom(IndexCustom indexCustom) {
		IndexCustomExample example=new IndexCustomExample();
		List<IndexCustom> list=indexCustomMapper.selectByExample(example);
		return list;
	}

}
