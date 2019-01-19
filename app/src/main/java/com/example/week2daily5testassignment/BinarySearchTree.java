package com.example.week2daily5testassignment;

public class BinarySearchTree {

    public static void main(String[] args) {

        int[] inputArray = new int[]{50,32,13,65,34,22,3,76,90};
        int length = inputArray.length;

        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.constructTree(inputArray, length);
        binaryTree.printBinaryTree(root);
    }

}

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class Index {

    int index = 0;
}

class BinaryTree {

    Index index = new Index();


    Node constructTreeUtil(int[] inputArray, Index preIndex, int low, int high, int length) {

        if (preIndex.index >= length || low > high) {
            return null;
        }

        Node root = new Node(inputArray[preIndex.index]);
        preIndex.index = preIndex.index + 1;

        if (low == high) {
            return root;
        }

        int i;
        for (i = low; i <= high; i++) {
            if (inputArray[i] > root.data) {
                break;
            }
        }

        root.left = constructTreeUtil(inputArray, preIndex, preIndex.index, i - 1, length);
        root.right = constructTreeUtil(inputArray, preIndex, i, high, length);

        return root;
    }


    Node constructTree(int[] inputArray, int length) {
        return constructTreeUtil(inputArray, index, 0, length - 1, length);
    }


    void printBinaryTree(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printBinaryTree(node.left);
        printBinaryTree(node.right);
    }

}
