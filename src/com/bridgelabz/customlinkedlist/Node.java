package com.bridgelabz.customlinkedlist;

public class Node<T extends Comparable <T>> {
    T key;
    Node<T> next;

    public Node(T key){
        this.key = key;
        this.next = null;
    }

}
