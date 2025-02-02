//find diagonally oppposite item in a circle  (circular linked list?)
class Node {
    int data;
    Node next;
  
    public Node(int data) {
      this.data = data;
    }
  }
  
  public class DiagonalElemnt {
    Node head;
  
    
    public Node findNodeAtDistance(int distance) {
      if (head == null || distance < 0) {
        return null;
      }
      Node current = head;
      int count = 0;
      while (count < distance && current != null) {
        current = current.next;
        count++;
      }
      if (current == null) {
        return null; 
      }
      return current;
    }
  
    public static void main(String[] args) {
      CircularLinkedList list = new CircularLinkedList();
      list.insertNode(1); 
      list.insertNode(2);
      list.insertNode(3);
      list.insertNode(4);
      list.insertNode(5);
  
      int distance = 2; 
      Node oppositeNode = list.findNodeAtDistance(distance);
  
      if (oppositeNode != null) {
        System.out.println("Element at distance " + distance + ": " + oppositeNode.data);
      } else {
        System.out.println("Distance exceeds the number of nodes.");
      }
    }
  }
  