package com.packages.trees;

import java.util.Scanner;

public class Tree 
{
    public Scanner input = new Scanner(System.in);
    public NodeTree root;

    public Tree() {
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
            r.rb = null;
        }
    }

    public int countNodes(NodeTree node) 
    {
        if (node != null) {
            return 1 + countNodes(node.lb) + countNodes(node.rb);
        } else {
            return 0;
        }
    }

    public int countLeaves(NodeTree node) 
    {
        int c = 0;
        if (node != null) {
            if (node.lb == null && node.rb == null) {
                System.out.println("Hoja: " + node.info);
                c = 1;
            }
            return c + countLeaves(node.lb) + countLeaves(node.rb);
        } else {
            return 0;
        }
    }

    public int countNoLeaves(NodeTree node) 
    {
        if (node != null) {
            if (node.lb == null && node.rb == null) {
                return 0;
            } else {
                return 1 + countNoLeaves(node.lb) + countNoLeaves(node.rb);
            }
        } else {
            return 0;
        }
    }

    public int maxNode(NodeTree node) 
    {
        int m, mLeft, mRight;
        m = mLeft = mRight = Integer.MIN_VALUE;
        if (node != null) {
            if (node.lb != null)
                mLeft = maxNode(node.lb);
            if (node.rb != null)
                mRight = maxNode(node.rb);
            m = mLeft > mRight ? mLeft : mRight;
            if (node.info > m)
                m = node.info;
        }
        return m;
    }

    public void treeToArray(NodeTree node, int v[], int pos[]) 
    {
        if (node != null) {
            v[pos[0]] = node.info;
            pos[0]++;
            treeToArray(node.lb, v, pos);
            treeToArray(node.rb, v, pos);
        }
    }

    public void searchBinary(NodeTree node, int datum) 
    {
        if (node != null) {
            if (datum < node.info) {
                searchBinary(node.lb, datum);
            } else if (datum > node.info) {
                searchBinary(node.rb, datum);
            } else {
                System.out.println("Nodo encontrado en el árbol");
            }
        } else {
            System.out.println("Nodo no encontrado en el árbol");
        }
    }

    public void insertBinary(NodeTree node, int datum)
    {
        NodeTree p;
        if (datum < node.info) {
            if (node.lb == null) {
                p = new NodeTree();
                p.info = datum;
                p.lb = null;
                p.rb = null;
                node.lb = p;
            } else {
                insertBinary(node.lb, datum);
            }
        } else if (datum > node.info) {
            if (node.rb == null) {
                p = new NodeTree();
                p.info = datum;
                p.lb = null;
                p.rb = null;
                node.rb = p;
            } else {
                insertBinary(node.rb, datum);
            }
        } else {
            System.out.println("El nodo ya se encuentra en el árbol");
        }
    }

    public void deleteBinary(NodeTree node, int datum)
    {
        if (node != null) {
            if (datum < node.info) {
                deleteBinary(node.lb, datum);
            } else if (datum > node.info) {
                deleteBinary(node.rb, datum);
            } else {
                NodeTree q = node;
                if (q.lb == null) {
                    node = q.rb;
                } else if (q.rb == null) {
                    node = q.lb;
                } else {
                    NodeTree aux1 = q.lb;
                    NodeTree aux2 = aux1;
                    while (aux1.rb != null) {
                        aux2 = aux1;
                        aux1 = aux1.rb;
                    }
                    q.info = aux1.info;
                    q = aux1;
                    aux2.rb = aux1.lb;
                }
                System.out.println("Nodo eliminado del ABB");
            }
        } else {
            System.out.println("Nodo no encontrado en el ABB");
        } 
    }



}
