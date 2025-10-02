package com.packages.stack_queue;

public class Stacks 
{
    public final int MAX = 50;
    public int TOP;
    public int stack[] = new int[MAX];
    
    public Stacks()
    {
        TOP = 0;
    }

    public void stacking(int datum)
    {
        stack[TOP] = datum;
        TOP++;
    }

    public int unstacking()
    {
        TOP--;
        return stack[TOP];
    }

    public void showStack()
    {
        for (int i = this.TOP - 1; i >= 0; i--) {
            System.out.println("-----");
            System.out.println(this.stack[i]);
        }
    }
}
