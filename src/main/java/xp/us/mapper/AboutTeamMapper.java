package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.AboutTeam;
import xp.us.pojo.AboutTeamExample;

public interface AboutTeamMapper {
    int countByExample(AboutTeamExample example);

    int deleteByExample(AboutTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AboutTeam record);

    int insertSelective(AboutTeam record);

    List<AboutTeam> selectByExample(AboutTeamExample example);

    AboutTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AboutTeam record, @Param("example") AboutTeamExample example);

    int updateByExample(@Param("record") AboutTeam record, @Param("example") AboutTeamExample example);

    int updateByPrimaryKeySelective(AboutTeam record);

    int updateByPrimaryKey(AboutTeam record);
    
    //总数
    int getSum();
}