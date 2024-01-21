import java.util.*;
public class P84_graph {
    //creating  edge
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    //creating graph
    public static void creatGraph(ArrayList<Edge> graph[]){
        //null to empty
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        //calling edges
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));


    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creatGraph(graph);
        //print 2 nigh bours
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.src +"->"+ e.dest + "=" + e.weight);
        }
    }
}
