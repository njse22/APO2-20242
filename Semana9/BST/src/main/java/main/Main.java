package main;

import structures.BST;

public class Main {

    public static void main(String[] args) {
        BST<Integer> integerTree = new BST<>();

        integerTree.add(50);
        integerTree.add(60);
        integerTree.add(55);
        //integerTree.add(30);
        //integerTree.add(35);
        //integerTree.add(43);

        System.out.println(integerTree.inOrder());

        integerTree.delete(60);

        System.out.println(integerTree.inOrder());

        System.out.println(integerTree.getMax().getValue());
        //integerTree.add(40);
        //System.out.println("Izquierda de la raíz: ");
        //System.out.println(integerTree.getRoot().getLeft().getValue());

        //integerTree.add(60);
        //integerTree.add(30);
        //integerTree.add(55);


    }
}
