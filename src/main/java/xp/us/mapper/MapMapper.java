package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.Map;
import xp.us.pojo.MapExample;

public interface MapMapper {
    int countByExample(MapExample example);

    int deleteByExample(MapExample example);

    int insert(Map record);

    int insertSelective(Map record);

    List<Map> selectByExample(MapExample example);

    int updateByExampleSelective(@Param("record") Map record, @Param("example") MapExample example);

    int updateByExample(@Param("record") Map record, @Param("example") MapExample example);
}