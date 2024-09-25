public class main{
    public static void main(String[] args){
        int[][] cycleGraph = {
            {0,1,1},
            {1,0,1},
            {1,1,0},
        };
        int[][] pathGraph = {
            {0,1},
            {1,0},
        };
        Graph G = new Graph(cycleGraph);
        System.out.println(G.is_bipartite());
    }
}