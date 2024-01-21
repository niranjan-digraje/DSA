public class P83_wordbreak {
    //define of trie 
    static class Node{
        Node[] children;
        boolean eow;     //eow=end of word

        public Node(){
            children = new Node[26];   //a to z
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    //....................................................................

    //insertion    O(L)
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }
            // if(i == word.length()-1){
            //     curr.children[idx].eow = true;
            // }
            curr = curr.children[idx];
        }
        curr.eow =true;
    }
    //....................................................................

    //search
    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) -'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            // if(i == key.length() - 1 && node.eow == false ){
            //     return false;
            // }
            curr = curr.children[idx];
        }
        //return curr.eow == true;
        return true;  //for searching of only prefix
    }
    //....................................................................

    //word breakdown problem
    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    //....................................................................

    public static void main(String[] args) {
        String word[] = {"i","like","sam","samsung","mobile","ice"};

        //insertion
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        //search or start with prefix
        System.out.println(search("li"));

        //word break
        //System.out.println(wordbreak("ilikesamsung"));
        
    }
}
