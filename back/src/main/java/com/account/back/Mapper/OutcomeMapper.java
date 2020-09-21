package com.account.back.Mapper;

import com.account.back.Proj.Outcome;
import com.account.back.Proj.OutcomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutcomeMapper {
    long countByExample(OutcomeExample example);

    int deleteByExample(OutcomeExample example);

    int deleteByPrimaryKey(Integer outcomeId);

    int insert(Outcome record);

    int insertSelective(Outcome record);

    List<Outcome> selectByExample(OutcomeExample example);

    Outcome selectByPrimaryKey(Integer outcomeId);

    int updateByExampleSelective(@Param("record") Outcome record, @Param("example") OutcomeExample example);

    int updateByExample(@Param("record") Outcome record, @Param("example") OutcomeExample example);

    int updateByPrimaryKeySelective(Outcome record);

    int updateByPrimaryKey(Outcome record);
}