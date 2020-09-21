package com.account.back.Mapper;

import com.account.back.Proj.Income;
import com.account.back.Proj.IncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncomeMapper {
    long countByExample(IncomeExample example);

    int deleteByExample(IncomeExample example);

    int deleteByPrimaryKey(Integer incomeId);

    int insert(Income record);

    int insertSelective(Income record);

    List<Income> selectByExample(IncomeExample example);

    Income selectByPrimaryKey(Integer incomeId);

    int updateByExampleSelective(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByExample(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}