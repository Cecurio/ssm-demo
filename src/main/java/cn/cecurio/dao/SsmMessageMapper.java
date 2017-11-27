package cn.cecurio.dao;

import cn.cecurio.entity.SsmMessage;
import cn.cecurio.entity.SsmMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsmMessageMapper {
    int countByExample(SsmMessageExample example);

    int deleteByExample(SsmMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(SsmMessage record);

    int insertSelective(SsmMessage record);

    List<SsmMessage> selectByExampleWithBLOBs(SsmMessageExample example);

    List<SsmMessage> selectByExample(SsmMessageExample example);

    SsmMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") SsmMessage record, @Param("example") SsmMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") SsmMessage record, @Param("example") SsmMessageExample example);

    int updateByExample(@Param("record") SsmMessage record, @Param("example") SsmMessageExample example);

    int updateByPrimaryKeySelective(SsmMessage record);

    int updateByPrimaryKeyWithBLOBs(SsmMessage record);

    int updateByPrimaryKey(SsmMessage record);
}