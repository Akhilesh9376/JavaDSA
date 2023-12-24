/*
 A minimum spanning Tree (MST) or minimum weight spanning tree is a subset of the edges 
 of a connected ,edge-weighted undirected graph that connects all the vertices together 
 ,without any cycles and with the minimum possible total edge weight 
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {
    // Prim's Algorithm
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50)); 

    }

    static class Pair implements Comparable<Pair>{
        int vertex ;
        int cost ;
        public Pair(int vertex,int cost ) {
            this.vertex=vertex ;
            this.cost=cost ;
        }
        @Override 
        public int compareTo(Pair p2) {
            return this.cost-p2.cost ; // ascending order 
        }
    }
    public static void prims(ArrayList<Edge> graph[] ) {
        boolean[] vis=new boolean[graph.length] ;
        
        PriorityQueue<Pair> pq=new PriorityQueue<>() ;
        pq.add(new Pair(0, 0)) ;
        int finalCost=0 ;  // MST total weight 

        while(!pq.isEmpty()) {
            Pair curr= pq.remove() ; 

            if(!vis[curr.vertex]) {
                vis[curr.vertex] = true ;
                finalCost+=curr.cost ;

                // add the adjacent min node 
                for(int i=0;i<graph[curr.vertex].size();i++ ) {
                    Edge e =graph[curr.vertex].get(i) ;
                    pq.add(new Pair(e.dest, e.wt)) ;
                }
            }
        }
        System.out.println("Final Cost OR MIN. COST IS: "+finalCost);
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V] ;
        createGraph(graph);
        prims(graph);

    }
}
