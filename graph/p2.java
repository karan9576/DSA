import java.util.*;
 class p2{
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
        public static void createGraph(ArrayList<Edge> graph[]){
            for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

         graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

        }
        public static void bfs(ArrayList<Edge> graph[]){
            boolean visited[]=new boolean[graph.length];
            Queue<Integer> q =new LinkedList<>();
            q.add(0);
            while(!q.isEmpty()){
               int ver= q.remove();
                if(visited[ver]==false){ 
                     visited[ver]=true;
                     System.out.println(ver);
                     for(int j=0;j<graph[ver].size();j++){
                     Edge e=graph[ver].get(j);
                     q.add(e.dst);
                     }
                }
                
            }
        }
        public static void dfs(ArrayList<Edge> graph[],int curr, boolean []vis){
            System.out.println(curr);
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge v=graph[curr].get(i);
                if(!vis[v.dst]){
                    dfs(graph,v.dst,vis);
                }
            }
        }

    public static void main(String []args){
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        System.out.println("bfs");
        bfs(graph);
        System.out.println("dfs");
        dfs(graph,0,new boolean[v]);

    }
 }