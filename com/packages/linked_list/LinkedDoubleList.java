package com.packages.linked_list;

public class LinkedDoubleList 
{
    public NodeLDL head;

    public LinkedDoubleList()
    {
        head = null;
    }

    public void createBeginLDL(int datum)
    {
        NodeLDL newNode = new NodeLDL();
        newNode.info = datum;
        newNode.rl = head;
        newNode.ll = null;
        if (head != null) {
            head.ll = newNode;
        }
        head = newNode;
    }

    // public void createEndLSL(int datum)
    // {
    //     Node mem = new Node();
    //     mem.info = datum;
    //     mem.link = null;
    //     if (head == null) {
    //         head = mem;
    //     } else {
    //         last.link = mem;
    //     }
    //     last = mem;
    // }

    public void showLDL()
    {
        NodeLDL p = head;
        while (p != null) {
            System.out.println("Dato nodo: " + p.info);
            p = p.rl;
        }
    }


    public NodeLDL searchNodeLDL(int datum)
    {
        boolean sw = false; //Supuesto: no está el dato a buscar
        NodeLDL p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.rl;
            }
        }
        return p;
    }

    public void updateNodeLDL(NodeLDL q, int datum)
    {
        q.info = datum;
    }

    public void deleteNodeLDL(NodeLDL p)
    {
        if (head == p) {
            head = head.rl;
            head.ll = null;
        } else {
            (p.ll).rl = p.rl;
            if (p.rl != null) {
                (p.rl).ll = p.ll;
            } 
        }
    }

    public void insertAfterNodeLDL(NodeLDL p, int datum)
    {
        NodeLDL m = new NodeLDL();
        m.info = datum;
        m.rl = p.rl;
        m.ll = p;
        p.rl = m;
        if (m.rl != null) {
            m.rl.ll = m;
        }
    }
    
}