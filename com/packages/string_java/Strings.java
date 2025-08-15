package com.packages.string_java;

public class Strings 
{
    public void showString(String text)
    {
        System.out.println("Cadena actual: " + text);
    }
    
    public void basicOperations()
    {
        System.out.println("Try programiz.pro".length());
        String name = "Pedro Zapata";
        System.out.println("Nombre: " + name);
        System.out.println("Nombre mayúscula: " + name.toUpperCase());
        System.out.println("Nombre minúscula: " + name.toLowerCase());
        
        String name2 = "Ana Gil";
        String name3 = "pedro zapata";
        if (name.compareTo(name2) < 0) {
            System.out.println(name + " es menor que " + name2);
        } else {
            System.out.println(name2 + " es menor que " + name);
        }
        if (name.equals(name3)) {
            System.out.println(name + " es igual a " + name3);
        } else {
            System.out.println(name + " no es igual a " + name3);
        }
        if (name.equalsIgnoreCase(name3)) {
            System.out.println(name + " es igual a " + name3);
        } else {
            System.out.println(name + " no es igual a " + name3);
        }
        
        int pos = name.indexOf("tablero", 0);
        System.out.println("pos = " + pos);
        pos = name.indexOf("Zap", 0);
        System.out.println("pos = " + pos);
        System.out.println("pos".charAt(0));
        System.out.println("Ascii 'A':" + (int)'A');
        System.out.println("Carácter ASCII(65): " + (char)65); // ASCII(65)
        System.out.println("Hoy es jueves".substring(4, 6));
    }
}