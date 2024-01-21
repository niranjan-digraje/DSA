import java.util.*;
public class P72_stack {
    // //stack using linked list
    // private static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         next = null;
    //     }
    // }

    // static class stack{
    //     public static Node head = null;
        

    //     //push operation
    //     public static void push(int data){
    //         Node newnode = new Node(data);
    //         if(head == null){
    //             head = newnode;
    //             return;
    //         }
    //         newnode.next = head;
    //         head = newnode;
    //     }

    //     //cheack stack empty or not
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }

    //     //pop operation
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         Node top = head;
    //         head = head.next;
    //         return top.data;
    //     }

    //     //peek operation
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         Node top  = head;
    //         return top.data;
    //     }
    // }
    //....................................................................
    
    // //stack using arraylist
    // static class stack{
    //     static ArrayList<Integer>list = new ArrayList<Integer>();
    //     //cheack stack is empty or not
    //     public static boolean isEmpty(){
    //         return list.size() == 0;
    //     }

    //     //push operation
    //     public static void push(int data){
    //         list.add(data);
    //     }

    //     //pop operation
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     //peek operation
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    //....................................................................



    public static void main(String[] args) {
        // stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // while(! s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        //................................................................
        // //stack using collection frame work
        // Stack<Integer> s = new Stack<Integer>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        //................................................................
        
        //practice  Qs
        //push item at bottom  of stack
        // Stack<Integer> s = new Stack<Integer>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // if(s.isEmpty()){
        //     s.push(5);
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        //................................................................

        //reverse the stack
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // int size =  s.size();
        // System.out.println(size);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
