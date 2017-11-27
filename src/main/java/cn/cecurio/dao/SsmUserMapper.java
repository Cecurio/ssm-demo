package cn.cecurio.dao;

import cn.cecurio.entity.SsmUser;
import cn.cecurio.entity.SsmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsmUserMapper {
    int countByExample(SsmUserExample example);

    int deleteByExample(SsmUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SsmUser record);

    int insertSelective(SsmUser record);

    List<SsmUser> selectByExample(SsmUserExample example);

    SsmUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SsmUser record, @Param("example") SsmUserExample example);

    int updateByExample(@Param("record") SsmUser record, @Param("example") SsmUserExample example);

    int updateByPrimaryKeySelective(SsmUser record);

    int updateByPrimaryKey(SsmUser record);
}