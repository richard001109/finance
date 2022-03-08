package com.chinasofti.service.impl;

import com.chinasofti.dao.IncomeDao;
import com.chinasofti.pojo.Income;
import com.chinasofti.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncomeServiceImpl implements IncomeService {
    //注入IncomeDao实例
    @Autowired
    private IncomeDao incomeDao;

    @Override
    public List<Income> selectAllIncome() {
        return incomeDao.selectAllIncome();
    }
}
