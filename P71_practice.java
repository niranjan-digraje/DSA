public class P71_practice {
    Node head;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(String data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return; 
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
    }

    public Node swap(){
        if(head == null || head.next == null){
            return head;
        }

        while(head == null){
            Node temp;
            temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            return temp;
        }

        // Node temp;
        // temp = head.next;
        // head.next = swap(head.next.next);
        // temp.next = head;
        // return temp;

    }

    public void print(){
        if(head == null){
            System.out.println("empty list ");
            return;
        }

        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data +"->");
            currnode = currnode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        P71_practice list = new P71_practice();
        list.add("1");
        list.add("2");
        // list.add("3");
        // list.add("4");
        list.print();
        list.swap();
        list.print();
    }
}
