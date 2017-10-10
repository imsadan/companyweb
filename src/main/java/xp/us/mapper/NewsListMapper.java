package xp.us.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import xp.us.pojo.NewsList;
import xp.us.pojo.NewsListExample;

public interface NewsListMapper {
    int countByExample(NewsListExample example);

    int deleteByExample(NewsListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsList record);

    int insertSelective(NewsList record);

    List<NewsList> selectByExample(NewsListExample example);

    NewsList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsList record, @Param("example") NewsListExample example);

    int updateByExample(@Param("record") NewsList record, @Param("example") NewsListExample example);

    int updateByPrimaryKeySelective(NewsList record);

    int updateByPrimaryKey(NewsList record);
    
    /**
     * 查询用户记录总数
     */
    int selectCount();
    /**
     * 分页
     */
    List<NewsList> findByPage(HashMap<String,Object> map);
}