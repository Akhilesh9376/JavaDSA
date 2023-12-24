package Graph;
import java.util.* ;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
/*
 * Cycle Detection :
 * 1.visited[neighbours] is true but not the paents node 
 * 2.visited[neighbours] is true and also the parents node 
 * 3.visited[neighbours] is false 
 */
public class CycleDetection { 
    static class Edge{
        int src ;
        int dest;
        public Edge(int src,int dest) {
            this.src=src ;
            this.dest=dest ;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0;i<graph.length;i++) {
            graph[i]=new ArrayList<>() ; 
        }

        graph[0].add(new Edge(0, 1)); 
        graph[0].add(new Edge(0, 2));  
        graph[0].add(new Edge(0, 3)); 
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2)); 
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1)); 

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited=new boolean[graph.length] ;

        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                if (detectCycleUtil(graph,visited,i,-1)){
                    return true ; // cycle exists in one of the parts 
                }
            }
        }
        return false ;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean[] visit,int curr,int par) {
          visit[curr]=true ;
          for(int i=0;i<graph[curr].size();i++) {
            Edge e=graph[curr].get(i) ;
            // Case 3
            if(!visit[e.dest]) {
                if (detectCycleUtil(graph,visit,e.dest,curr))
                    return true ;
            }
            // case 1
            else if(visit[e.dest] && e.dest!=par) {
                return true ;
            }
            // case 2: Do Nothing -> Continue 
          }
          return false ;
    }

    // Cycle detection for directed graph 
    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis=new boolean[graph.length] ;
        boolean[] stack=new boolean[graph.length] ;

        for(int i=0;i<graph.length;i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph,i,vis,stack)) {
                    return true ;
                }
            }
        }
        return false ;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,boolean[] stack){
        vis[curr]=true ;
        stack[curr]=true ;

        for(int i=0;i<graph[curr].size();i++) {
            Edge e=graph[curr].get(i);
            if(stack[e.dest]) {
                return true ;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true ;
            }
        }
        stack[curr]=false ;
        return false ;
    }
    public static void main(String[] args) {
        
    }
    
}
