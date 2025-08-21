package com.packages.arrays;

public class Vector 
{
    // Propiedades de la clase
    private int vec[] = new int[20];
    private int n;

    public Vector()
    {
        this.n = 0;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void addVector(int datum)
    {
        this.vec[this.n] = datum;
        this.n++;
    }

    public void showVector()
    {
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.vec[i] + " | ");
        }
    }

    

}
