package xp.us.service;

import java.util.List;

import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexCustom;

public interface IndexPicService {
    //首页客户
	List<IndexCustom> getCustoms(IndexCustom indexCustom);
	//首页顶部
	List<IndexAdv> getAdvs(IndexAdv indexAdv);
}
