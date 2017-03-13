package cn.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.UsertableCustom;
import cn.ssm.po.UsertableVo;
import cn.ssm.service.UserServie;
/**
 * 用户的Controller
 * @author yyao
 *
 */
@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserServie userservice;
	/**
	 * 用户注册
	 * @param usertablecustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("addUserSubim")
	public String addUser(UsertableCustom usertablecustom)throws Exception
	{
		//System.out.println(usertablecustom);
	 // userservice.insertUser(usertablecustom);
		return "user/Userindex";
	}
	@RequestMapping("adduser")
	public String tiaozuser(){
		return "/user/userlogin";
	}
	/**
	 * 用户管理
	 * @return
	 */
	public ModelAndView UserList()throws Exception{
	List<UsertableCustom> usertablelist=userservice.findAllUser(null);
		
		ModelAndView model=new ModelAndView();
		model.addObject("usertablelist", usertablelist);
		model.setViewName("");
		return model;
	}
	/**
	 * 传入用户id和用户信息更新用户数据
	 * @return
	 * @throws Exception
	 */
public ModelAndView updateUser(Integer id,UsertableCustom usertablecustom)throws Exception{
	ModelAndView model=new ModelAndView();
	return model;
}
/**
 * 用户登录
 * @return
 * @throws Exception
 */
@RequestMapping("userlogin")
public ModelAndView findUser(UsertableCustom usertablecustom)throws Exception{
	UsertableVo usertablevo=new UsertableVo();
	usertablevo.setUsertablecustom(usertablecustom);
	List<UsertableCustom> list=userservice.finduser(usertablevo);
	if(list==null || list.size()==0){//!list.isEmpty()
		System.out.println("输入不正确");
	}
	for(UsertableCustom usertableCustom:list){
		System.out.println(usertableCustom.getUserid()+":"+usertableCustom.getUsername());
	}
	//System.out.println(userservice.finduser(usertablevo));
	ModelAndView model=new ModelAndView();
	model.setViewName("queryItems");
	return model;
}
}
