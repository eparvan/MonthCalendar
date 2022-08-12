package com.example.monthcalendar;

public class MonthList {
    private String monthName;
    private int monthResource;

    public MonthList(String monthName, int mr){
        this.monthName =monthName;
        this.monthResource =mr;
    }

    public String getMonthName(){
        return this.monthName;
    }

    public void setMonthName(String monthName){
        this.monthName = monthName;
    }

    public int getMonthResource(){
        return this.monthResource;
    }

    public void setMonthResource(int monthResource){
        this.monthResource = monthResource;
    }
}
