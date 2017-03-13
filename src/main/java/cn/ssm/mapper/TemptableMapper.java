package cn.ssm.mapper;

import cn.ssm.po.Temptable;
import cn.ssm.po.TemptableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemptableMapper {
    int countByExample(TemptableExample example);

    int deleteByExample(TemptableExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Temptable record);

    int insertSelective(Temptable record);

    List<Temptable> selectByExample(TemptableExample example);

    int updateByExampleSelective(@Param("record") Temptable record, @Param("example") TemptableExample example);

    int updateByExample(@Param("record") Temptable record, @Param("example") TemptableExample example);
}