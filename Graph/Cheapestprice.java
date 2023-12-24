import java.util.* ;

public class Cheapestprice {
    static class Edge {
        int src,dest,wt ;
        public Edge(int src,int dest,int wt ) {
            this.src=src ;
            this.dest=dest ;
            this.wt=wt ;
        }
        
    }
    public static void createGraph(int[][] flights,ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++ ) {
            graph[i]=new ArrayList<>() ;
        }
        for(int i=0;i<flights.length;i++) {
            int src=flights[i][0] ;
            int dest=flights[i][1] ;
            int wt=flights[i][2] ;

            Edge e =new Edge(src, dest, wt) ;
            graph[src].add(e);
            
        }
    }
    static class Info{
        int vertex ;
        int cost ;
        int stop ;
        public Info(int vertex,int cost ,int stop ) {
            this.vertex=vertex ;
            this.cost=cost ;
            this.stop=stop ;
        }
    }
    public static int cheapestFlight(int n,int flight[][],int src,int dest,int k) {
        
        ArrayList<Edge> graph[]=new ArrayList[n] ;

        createGraph(flight, graph); 

        int distance[]=new int[n] ;

        for(int i=0;i<n;i++) {
            if(i!=src) {
                distance[i]=Integer.MAX_VALUE ;
            }
        }

        Queue<Info> q=new LinkedList<>() ;
        q.add(new Info(src, 0,0)) ;

        while(!q.isEmpty()) {
            Info curr=q.remove() ;
            if(curr.stop>k) {
                break ;
            }

            for(int i=0;i<graph[curr.vertex].size();i++) {
                Edge e=graph[curr.vertex].get(i) ;
                int u=e.src ;
                int v=e.dest ;
                int wt=e.wt ;
                
                if(curr.cost+wt<distance[v] && curr.stop<=k) {
                    distance[v]=curr.cost+wt ;
                    q.add(new Info(v, distance[v],curr.stop+1)) ;  // yaha se dobara karna hai hmko 
                }
            }
        }
        // dest[distance] 
        if(distance[dest]==Integer.MAX_VALUE) {
            return -1 ;
        }else{
            return distance[dest] ;
        }
    }
    public static void main(String[] args) {
        int n=4 ;
        int[][] flight={
            {0,1,100},
            {1,2,100},
            {2,0,100},
            {1,3,600} ,
            {2,3,200}
        };
        int src=0 ;
        int dest= 3 ;
        int k=1 ;

        int ans = cheapestFlight(n, flight, src, dest, k) ;
        System.out.println(ans) ;   // leetcode 787 



    }
}
