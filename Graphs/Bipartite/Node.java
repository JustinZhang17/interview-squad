import java.util.List;

class Node {
    private int value;
    private List<Node> adjacent_nodes;
    private List<String> colours;
    
    
    public Node(int value, List<Node> adjacent_nodes) {
        this.value = value;
        this.adjacent_nodes = adjacent_nodes;
        this.colours.add("C1");
        this.colours.add("C2");
    }
    
    public List<Node> get_adjacent_nodes() {
        return this.adjacent_nodes;
    }

    /**
     * @param adj A potential Adjacent node to this Node
     * @return boolean, if nodes are adjacent
     */
    public boolean is_adjacent(Node adj){
        return this.adjacent_nodes.contains(adj);
    } 
    
    public boolean has_colour(String colour) {
        return this.colours.contains(colour);
    }
    
    public void remove_Colour(String colour) {
        this.colours.remove(colour);
    }
}