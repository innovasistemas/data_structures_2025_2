package com.packages.stack_queue;

public class Queues 
{
    public final int MAX = 50;
    public int LAST;
    public int queue[] = new int[MAX];
    
    public Queues()
    {
        LAST = 0;
    }

    public void push(int datum)
    {
        queue[LAST] = datum;
        LAST++;
    }

    public int pop()
    {
        int elem = queue[0];
        for (int i = 0; i < LAST - 1; i++) {
            queue[i] = queue[i + 1];
        }
        LAST--;
        return elem;
    }

    public void showQueue()
    {
        System.out.println();
        for (int i = 0; i < LAST; i++) {
            System.out.print(this.queue[i] + " | ");
        }
    }


}
