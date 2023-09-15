package com.sameer.LinkedList;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        NodeList ll = new NodeList();

        ll.add(10);
        ll.add(12);
        ll.add(59);
        ll.print();
        ll.deleteFirst();
        ll.print();
        System.out.println(ll.getAtIndex(1));
    }
}
class NodeList {

    Node head;
    static int staticIndex;

    class Node{
        int data;
        Node next;
        int index = staticIndex;
        public Node() {}
        public Node(int data){
            int index = staticIndex;
            staticIndex++;
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node temp = head;
        Node n = new Node(data);
        if (head == null){
            head = n;
        }
        else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void deleteLast(){
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        staticIndex--;
    }

    public int getAtIndex(int index){
        Node current = head;
        while (current != null){
            if(current.index == index){
                return current.data;
            }
            current = current.next;
        }
        return  -1;
    }

    public Node getNodeAtIndex(int index){
        Node current = head;
        while (current != null){
            if (current.index == index){
                return current;
            }
            current =  current.next;
        }
        return new Node();
    }

    public void deleteFirst(){
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void print(){
        Node current = head;
        System.out.print("{ ");
        while(current != null){
            System.out.print(current.data + "i= "+ current.index +", ");
            current = current.next;
        }
        System.out.println(" }");
    }
}
