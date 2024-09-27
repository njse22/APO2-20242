package main;

import structures.BST;

public class Main {

    public static void main(String[] args) {
        BST<Integer> integerTree = new BST<>();

        integerTree.add(50);
        System.out.println("Raíz del árbol: ");
        System.out.println(integerTree.getRoot().getValue());

        integerTree.add(40);
        System.out.println("Izquierda de la raíz: ");
        System.out.println(integerTree.getRoot().getLeft().getValue());

        integerTree.add(60);
        integerTree.add(30);
        integerTree.add(55);

        System.out.println("Recorrido InOrder del árbol");
        System.out.println(integerTree.inOrder());

    }
}
