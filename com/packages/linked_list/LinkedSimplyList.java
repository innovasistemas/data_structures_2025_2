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

    public void insertBeforeNode(int datum, int datumRef)
    {
        if (head.info == datumRef ) {
            Node p = new Node();
            p.info = datum;
            p.link = head;
            head = p;
        } else {

        }
    }
    
}