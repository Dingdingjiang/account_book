package com.account.back.Mapper;

import com.account.back.Proj.Debt;
import com.account.back.Proj.DebtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DebtMapper {
    long countByExample(DebtExample example);

    int deleteByExample(DebtExample example);

    int deleteByPrimaryKey(Integer debtId);

    int insert(Debt record);

    int insertSelective(Debt record);

    List<Debt> selectByExample(DebtExample example);

    Debt selectByPrimaryKey(Integer debtId);

    int updateByExampleSelective(@Param("record") Debt record, @Param("example") DebtExample example);

    int updateByExample(@Param("record") Debt record, @Param("example") DebtExample example);

    int updateByPrimaryKeySelective(Debt record);

    int updateByPrimaryKey(Debt record);
}