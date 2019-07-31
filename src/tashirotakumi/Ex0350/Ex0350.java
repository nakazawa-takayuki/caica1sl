package tashirotakumi.Ex0350;

class Node {
  private char label;
  private int totalCost;
  private Node from;

  public Node(char label, Node from) {
    this.label = label;
    this.from = from;
  }
  public Node(char label) { this(label, null); }

  public char getLabel() { return label; }
  public Node getFrom() { return from; }
  public int getTotalCost() { return totalCost; }
  public void setFrom(Node from) { this.from = from; }
  public void setTotalCost(int totalCost) { this.totalCost = totalCost; }
}

class Route {
  private Node srcNode, dstNode;
  private int cost;

  public Route(Node srcNode, Node dstNode, int cost) {
    this.srcNode = srcNode;
    this.dstNode = dstNode;
    this.cost = cost;
  }

  public Node getSrcNode() { return srcNode; }
  public Node getDstNode() { return dstNode; }
  public int getCost() { return cost; }
}

public class Ex0350 {
  public static void main(String argv[]) {
    Node dummy = new Node('X');
    Node s = new Node('0', dummy);
    Node a = new Node('1');
    Node b = new Node('2');
    Node c = new Node('3');
    Node d = new Node('4');
    Node e = new Node('5');
    Node g = new Node('6');

    Route[] routes = {
      new Route(s, a, 4),
      new Route(s, b, 5),
      new Route(s, d, 2),
      new Route(a, b, 6),
      new Route(a, c, 4),
      new Route(a, d, 3),
      new Route(b, c, 6),
      new Route(b, g, 10),
      new Route(c, d, 6),
      new Route(c, e, 2),
      new Route(c, g, 6),
      new Route(d, e, 9),
      new Route(e, g, 3),
    };

    while (true) {
      boolean cont = false;
      for (Route route : routes) {
        Node src = route.getSrcNode();
        Node dst = route.getDstNode();
        if (src.getFrom() == null) continue;

        if (dst.getFrom() == null ||
            src.getTotalCost() + route.getCost() < dst.getTotalCost()) {
          dst.setFrom(src);
          dst.setTotalCost(src.getTotalCost() + route.getCost());
          cont = true;
        }
      }
      if (!cont) break;
    }

    System.out.println("distance: " + g.getTotalCost());
    Node node = g;
    while (node != dummy) {
      System.out.println(node.getLabel());
      node = node.getFrom();
    }
  }
}