package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.WorkName;
import xp.us.pojo.WorkNameExample;

public interface WorkNameMapper {
    int countByExample(WorkNameExample example);

    int deleteByExample(WorkNameExample example);

    int deleteByPrimaryKey(Integer workid);

    int insert(WorkName record);

    int insertSelective(WorkName record);

    List<WorkName> selectByExample(WorkNameExample example);

    WorkName selectByPrimaryKey(Integer workid);

    int updateByExampleSelective(@Param("record") WorkName record, @Param("example") WorkNameExample example);

    int updateByExample(@Param("record") WorkName record, @Param("example") WorkNameExample example);

    int updateByPrimaryKeySelective(WorkName record);

    int updateByPrimaryKey(WorkName record);
}