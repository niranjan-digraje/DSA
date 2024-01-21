import java.util.*;
public class P74_binary_tree {

    //represent the single node of tree
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //....................................................................
    //binary tree
    static class BinaryTree{
        static int idx =  -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right  = buildTree(nodes);
            return  newnode;
        }
    }
    //....................................................................
    //preorder traversal
    public  static void preorder(Node root){
        if(root  == null){
            return;
        }
        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
    }
    //....................................................................
    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    //....................................................................
    //postorder traversal
    public static void postorder(Node root){
        if(root  == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"->");

    }
    //....................................................................
    //Levelorder traversal
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+"->");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }
    }
    //....................................................................
    //count of nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes =  count(root.left);
        int rightnodes = count(root.right);

        return leftnodes + rightnodes +1;
    }
    //....................................................................
    //sum of nodes
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }
    //....................................................................
    //height of tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int total = Math.max(leftheight,rightheight) +1;
        return total;
    }
    //....................................................................
    //diameter of tree   O(n**2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int dia1 =  diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) +1;
        return Math.max(dia3 , Math.max(dia1,dia2));
    }
    //....................................................................
    //diameter of tree  O(n)
    static class treeinfo{
        int ht;
        int diam;
        treeinfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static treeinfo diameter2(Node root){
        if(root == null){
            return new treeinfo(0,0);
        }
        treeinfo left = diameter2(root.left);
        treeinfo right = diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3 , Math.max(diam1,diam2));;
        
        treeinfo myinfo = new treeinfo(myheight,mydiam);
        return myinfo;

    }
    //....................................................................
    //subtree of another tree
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder sequence
        BinaryTree tree  = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root of tree is : "+root.data);
        //preorder
        System.out.print("Preorder traversal is : ");
        preorder(root);

        //inorder
        System.out.print("\ninorder traversal is : ");
        inorder(root);

        //postorder
        System.out.print("\npostorder traversal is : ");
        postorder(root);

        //levelorder
        System.out.println("\nlevelorder traversal is :  ");
        levelorder(root);

        //count of nodes
        int n = count(root);
        System.out.println("count of node is : "+n);

        //sum of  nodes
        int s = sum(root);
        System.out.println("total sum of nodes  is : "+s);

        //height of tree
        int h = height(root);
        System.out.println("height of tree is : "+h);

        //diameter of tree   O(n**2)
        int d = diameter(root);
        System.out.println("diameter of tree is : "+d);

        //diameter of tree   O(n)
        System.out.println("diameter of tree is : "+diameter2(root).diam);
        
    }
}
