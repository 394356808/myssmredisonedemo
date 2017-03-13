package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ssm.mapper.ItemsMapper;
import cn.ssm.mapper.ItemsMapperCustcm;
import cn.ssm.mapper.TemptableMapper;
import cn.ssm.po.Items;
import cn.ssm.po.ItemsCustom;
import cn.ssm.po.ItemsQueryVo;
import cn.ssm.po.Temptable;
import cn.ssm.service.ItemsService;

/**
 * 商品管理
 * @author yyao
 *
 */

public class ItemsServiceImpl implements ItemsService{
  //申明注解参数
	@Autowired
   private ItemsMapperCustcm itemsMapperCustom;
	//注入ItemsMapper
	@Autowired
	private ItemsMapper itemsMapper;
	@Autowired
	private TemptableMapper temptablemapper;
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
	
		// TODO Auto-generated method stub
		//通过ItemsMapperCustom查询数据库
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}
	//传入id查询商品返回ItemsCustom
	public ItemsCustom findItemsByid(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Items items=itemsMapper.selectByPrimaryKey(id);
		//在这进行逻辑代码
		ItemsCustom itemsCustom =new ItemsCustom();
		//将items拷贝到itemsCustom中去
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}
	//修改商品 传入商品id和要修改的信息
	public int updateItems(Integer id, ItemsCustom itemscustom) throws Exception {
		// TODO Auto-generated method stub
		itemscustom.setItemsid(id);
		System.out.println(itemscustom.getItemsname());
		int temp=itemsMapper.updateByPrimaryKeyWithBLOBs(itemscustom);
		return temp;
	}
	//删除商品
	public int deletcItems(Integer id) throws Exception {
		// TODO Auto-generated method stub
		int temp=itemsMapper.deleteByPrimaryKey(id);
		return temp;
	}
	//添加商品
	public int insertItems(ItemsCustom itemscustom) throws Exception {
		System.out.println(itemscustom.getItemsname()+":"+itemscustom.getItemstext());
		// TODO Auto-generated method stub
		int temp=itemsMapper.insert(itemscustom);
		return temp;
	}
	//临时表
	public int insertTemptable(Temptable temptable) throws Exception{
		int temp=temptablemapper.insert(temptable);
		return temp;
	}

}
