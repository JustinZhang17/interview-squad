import java.util.PriorityQueue;

class Graph {
    private PriorityQueue<Node> adj_list;
    
    /**
     * 
     * @param adj_matrix
     */
    public Graph(int[][] adj_matrix) {
        NodeComparator comparator = new NodeComparator();
        this.adj_list = new PriorityQueue<>(adj_matrix.length, comparator.reversed());
        this.parse_matrix(adj_matrix);
    }

    public void add_node(rowNum, row) {
        private List<Integer> adjacent_nodes;
        if ()
        Node n = new node(rowNum, row);
    }

    /**
     * @return whether graph is bipartite
     */
    public boolean is_bipartite() {
        return false;
    }

    public void parse_matrix(int[][] adj_matrix) {
        int adjLen = adj_matrix.length;
        for (int i=0; i< adjLen; i++){
             add_node(i, adj_matrix[i]);
        }
        
    }
}

// Input Format
// [
// [1,0,1,0],
// [0,1,1,1],
// [0,0,0,0],
// [1,1,1,1]
// ]