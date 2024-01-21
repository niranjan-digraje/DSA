import java.util.*;
public class P73_queue {    
    // //Quque using array
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear = -1;
    //     Queue(int n){
    //         arr = new int[n];
    //         this.size = n;
    //     }
        
    //     //cheack queue is empty or not
    //     public static boolean isEmpty(){
    //         return rear == -1;
    //     }

    //     //enqueue operation
    //     public static void add(int data){
    //         if(rear == size-1){
    //             System.out.println("queue is full");
    //             return;
    //         }
    //         rear++;
    //         arr[rear] = data;
    //     }

    //     //dequeue operation   O(n)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int front = arr[0];
    //         for(int i=0;i<rear;i++){
    //             arr[i] = arr[i+1];
    //         }
    //         rear--;
    //         return front;

    //     }

    //     //peek operation
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         return arr[0];
    //     }

    // }
    //....................................................................

    // //circular queue using array
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear = -1;
    //     static int front = -1;
    //     Queue(int n){
    //         arr = new int[n];
    //         this.size = n;
    //     }
        
    //     //cheack queue is empty or not
    //     public static boolean isEmpty(){
    //         return rear == -1 && front == -1;
    //     }

    //     //cheack queue is full or not
    //     public static boolean isFull(){
    //         return (rear+1)%size == front;
    //     }

    //     //enqueue operation
    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("queue is full");
    //             return;
    //         }
    //         //for 1st element
    //         if(front == -1){
    //             front = 0;
    //         }
    //         rear = (rear+1)%size;
    //         arr[rear] = data;
    //     }

    //     //dequeue operation   O(1)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int result = arr[front];
    //         //for single element condition
    //         if(rear == front){
    //             rear = front =  -1;
    //         }
    //         else{
    //             front =  (front+1)%size;
    //         }
    //         return result;
    //     }

    //     //peek operation
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         return arr[front];
    //     }
    // }
    //....................................................................

    // //queue using linked list
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // static class Queue{
    //     static Node head = null;
    //     static Node tail = null;
        
    //     //cheack queue is empty or not
    //     public static boolean isEmpty(){
    //         return head == null && tail == null;
    //     }

    //     //enqueue operation
    //     public static void add(int data){
    //         Node newnode = new Node(data);
    //         if(tail == null){
    //             tail = head =  newnode;
    //             return;
    //         }
    //         tail.next = newnode;
    //         tail = newnode;
    //     }

    //     //dequeue operation   O(1)
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int front = head.data;
    //         if(head == tail){
    //             tail  = null;
    //         }
    //         head = head.next;
    //         return front;
    //     }

    //     //peek operation
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    //....................................................................

    //queue using two stack
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add element in stack
        public static void add(int data){
            while(! s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(! s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove element in from queue
        public static  int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }

        //peek element from  queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        //queue using array and linked list and stacks`
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        // //queue using collection framework
        // // Queue<Integer>q = new LinkedList<Integer>();
        // //....................or.........................
        // Queue<Integer>q = new ArrayDeque<Integer>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // while(! q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //.............................................................
    
    }
}
