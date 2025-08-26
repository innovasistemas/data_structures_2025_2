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

    public int findVector(int datum)
    {
        int i = 0;
        int pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public void updateVector(int datum, int pos)
    {
        vec[pos] = datum;
    }

    public void deleteVector(int pos)
    {
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    public void insertVector(int datum, int pos)
    {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }  

}
