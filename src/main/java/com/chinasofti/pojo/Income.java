package com.chinasofti.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 收入实体类
 */
public class Income {
    private int incomeId;//编号
    private String incomeSource;//收入来源
    private double incomeAmount;//金额
    private String incomeMode;//收款方式
    private String incomeRemarks;//描述
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date incomeDate;//日期

    public int getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public double getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(double incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public String getIncomeMode() {
        return incomeMode;
    }

    public void setIncomeMode(String incomeMode) {
        this.incomeMode = incomeMode;
    }

    public String getIncomeRemarks() {
        return incomeRemarks;
    }

    public void setIncomeRemarks(String incomeRemarks) {
        this.incomeRemarks = incomeRemarks;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    @Override
    public String toString() {
        return "Income{" +
                "incomeId=" + incomeId +
                ", incomeSource='" + incomeSource + '\'' +
                ", incomeAmount=" + incomeAmount +
                ", incomeMode='" + incomeMode + '\'' +
                ", incomeRemarks='" + incomeRemarks + '\'' +
                ", incomeDate=" + incomeDate +
                '}';
    }
}
