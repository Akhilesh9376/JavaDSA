package Graph;

import java.util.* ;

public class ConnectedComponent {
    static class Edge{
        int src ;
        int dest;
        int wt ;
        public Edge(int src,int dest,int wt) {
            this.src=src ;
            this.dest=dest ;
            this.wt=wt ;
        }
    }
    public static void bfs(ArrayList<Edge> graph[]) {
        boolean[] visit=new boolean[graph.length] ;
        for(int i=0;i<graph.length;i++) {
            if(!visit[i]) {
                bfsHelper(graph, visit);
            }
        }
    } 
    public static void bfsHelper(ArrayList<Edge> graph[],boolean[] visit) {
        Queue<Integer> q=new LinkedList<>() ;
        q.add(0) ;
        while(!q.isEmpty()) {
            int curr=q.remove() ;
            if(!visit[curr]) {
                System.out.print(curr+ " "); 
                visit[curr]=true ;

                for(int i=0;i<graph[curr].size();i++) {
                    Edge e=graph[curr].get(i) ;
                    q.add(e.dest);
                }
            }
        }
    }

     // DFS:- Depth First Search 

     public static void dfs(ArrayList<Edge>[] graph) {
        boolean visit[]=new boolean[graph.length] ;
        for(int i=0;i<graph.length;i++) {
            dfsHelper(graph, i, visit);
        }
     }
     public static void dfsHelper(ArrayList<Edge> graph[],int curr,boolean[] visit) { // O(V+E )
        // visit 
        System.out.print(curr+" ");
        visit[curr]=true ;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]) {
                dfsHelper(graph, e.dest, visit);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
