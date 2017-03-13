package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.ssm.mapper.UsertableMapper;
import cn.ssm.mapper.UsrtableMapperCustom;
import cn.ssm.po.UsertableCustom;
import cn.ssm.po.UsertableVo;
import cn.ssm.service.UserServie;

public class UsertableServiceImpl implements UserServie{

	//申明注解参数注入usertablemapper
	@Autowired
	private UsertableMapper usertablemapper;
	@Autowired
	private UsrtableMapperCustom usertablemappercustom;

	public List<UsertableCustom> findAllUser(UsertableVo usertablevo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public UsertableCustom findUserByid(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public int insertUser(UsertableCustom usertablecustom) throws Exception {
		usertablemapper.insert(usertablecustom);
		// TODO Auto-generated method stub
		return 0;
	}


	public int deletcUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUser(Integer id, UsertableCustom usertablecustom) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<UsertableCustom> finduser(UsertableVo usertablevo) throws Exception {
		List<UsertableCustom> list=usertablemappercustom.finduser(usertablevo);
		System.out.println(usertablevo.getUsertablecustom());
		// TODO Auto-generated method stub
		return list;
	}

}
