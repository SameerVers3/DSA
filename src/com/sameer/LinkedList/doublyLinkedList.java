package com.sameer.LinkedList;

public class doublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll =  new DoublyLinkedList();
        System.out.println("Adding at last");
        dll.addAtLast(50);
        dll.addAtLast(60);
        dll.addAtLast(80);
        dll.print();
        dll.addAtFirst(90);
        dll.print();

        System.out.println("Adding at index: ");
        dll.addAtIndex(30, 0);
        dll.print();
        dll.addAtIndex(567, 5);
        dll.print();

    }
}

class DoublyLinkedList{
    Node head;
    Node tail;

    // adding at first index
    public void addAtFirst(int data) {
        if (head == null){
            head =  new Node(data);
            head.next = tail;
            tail = head;
        }
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtLast(int data){
        if (tail == null){
            addAtFirst(data);
        }
        else {
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void addAtIndex(int data, int index){
        Node newNode = new Node(data);
        Node currentNode = head;
        int i = 1;
        while (currentNode != null){
            if(index == 0){
                addAtFirst(data);
                break;
            }
            if (i == index){
                newNode.next = currentNode.next;
                currentNode.next.prev = newNode;
                newNode.prev = currentNode;
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
            i++;
        }
        if (i != index && index != 0){
            System.out.println("Index not found: ");
        }
    }
    public void printBackwards(){
        Node currentNode = tail;

        while (currentNode != null){
            System.out.print(currentNode.data + " <=> ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    public void print() {
        Node currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.data + " <=> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    class Node{
        int data;
        Node next;
        Node prev;
        public Node() {

        }
        public Node(int data) {
            this.data = data;
        }
    }
}

