package com.chinasofti.controller;

import com.chinasofti.pojo.Income;
import com.chinasofti.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class IncomeController {
    //注入IncomeService实例
    @Autowired
    private IncomeService incomeService;

    //跳转到收入明细列表页面
    @RequestMapping("/income")
    public String toIncome(){
        return "income";
    }
    @RequestMapping("/selectList")
    @ResponseBody
    public List<Income> selectAll(){
        List<Income> incomes =incomeService.selectAllIncome();
        return incomeService.selectAllIncome();
    }
}
