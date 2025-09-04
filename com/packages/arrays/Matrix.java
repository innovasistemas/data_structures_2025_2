package com.packages.arrays;

public class Matrix 
{
    private int mat[][] = new int[10][10];
    private int m, n;

    public Matrix()
    {
        m = 0;
        n = 0;
    }

    public int[][] getMat() 
    {
        return mat;
    }

    public void setMat(int[][] mat) 
    {
        this.mat = mat;
    }

    public int getM() 
    {
        return m;
    }

    public void setM(int m) 
    {
        this.m = m;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public void fillMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int)(Math.random() * 50) + 1;
            }
        }
    }

    public void showMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public void mainDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + "\n");
        }
        System.out.println();
    }

    public void secondaryDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - i -1] + "\n");
        }
        System.out.println();
    }

    public void lowerTriangularSecondary()
    {
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
}
