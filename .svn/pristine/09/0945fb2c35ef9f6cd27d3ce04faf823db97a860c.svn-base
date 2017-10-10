package xp.us.service;

import java.util.List;

import xp.us.commons.Page;
import xp.us.pojo.NewsList;

public interface newService {
	// 获取基本信息
	public List<NewsList> getBaseInfo(NewsList newsList);

	// 按id查找详细信息
	public NewsList getMainInfoById(int id);

	// 查询总数
	public int selectCount();

	// 分页
	public Page<NewsList> findByPage(int currentPage);
}
