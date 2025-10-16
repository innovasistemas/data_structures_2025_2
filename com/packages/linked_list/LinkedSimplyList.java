package com.packages.linked_list;

public class LinkedSimplyList 
{
    public Node head;
    public Node last;

    public LinkedSimplyList()
    {
        head = null;
        last = null;
    }

    public void createBeginLSL(int datum)
    {
        Node newNode = new Node();
        newNode.info = datum;
        newNode.link = head;
        head = newNode;
    }

    public void createEndLSL(int datum)
    {
        Node mem = new Node();
        mem.info = datum;
        mem.link = null;
        if (head == null) {
            head = mem;
        } else {
            last.link = mem;
        }
        last = mem;
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

    public boolean searchNode(int datum)
    {
        boolean sw = false; //Supuesto: no está el dato a buscar
        Node p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.link;
            }
        }
        return sw;
    }

    public Node searchNode(long datum)
    {
        boolean sw = false; //Supuesto: no está el dato a buscar
        Node p = head;
        while (p != null && !sw) {
            if (p.info == datum) {
                sw = true;
            } else {
                p = p.link;
            }
        }
        return p;
    }

    public void updateNode(Node q, int datum)
    {
        q.info = datum;
    }

    public boolean deleteNode(int datum)
    {
        Node p, q;
        boolean sw = false;
        if (head.info == datum) {
            head = head.link;
            sw = true;
        } else {
            q = head;
            p = q.link;
            while (p != null && !sw) {
                if (p.info == datum) {
                    sw = true;
                } else {
                    q = p;
                    p = p.link;
                }
            }
            if (sw) {
                q.link = p.link;
            } 
        }
        return sw;
    }

    public boolean insertBeforeNode(int datum, int datumRef)
    {
        Node p, q, r;
        boolean sw = false;
        if (head.info == datumRef) {
            p = new Node();
            p.info = datum;
            p.link = head;
            head = p;
            sw = true;
        } else {
            p = head.link;
            q = head;
            while (p != null && !sw) {
                if (p.info == datumRef) {
                    r = new Node();
                    r.info = datum;
                    q.link = r;
                    r.link = p;
                    sw = true;
                } else {
                    q = q.link;
                    p = p.link; 
                }
            }
        }
        return sw;
    }

    public int squareRecursive(Node h)
    {
        if (h == null) {
            return 0;
        } else {
            return (int) Math.pow(h.info, 2) + squareRecursive(h.link);
        }
    }

    public void showLSLRecursive(Node h)
    {
        if (h != null) {
            System.out.println(h.info);
            showLSLRecursive(h.link);
        }
    } 
    
}