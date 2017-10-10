package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.IndexCustom;
import xp.us.pojo.IndexCustomExample;

public interface IndexCustomMapper {
    int countByExample(IndexCustomExample example);

    int deleteByExample(IndexCustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexCustom record);

    int insertSelective(IndexCustom record);

    List<IndexCustom> selectByExample(IndexCustomExample example);

    IndexCustom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexCustom record, @Param("example") IndexCustomExample example);

    int updateByExample(@Param("record") IndexCustom record, @Param("example") IndexCustomExample example);

    int updateByPrimaryKeySelective(IndexCustom record);

    int updateByPrimaryKey(IndexCustom record);
    
    int getSum();
}