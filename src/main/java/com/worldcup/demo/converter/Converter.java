package com.worldcup.demo.converter;

import java.time.LocalDate;

public class Converter {
    public static String dateToString(LocalDate date){
        Integer dayInWeek = date.getDayOfWeek().getValue();
        String dateString = "";
            switch (dayInWeek) {
                case 1:
                    dateString += "Th 2";
                    break;
                case 2:
                    dateString += "Th 3";
                    break;
                case 3:
                    dateString += "Th 4";
                    break;
                case 4:
                    dateString += "Th 5";
                    break;
                case 5:
                    dateString += "Th 6";
                    break;
                case 6:
                    dateString += "Th 7";
                    break;
                default:
                    dateString += "CN";
                    break;
            }
            dateString += ", " + date.getDayOfMonth() + "/" + date.getMonthValue();
            return dateString;
    }
    
}
