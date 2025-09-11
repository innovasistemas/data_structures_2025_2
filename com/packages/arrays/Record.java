package com.packages.arrays;

public class Record 
{
    private Person per[] = new Person[50];
    private int n;
    
    public Record()
    {
        n = 0;
    }

    public Person[] getPer() 
    {
        return per;
    }

    public void setPer(Person[] per) 
    {
        this.per = per;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void addPerson(String id, String name, byte age, boolean study)
    {
        per[n] = new Person();
        per[n].id = id;
        per[n].name = name;
        per[n].age = age;
        per[n].study = study;
        n++;
    }

    public void showPersons()
    {
        System.out.println("Id \t Nombre \t Edad \t Estudia");
        for (int i = 0; i < n; i++) {
            System.out.println(
                per[i].id + "\t" + 
                per[i].name + "\t" + 
                per[i].age + "\t" + 
                per[i].study
            );
        }
    }



}
