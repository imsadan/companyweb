package xp.us.service;

import java.util.List;

import xp.us.commons.commonReturn;
import xp.us.pojo.ComeStatistic;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.NewsList;


public interface adminstatisticService {
    //统计管理首页数量信息显示
	public List<Integer> getOtherSum();
	//保存访问量
	public commonReturn getComeStatistic(ComeStatistic comeStatistic);
	//显示
	public List<ComeStatistic> showAllStatistics();
	//首页文章简单显示
	public List<NewsList> getNewslist(NewsList newsList);
	//首页客户简单显示
	public List<IndexCustom> getCustom(IndexCustom indexCustom);
}
