package com.packages.string_java;

public class DecimalToRoman 
{
    public static String decimalToRoman(int number)
    {
        if (number > 0 && number < 4000) {
            String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] thousands = {"", "M", "MM", "MMM"};
            
            return thousands[number / 1000] + 
                    hundreds[number % 1000 / 100] + 
                    tens[number % 100 / 10] + 
                    units[number % 10];
        } else {
            return "Número no válido";
        }

        

    }
}
