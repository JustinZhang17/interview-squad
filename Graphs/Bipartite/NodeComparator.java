import java.util.Comparator;

class NodeComparator implements Comparator<Node> {
    @Override
    public int compare(Node n1, Node n2) {
        return Integer.compare(n1.get_adjacent_nodes().size(), n2.get_adjacent_nodes().size());
    }

    @Override
    public Comparator<Node> reversed() {
        return new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n1.get_adjacent_nodes().size(), n2.get_adjacent_nodes().size()) * -1;
            }
        };
    }
}