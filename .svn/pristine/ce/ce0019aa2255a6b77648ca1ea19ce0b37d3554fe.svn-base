package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.IndexAdv;
import xp.us.pojo.IndexAdvExample;

public interface IndexAdvMapper {
    int countByExample(IndexAdvExample example);

    int deleteByExample(IndexAdvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexAdv record);

    int insertSelective(IndexAdv record);

    List<IndexAdv> selectByExample(IndexAdvExample example);

    IndexAdv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexAdv record, @Param("example") IndexAdvExample example);

    int updateByExample(@Param("record") IndexAdv record, @Param("example") IndexAdvExample example);

    int updateByPrimaryKeySelective(IndexAdv record);

    int updateByPrimaryKey(IndexAdv record);
}