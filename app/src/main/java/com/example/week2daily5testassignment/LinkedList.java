package com.example.week2daily5testassignment;

public class LinkedList {

    private char letter;
    private LinkedList left, right;

    public LinkedList() {
    }

    public LinkedList(char letter, LinkedList left, LinkedList right) {
        this.letter = letter;
        this.left = left;
        this.right = right;
    }

    public void add(char l){
        LinkedList current = this;
        while (current.right != null){
            current = current.right;
        }

        current.right = new LinkedList(l, current, null);
    }

    public void remove(char l) {
        LinkedList current = this;
        while (current.right != null) {
            if(current.letter == l){
                LinkedList leftNode = current.left;
                LinkedList rightNode = current.right;
                leftNode.right = rightNode;
                break;
            }

            current = current.right;
        }
    }

    public static void main(String[] args){

        String givenString = "ABCDEFGHIJKL";

        char[] letters = givenString.toCharArray();

        LinkedList linkedList = new LinkedList();


        for (int i = 0; i < letters.length; i++) {

            linkedList.add(letters[i]);
        }

        //Removing from LinkedList
        linkedList.remove('C');
        linkedList.remove('B');

        while (linkedList != null){
            System.out.println(linkedList.letter);
            linkedList = linkedList.right;
        }

    }
}

