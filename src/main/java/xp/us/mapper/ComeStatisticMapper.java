package xp.us.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xp.us.pojo.ComeStatistic;
import xp.us.pojo.ComeStatisticExample;

public interface ComeStatisticMapper {
    int countByExample(ComeStatisticExample example);

    int deleteByExample(ComeStatisticExample example);

    int insert(ComeStatistic record);

    int insertSelective(ComeStatistic record);

    List<ComeStatistic> selectByExample(ComeStatisticExample example);

    int updateByExampleSelective(@Param("record") ComeStatistic record, @Param("example") ComeStatisticExample example);

    int updateByExample(@Param("record") ComeStatistic record, @Param("example") ComeStatisticExample example);
    
    int updateByData(ComeStatistic record);
}