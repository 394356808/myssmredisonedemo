package cn.ssm.service;

import java.util.List;

import cn.ssm.po.ItemsCustom;
import cn.ssm.po.ItemsQueryVo;
import cn.ssm.po.Temptable;

/**
 * 商品管理service
 * @author yyao
 *
 */

public interface ItemsService {
	//商品查询可以传入参数也可以为null
public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
/**
 * 
 * @param 根据商品id查询商品
 * @return
 * @throws Exception
 */
public ItemsCustom findItemsByid(Integer id)throws Exception;
/**
 * @param 修改商品传入要修改的id和要修改的参数返回修改的结果
 * @param itemscustom
 * @return
 * @throws Exception
 */
public int updateItems(Integer id, ItemsCustom itemscustom )throws Exception;
/**
 * @param  删除商品传入要删除的商品ID返回修改的结果id为必传
 * @return
 * @throws Exception
 */
public int deletcItems(Integer id)throws Exception;
/**
 * 插入商品返回插入的结果
 * @param itemsQueryVo
 * @return
 * @throws Exception
 */
public int insertItems(ItemsCustom itemscustom)throws Exception;
/**
 * 临时表
 * @param temptable
 * @return
 * @throws Exception
 */
public int insertTemptable(Temptable temptable)throws Exception;
}

