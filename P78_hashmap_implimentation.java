import java.util.*;
public class P78_hashmap_implimentation {
    static class HashMap<K,V>{ //generics  i.e.general type of K and v
        private  class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; //nodes of linked list
        private int N; //nuber of buckets
        private LinkedList<Node> buckets[];  //N=bucket.length
        //@SuppressWarnings("unchecked");
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node>ll = buckets[bi];
            int di =0;
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;   //data index
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>oldBuckets[] =  buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key , node.value);
                }
            }
        }

        //put function
        public  void put(K key,V value){
            int bi = hashFunction(key);  //bucket index
            int di = searchInLL(key,bi); //data index
            if(di == -1){ //key doesnt exist
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{  //key exist
                Node  node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            int k = 2;

            if(lambda > k){
                //rehashing
                rehash();

            }
        }

        //get function
        public V get(K key){
            int bi = hashFunction(key);  //bucket index
            int di = searchInLL(key,bi); //data index
            if(di == -1){ //key doesnt exist
                return null;
            }
            else{  //key exist
                Node  node = buckets[bi].get(di);
                return node.value;
            }
        }

        //contains key i.e. search
        public boolean containskey(K key){
            int bi = hashFunction(key);  //bucket index
            int di = searchInLL(key,bi); //data index
            if(di == -1){ //key doesnt exist
                return false;
            }
            else{  //key exist
                return  true;
            }
        }

        //remove function
        public  V remove(K key){
            int bi = hashFunction(key);  //bucket index
            int di = searchInLL(key,bi); //data index
            if(di == -1){ //key doesnt exist
                return null;
            }
            else{  //key exist
                Node  node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        //cheack empty or not
        public boolean isEmpty(){
            return n==0;
        }

        //array list
        public ArrayList<K> keyset(){
            ArrayList<K>keys = new ArrayList<>();
            
            for(int i=0;i<buckets.length;i++){   //bucket index
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();j++){   //data index
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    
    

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keyset();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}
