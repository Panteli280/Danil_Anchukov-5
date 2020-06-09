package com.company;


public class Main {

    public static  void main(String args[]) throws Exception {

        BinaryTree<Integer> tree = new BinaryTree<>(s -> Integer.parseInt(s));

        tree.fromBracketNotation("2(7(6(1,11)),5(9(4)))");

        tree.task();
    }
}