package xp.us.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xp.us.mapper.AboutTeamMapper;
import xp.us.pojo.AboutTeam;
import xp.us.pojo.AboutTeamExample;

@Service
public class teamServiceImpl implements teamService {
    
	@Autowired
	private AboutTeamMapper aboutTeamMapper;
	
	@Override
	public List<AboutTeam> getAllteams(AboutTeam aboutTeam) {
		AboutTeamExample example=new AboutTeamExample();
		List<AboutTeam> list=aboutTeamMapper.selectByExample(example);
		return list;
	}

}
