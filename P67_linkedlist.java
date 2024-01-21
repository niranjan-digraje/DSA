import java.util.*;

public class P67_linkedlist {
    Node head;
    private int size;

    P67_linkedlist() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add-last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastnode = head;

        while (lastnode.next != null) {
            lastnode = lastnode.next;
        }
        lastnode.next = newNode;
    }

    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;

        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize() {
        return size;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        P67_linkedlist list = new P67_linkedlist();
        // add element
        list.addfirst("a");
        list.addfirst("is");
        list.print();
        list.addlast("list");
        list.print();
        list.addfirst("this");
        list.print();

        // delete element
        list.deletefirst();
        list.print();
        list.deletelast();
        list.print();

        // size
        int size = list.getsize();
        System.out.println(size);
    }

}
