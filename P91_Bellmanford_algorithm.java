import java.util.*;
public class P91_Bellmanford_algorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void creatgraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));

    }

    public static void bellmanford(ArrayList<Edge> graph[],int src ,int v){
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int k =0;k<v-1;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int V = e.dest;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]  + e.wt < dist[V]){
                        dist[V] = dist[u] + e.wt;
                    }
                }
            }
        }

        //detect -ve weigth cycle
        for(int k =0;k<v-1;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int V = e.dest;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]  + e.wt < dist[V]){
                        System.out.println("negative wt cycle");
                    }
                }
            }
        }

        
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creatgraph(graph);
        bellmanford(graph,0,v);
    }
}
