package com.gdstruc.module7;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        //tree.traverseInOrder();

        // traverse the tree (in-order but descending)
        tree.traverseInOrderDescending();

        // search a node by value
        //System.out.println(tree.get(22));

        // search node with the least value
        System.out.println(tree.getMin());

        // search node with the max value
        System.out.println(tree.getMax());
    }
}