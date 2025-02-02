//BinaryTree traversal postorder ,preOrder
 class Node {
    int data;
    Node left;
    Node right;
  
    Node(int data) {
      this.data = data;
    }
  }
  
  public class BinaryTree {
    Node root;
  
    // Pre-order traversal
    public void preOrder(Node node) {
      if (node == null) {
        return; 
      }
      System.out.print(node.data + " "); 
      preOrder(node.left); 
      preOrder(node.right);
    }
  
    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      
    
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
  
      System.out.println("Pre-order traversal:");
      tree.preOrder(tree.root); }
  }
  
  