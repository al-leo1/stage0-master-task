package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int days;
        boolean leapYear = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    leapYear=true;
                else leapYear=false;
            }
            else leapYear=true;
        }
        else leapYear=false;
        if (year >0 && month>0 && month <=12) {
            if (month <= 6 && month % 2 == 0 || month > 6 && month % 2 != 0)
            {
                if (month == 2 && leapYear ) days = 29;
                else if (month == 2) {days =28;}
                else days =30;
            }
            else days = 31;
            System.out.println(days);
        }
        else System.out.println("invalid date");

    }

}
