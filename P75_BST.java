import java.util.ArrayList;

public class P75_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //insert of node in BST
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        //left subtree
        if(root.data > val){
            root.left = insert(root.left , val);
        }
        //right subtree
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }
    //....................................................................

    //inorder traversal
    public static void inorder(Node root){
        if(root  == null){
            return  ;
        }
        inorder(root.left);
        System.out.print(root.data +"->");
        inorder(root.right);
    }
    //....................................................................
    //search node in BST    O(height)  i.e O(log(n))
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left ,key);
        }
        else if(root.data == key){
            return true;
        }else{
            return search(root.right , key);
        }
    }
    //....................................................................
    //delete node in BST
    public static Node delete(Node root ,int val){
        if(root.data > val){
            return delete(root.left , val);
        }
        else if(root.data < val){
            return delete(root.right,val);
        }
        else{  //root.data == val
            //case1: no child node i.e.leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            
            //case2 : one child node
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3: two child node
            Node IS = inordersuccessor(root.right);
            root.data  =  IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }
    //inorder successor
    public static Node inordersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    //....................................................................
    //practice question
    //print number between range 6 to 10
    public static void range(Node root){
        if(root == null){
            return ;
        }
        range(root.left);
        if(root.data >=6 && root.data <= 10){
            System.out.print(root.data +" ");
        }
        range(root.right);
    }
    //....................................................................
    //print the path from root to leaf
    public static void pathRtoL(Node root , ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        //leaf node
        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{  //non leaf node
            pathRtoL(root.left, path);
            pathRtoL(root.right, path);
        }   
        path.remove(path.size()-1);
    }
    //print path
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size()-1;i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    //....................................................................

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        //inserting values of values
        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }

        //inorder traversal
        System.out.print("inorder traversal is : ");
        inorder(root);
        System.out.println();

        //search node
        int key =5;
        if(search(root,key)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

        //delete node from BST
        // int n = 5;
        // delete(root, n);
        // System.out.print("inorder traversal after delete node : ");
        // inorder(root);
        // System.out.println();

        //................................................................
        //practice qs
        //print range between 6 to 10
        System.out.print("range is : ");
        range(root);
        System.out.println();
        //................................................................

        //print paths from root to leaf
        System.out.println("Path from root to leaf : ");
        pathRtoL(root, new ArrayList<>());
    }
}
