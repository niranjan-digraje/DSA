//cycle detection in directed graph

import java.util.*;
public class P87_cycle_detection {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    //cycle detection
    public static boolean iscycledirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!vis[e.dest]){
                if(iscycledirected(graph,vis,e.dest,rec)){
                    return true;
                }
            }
        }
        rec[curr] =  false;
        return false;
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creatGraph(graph);

        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                boolean iscycle = iscycledirected(graph,new boolean[v],0,new boolean[v]);
                if(iscycle){
                    System.out.println(iscycle);
                    break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      s
                }
            }
        }
        
    }
}
