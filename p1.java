import java.util.*;
 class p1{
   static class Edge{
        int src;
        int dst;
        int wt;
        Edge(int src, int dst,int wt){
            this.src=src;
            this.dst=dst;
            this.wt=wt;
        }
    }
    public static void main(String []args){
        int v=5;
        //int arr[]=new int[v];
        ArrayList<Edge> graph[]=new ArrayList[v];
        //in the above line we ahave only defined what type (ArrayList<Edge>)we are going to store in a array

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //in the above loop we are creating arraylist inside array
        
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));


        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        graph[4].add(new Edge(4,2,2));
       

        //printing the neighbour of 2
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dst);
        }

    }
 }