import java.util.*;
public class P70_reverse_ll {
    Node head;
    private int size;
    
    P70_reverse_ll(){
        size =0;
    }

    //newnode
    public class Node{
        String data;
        Node  next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add at last
    public void addlast(String data){
        Node newnode = new Node(data);

        if(head == null){
            head  = newnode;
            return;
        }
        Node lastnode = head;
        while(lastnode.next != null){
            lastnode =  lastnode.next;
        }
        lastnode.next = newnode;
    }

    //reverse iterative mode
    public void reverse(){
        if(head == null || head.next == null){
            return;
        }

        Node prevnode = head;
        Node currnode = head.next;

        while(currnode != null){
            Node nextnode = currnode.next;

            currnode.next = prevnode;
            //update
            prevnode = currnode;
            currnode  = nextnode;
        }
        head.next  = null;
        head = prevnode;
    }

    //reverse recursive mode
    // public Node reverse(Node head){
    //     if(head  == null || head.next == null){
    //         return head;
    //     }
    //     Node newhead = reverse(head.next);
    //     head.next.next =  head;
    //     head.next = null;
    //     return newhead;
    // }


    //print
    public void print(){
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data+"->");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        // //using collection framwork
        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);
        // Collections.reverse(list);
        // System.out.println(list);

        P70_reverse_ll list  = new P70_reverse_ll();
        list.addlast("1");
        list.addlast("2");
        list.addlast("3");
        list.addlast("4");
        list.print();
        list.reverse();
        //list.head = list.reverse(list.head);
        list.print();
    }
}
