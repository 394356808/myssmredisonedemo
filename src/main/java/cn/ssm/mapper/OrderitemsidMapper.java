package cn.ssm.mapper;

import cn.ssm.po.Orderitemsid;
import cn.ssm.po.OrderitemsidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemsidMapper {
    int countByExample(OrderitemsidExample example);

    int deleteByExample(OrderitemsidExample example);

    int deleteByPrimaryKey(Integer orderitemsid);

    int insert(Orderitemsid record);

    int insertSelective(Orderitemsid record);

    List<Orderitemsid> selectByExample(OrderitemsidExample example);

    Orderitemsid selectByPrimaryKey(Integer orderitemsid);

    int updateByExampleSelective(@Param("record") Orderitemsid record, @Param("example") OrderitemsidExample example);

    int updateByExample(@Param("record") Orderitemsid record, @Param("example") OrderitemsidExample example);

    int updateByPrimaryKeySelective(Orderitemsid record);

    int updateByPrimaryKey(Orderitemsid record);
}