package com.chinasofti.service;

import com.chinasofti.pojo.Income;

import java.util.List;

public interface IncomeService {
    //查询所有的收入明细
    public List<Income> selectAllIncome();
}

