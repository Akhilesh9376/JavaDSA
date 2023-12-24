import java.util.* ;

/*
 * Topological Sorting 
 * Directed Acyclic Graph(DAC) is a directed Graph with no cycle.
 * Topological sorting is used only for DAGs(not for non-DAGs)
 * It is a linear order of vertices such that every directed edge u->v,
 * the vertex u comes before v in the order 
 * it is used in dependency graph 
 */
public class TopologicalSorting {
    static class Edge{
        int src ;
        int dest ;
        public Edge(int src,int dest) {
            this.src =src ;
            this.dest=dest ;
        }
    }
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[]=new boolean[graph.length] ;
        Stack<Integer> s=new Stack<>() ;

        for(int i=0;i<graph.length;i++) {
            if(!vis[i]){
                topSortUtil(graph,i,vis,s);
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,Stack<Integer> s) {
      vis[curr] =true ;
      
      for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!vis[e.dest]) {
            topSortUtil(graph,e.dest, vis, s);
        }
      }
      s.push(curr) ;
    }

    /*
     * Topological Sort using BFS (using kahn's Algorithm)
     * In-degree or Out-degree
     * 
     * Fact: A DAG has atleast one vertex with in degree 0
     * and one vertex with out with out degree 0
     */ 
    public static void calIndegree(ArrayList<Edge>[] graph,int[] indeg) {
        for(int i=0;i<graph.length;i++) {
            for(int j=0;j<graph[i].size();j++) {
                Edge e=graph[i].get(j);
                indeg[e.dest]++ ;
            }
        }
    }
    public static void topSortBfs(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length] ;
        calIndegree(graph, indeg); 
        Queue<Integer> q=new LinkedList<>() ;

        for(int i=0;i<indeg.length;i++) {
            if(indeg[i]==0) {
                q.add(i) ;
            }
        }

        // bfs 
        while(!q.isEmpty()) {
            int curr=q.remove() ;
            System.out.println(curr+" ");

            for(int i=0;i<graph[curr].size();i++) {
                Edge e=graph[curr].get(i);
                indeg[e.dest]-- ;

                if(indeg[e.dest]==0) {
                    q.add(e.dest) ;
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
    }
}
