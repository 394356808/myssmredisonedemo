package cn.ssm.mapper;

import java.util.List;

import cn.ssm.po.UsertableCustom;
import cn.ssm.po.UsertableVo;

public interface UsrtableMapperCustom {
public List<UsertableCustom> finduser(UsertableVo usertablevo)throws Exception;
}
