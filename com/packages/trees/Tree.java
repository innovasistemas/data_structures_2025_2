package com.packages.trees;

import java.util.Scanner;

public class Tree 
{
    public Scanner input = new Scanner(System.in);
    public NodeTree root;

    public Tree()
    {
        root = null;
    }

    public void preorder(NodeTree r)
    {
        if (r != null) {
            System.out.println(r.info);
            preorder(r.lb);
            preorder(r.rb);
        }
    }

    public void inorder(NodeTree r)
    {
        if (r != null) {
            inorder(r.lb);
            System.out.println(r.info);
            inorder(r.rb);
        }
    }

    public void postorder(NodeTree r)
    {
        if (r != null) {
            postorder(r.lb);
            postorder(r.rb);
            System.out.println(r.info);
        }
    }

    public void loadNode(NodeTree r)
    {
        // r es un nodo ya creado distinto null
        NodeTree other;
        String resp;

        System.out.print("Ingrese un nodo: ");
        r.info = input.nextInt();
        input.nextLine();

        System.out.print("¿Agregar nodos por la izquierda de " + r.info + "?[s/?]: ");
        resp = input.nextLine().toLowerCase();
        
        if (resp.equals("s")) {
            other = new NodeTree();
            r.lb = other;
            loadNode(r.lb);
        } else {
            r.lb = null;
        }

        System.out.print("¿Agregar nodos por la derecha de " + r.info + "?[s/?]: ");
        resp = input.nextLine().toLowerCase();

        if (resp.equals("s")) {
            other = new NodeTree();
            r.rb = other;
            loadNode(r.rb);
        } else {
            r.lb = null;
        }


    }
}
