import java.util.* ;

import javax.naming.spi.DirStateFactory;
public class DijkstraAlgo {
    // Shortest path from the source to all the vertices (weighted graph)
    // Dijkstra is a greedy based algorithm 
    static class Edge{
        int src ;
        int dest ;
        int wt ;

        public Edge(int src,int dest,int w) {
            this.src=src ;
            this.dest=dest ;
            this.wt=w ;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph ) {
        for(int i=0;i<graph.length;i++) {
            graph[i]=new ArrayList<>() ;
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5)); 

    }

    static class Pair implements Comparable<Pair>{
        int n ;
        int path ;

        public Pair(int n ,int path) {
            this.n=n ;
            this.path=path ;
        }
        @Override 
        public int compareTo(Pair p2) {
            return this.path-p2.path ;
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int src ) { //T.C (V+ElogV)
        int dist[] =new int[graph.length] ;  // dist[i]==>> src to  i ;

        for(int i=0;i<graph.length;i++) {
            if(i!=src) {
                dist[i]=Integer.MAX_VALUE ; // +Infinity
            }
        }
        boolean[] vis=new boolean[graph.length] ;
        PriorityQueue<Pair> pq=new PriorityQueue<>() ;
        // Adding the First Pair from src 
        pq.add(new Pair(src, 0));

        // BFS loop 
        while(!pq.isEmpty()) {
            Pair curr=pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n]=true ;

                //neighbours 
                for(int i=0;i<graph[curr.n].size();i++) {
                    Edge e=graph[curr.n].get(i);
                    int u=e.src ;
                    int v=e.dest ;
                    int wt=e.wt ;
                    if(dist[u]+wt < dist[v]) {
                        dist[v] = dist[u] +wt ; // update distance src to v 
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        // Print the Shortest Dist.
        for(int i:dist) {
            System.out.print(i+" ");
        }

    }

    // Bellman's Ford Algorithm 
    // Shortest path from  the source to destination (negative edges )

    // Doesn't work for Negative Weight Cycles 
    public static void bellmanFord(ArrayList<Edge>[] graph,int src) {
        int dest[]=new int[graph.length] ;

        for(int i=0;i<graph.length;i++) {
            if(i!=src) {
                dest[i]=Integer.MAX_VALUE ;
            }
        }
        // Algo  Total Time Complexity is O(V*E) 
        // O(V)
        for(int i=0;i<graph.length-1;i++) {
            // edges 
            // T.C O(E)
            for(int j=0;j<graph.length;j++) {
                for(int k=0;k<graph[j].size();k++) {
                    Edge e= graph[j].get(k) ;
                    // u v wt 
                    int u=e.src ;
                    int v=e.dest ;
                    int wt=e.wt ;

                    // relaxation 
                    if(dest[u] != Integer.MAX_VALUE && dest[u]+wt<dest[v]) {
                        dest[v]=dest[u]+wt ;
                    }
                }
            }
        }

        // print sortest distance 
        for(int i:dest) {
            System.out.print(i+" ") ;
        }
    }

    public static void main(String[] args) {
        int V=6 ;
        ArrayList<Edge>[] graph=new ArrayList[V] ;
        createGraph(graph);

        int src=0 ;
        dijkstra(graph, src);
        System.out.println();
        bellmanFord(graph, src);
        
    }
}
