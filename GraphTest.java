
public class GraphTest{
    public static void main(String[] args){
        // 3 cycle (Non bipartite)
        int[][] cycleGraph = {
            {0,1,1}, //Node 0
            {1,0,1}, //Node 1
            {1,1,0}, //Node 2

        // 2 node line graph (bipartite)
        int[][] pathGraph = {
            {0,1},
            {1,0},
        };


        Graph GCycle = new Graph(cycleGraph);
        System.out.println(GCycle.is_bipartite() == false);
        
        Graph GLine = new Graph(pathGraph);
        System.out.println(GLine.is_bipartite() == true);
    }
}