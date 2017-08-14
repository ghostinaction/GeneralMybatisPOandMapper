package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Cpyinfo;

public interface CpyinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cpyinfo record);

    int insertSelective(Cpyinfo record);

    Cpyinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cpyinfo record);

    int updateByPrimaryKey(Cpyinfo record);
}