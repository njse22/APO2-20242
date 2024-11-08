package main;

import structures.BST;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BST<Integer> integerTree = new BST<>();

        integerTree.add(50);
        integerTree.add(60);
        integerTree.add(40);
        integerTree.add(30);
        integerTree.add(45);
        //integerTree.add(43);

        System.out.println(integerTree.inOrder());

        System.out.println(integerTree.search(45).getValue());

        //integerTree.delete(50);

        //System.out.println(integerTree.inOrder());

        //System.out.println(integerTree.getMax().getValue());
        //integerTree.add(40);
        //System.out.println("Izquierda de la raíz: ");
        //System.out.println(integerTree.getRoot().getLeft().getValue());

        //integerTree.add(60);
        //integerTree.add(30);
        //integerTree.add(55);

        BST<Integer> listTree = new BST<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<10; i++){
            list.add(i);
        }

        listTree.fromListToTree(list);

        System.out.println(listTree.getRoot().getValue());

    }
}
