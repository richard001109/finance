package com.chinasofti.dao;

import com.chinasofti.pojo.Income;

import java.util.List;

public interface IncomeDao {
    //查询所有的收入明细
    public List<Income> selectAllIncome();
}
