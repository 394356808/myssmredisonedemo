package cn.ssm.mapper;
/**
 * 商品包装类接口
 */

import java.util.List;

import cn.ssm.po.ItemsCustom;
import cn.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustcm {
public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
