package Graph;
import java.util.* ;
public class Main {
    static class Edge{
        int src ;
        int dest ;
        int wt;

        public Edge(int src,int dest,int wt) {
            this.src =src ;
            this.dest=dest ;
            this.wt=wt ;
        }

    }
    /*
     * Edges in Graph 
     * 1.Unidirected Graph 
     * 2.Undirected Graph 
     * 3.Bi-Directional Graph 
     * 
     */
    /*
     * Stroring a Graph 
     * 1. Adjacency List =>> List Of List 
     * 2. Adjacency Matrix 
     * 3. Edge Matrix 
     * 4. 2D Matrix (Implicit Graph) 
     */
    public static void main(String[] args) {
        int V=5 ;
        ArrayList<Edge>[] graph= new ArrayList[V] ;// null -> empty 
        
        for(int i=0;i<V;i++) {
            graph[i]=new ArrayList<>() ;
        }

        // Adding the Zero ArrayList 
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4)); 

        graph[3].add(new Edge(3,1, 3));
        graph[3].add(new Edge(3,2,1)); 

        graph[4].add(new Edge(4,2,2));

        // Printing the Neighbours of 2 
        for(int i=0;i<graph[2].size();i++) {
            Edge e=graph[2].get(i); // sec,dest,wt ;
            System.out.print(e.dest+" ");
        }
    }
}

/*
 * Graph Traversals 
 * Breadth First Search(BFS) => Go to immediate neighbors first 
 * Depth First Search(DFS)
 */
