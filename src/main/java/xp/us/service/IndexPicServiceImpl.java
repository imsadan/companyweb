package xp.us.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import xp.us.mapper.IndexAdvMapper;
import xp.us.mapper.IndexCustomMapper;
import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexAdvExample;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.IndexCustomExample;

@Controller
public class IndexPicServiceImpl implements IndexPicService {
    
	@Autowired
	private IndexCustomMapper indexCustomMapper;
	
	@Autowired
	private IndexAdvMapper indexAdvMapper;
	
	@Override
	public List<IndexCustom> getCustoms(IndexCustom indexCustom) {
		IndexCustomExample example=new IndexCustomExample();
		List<IndexCustom> list=indexCustomMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<IndexAdv> getAdvs(IndexAdv indexAdv) {
		IndexAdvExample example=new IndexAdvExample();
		List<IndexAdv> list=indexAdvMapper.selectByExample(example);
		return list;
	}

}
