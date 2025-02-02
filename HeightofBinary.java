//Height of Binary Tree
class Node {
    int data;
    Node left;
    Node right;
  
    Node(int data) {
      this.data = data;
    }
  }
  
  public class HeightofBinary {
    Node root;
  
    // Function to find the height of the binary tree
    public int findHeight(Node node) {
      if (node == null) {
        return -1; // Base case: empty tree has height -1 (considering root as level 0)
      }
      int leftHeight = findHeight(node.left);
      int rightHeight = findHeight(node.right);
      return Math.max(leftHeight, rightHeight) + 1; // Return the maximum height + 1 (for the current node)
    }
  
    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      
      // Sample tree
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
  
      int height = tree.findHeight(tree.root);
      System.out.println("Height of the binary tree: " + height); // Output: 2
    }
  }
  