package com.account.back.Mapper;

import com.account.back.Proj.Budget;
import com.account.back.Proj.BudgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BudgetMapper {
    long countByExample(BudgetExample example);

    int deleteByExample(BudgetExample example);

    int deleteByPrimaryKey(Integer budgetId);

    int insert(Budget record);

    int insertSelective(Budget record);

    List<Budget> selectByExample(BudgetExample example);

    Budget selectByPrimaryKey(Integer budgetId);

    int updateByExampleSelective(@Param("record") Budget record, @Param("example") BudgetExample example);

    int updateByExample(@Param("record") Budget record, @Param("example") BudgetExample example);

    int updateByPrimaryKeySelective(Budget record);

    int updateByPrimaryKey(Budget record);
}