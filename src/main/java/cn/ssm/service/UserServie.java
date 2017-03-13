package cn.ssm.service;

import java.util.List;

import cn.ssm.po.UsertableCustom;
import cn.ssm.po.UsertableVo;

public interface UserServie {
	/**
	 * 传入参数查询用户 传入null为查询所以用户
	 * @param usertablevo
	 * @return
	 * @throws Exception
	 */
public List<UsertableCustom> findAllUser(UsertableVo usertablevo)throws Exception;
/**
 * 传入用户包装类查询数据库中是否存在此用户返回用户id
 * @param usertablevo
 * @return
 * @throws Exception
 */
public List<UsertableCustom> finduser(UsertableVo usertablevo)throws Exception;
/**
 * 根据传入id查询用户
 * @param id
 * @return
 * @throws Exception
 */
public UsertableCustom findUserByid(Integer id)throws Exception;
/**
 * 传入用户的扩展类插入用户表用户信息返回插入结果
 * @param usertablecustom
 * @return
 * @throws Exception
 */
public int insertUser(UsertableCustom usertablecustom)throws Exception;
/**
 * 传入用户id删除用户信息
 * @param id
 * @return
 * @throws Exception
 */
public int	deletcUser(Integer id)throws Exception;
/**
 * 更新用户信息id为必传
 * @param id
 * @param usertablecustom
 * @return
 * @throws Exception
 */
public int updateUser(Integer id, UsertableCustom usertablecustom)throws Exception;
}
