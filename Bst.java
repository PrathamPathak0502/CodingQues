//convert a binary tree to BST
//We define a Node class for the binary tree structure.
//The BinaryTree class has a root reference and methods for in-order traversal and conversion to BST.
//The inOrderTraversal method performs an in-order traversal, storing the elements of the tree in a sorted list (sortedList).
//The convertToBST method:
//Calls inOrderTraversal to get the elements in sorted order.
//Calls the helper function buildBST to construct a new BST from the sorted list.

import java.util.ArrayList;
import java.util.List;

public class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
  }
}

public class BinaryTree {
  Node root;

  // In-order traversal to get elements in sorted order
  public List<Integer> inOrderTraversal(Node node, List<Integer> list) {
    if (node == null) {
      return list;
    }
    inOrderTraversal(node.left, list);
    list.add(node.data);
    inOrderTraversal(node.right, list);
    return list;
  }

  
  public Node convertToBST(Node root) {
    if (root == null) {
      return null;
    }
    List<Integer> sortedList = inOrderTraversal(root, new ArrayList<>()); // Get elements in sorted order
    return buildBST(sortedList, 0, sortedList.size() - 1); 
  }

 
  private Node buildBST(List<Integer> sortedList, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node node = new Node(sortedList.get(mid));
    node.left = buildBST(sortedList, start, mid - 1);
    node.right = buildBST(sortedList, mid + 1, end);
    return node;
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(10);
    tree.root.left = new Node(5);
    tree.root.right = new Node(15);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(8);
    tree.root.right.left = new Node(12);
    tree.root.right.right = new Node(17);

    System.out.println("Original tree (may not be BST):");
   
    BinaryTree.inOrderTraversal(tree.root, new ArrayList<>());

    Node bstRoot = tree.convertToBST(tree.root);

    System.out.println("\nConverted BST (in-order traversal):");
   
    BinaryTree.inOrderTraversal(bstRoot, new ArrayList<>());
  }

  public static void inOrderTraversal(Node node, List<Integer> list) {
    if (node == null) {
      return;
    }
    inOrderTraversal(node.left, list);
    list.add(node.data);
    inOrderTraversal(node.right, list);
  }
}
