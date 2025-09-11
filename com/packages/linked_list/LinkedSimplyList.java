package com.packages.linked_list;

public class LinkedSimplyList 
{
    public Node head;

    public LinkedSimplyList()
    {
        head = null;
    }


    public void createBeginLSL(int datum)
    {
        Node newNode = new Node();
        newNode.info = datum;
        newNode.link = head;
        head = newNode;
    }

    public void showLSL()
    {
        Node p = head;
        while (p != null) {
            System.out.println("Dato nodo: " + p.info);
            System.out.println("Dirección nodo: " + p);
            System.out.println("Dirección liga: " + p.link);
            System.out.println("-------------------------");
            p = p.link;
        }
    }
    
}