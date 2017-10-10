package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.WorkText;
import xp.us.pojo.WorkTextExample;

public interface WorkTextMapper {
    int countByExample(WorkTextExample example);

    int deleteByExample(WorkTextExample example);

    int deleteByPrimaryKey(Integer textid);

    int insert(WorkText record);

    int insertSelective(WorkText record);

    List<WorkText> selectByExample(WorkTextExample example);

    WorkText selectByPrimaryKey(Integer textid);

    int updateByExampleSelective(@Param("record") WorkText record, @Param("example") WorkTextExample example);

    int updateByExample(@Param("record") WorkText record, @Param("example") WorkTextExample example);

    int updateByPrimaryKeySelective(WorkText record);

    int updateByPrimaryKey(WorkText record);
    
    int getSum();
}