package com.packages.string_java;

public class Romans 
{ 
    public static String toRoman(int number)
    {
        if (number > 0 && number < 4000) {
            String[] thousands = {"", "M", "MM", "MMM"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            return thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10];
        } else {
            return "Número fuera de rango";
        }
    }
}
