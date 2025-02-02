 class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }
}

public class CircularLinkedList {
  Node head;

  // Function to insert a node at the end of the list
  public void insertNode(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      newNode.next = head; // Make it circular for the first node
    } else {
      Node current = head;
      while (current.next != head) {
        current = current.next;
      }
      current.next = newNode;
      newNode.next = head;
    }
  }

  // Function to divide the circular linked list in half
  public Node divideList() {
    Node slow = head;
    Node fast = head;

    // Find the middle node (slow pointer) and the last node (fast pointer at the end of second iteration)
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // If the list is empty or has only one node, return the head
    if (slow == head && fast == null) {
      return head;
    }

    // Separate the second half by making the last node point to the new head (slow.next)
    Node secondHalfHead = slow.next;

    // Handle even number of nodes: move slow one more step to put the middle element in the first half
    if (fast != null) {
      slow = slow.next; // Move slow one more step for even number of nodes
    }
    slow.next = head;

    // Make the circular list for the second half
    fast.next = secondHalfHead;

    return secondHalfHead; // Return the head of the second half
  }

  // Function to print the linked list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    Node current = head;
    do {
      System.out.print(current.data + " -> ");
      current = current.next;
    } while (current != head);
    System.out.println("null"); // Indicate the end of the circular list
  }

  public static void main(String[] args) {
    CircularLinkedList list = new CircularLinkedList();
    list.insertNode(1);
    list.insertNode(2);
    list.insertNode(3);
    list.insertNode(4);
    list.insertNode(5);
    list.insertNode(6); // Sample list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 1

    System.out.println("Original list:");
    list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 1

    Node secondHalfHead = list.divideList();

    System.out.println("\nFirst half:");
    list.printList(); // Output: 1 -> 2 -> 3 -> 1 (original head becomes head of first half with middle element)

    System.out.println("\nSecond half:");
    CircularLinkedList secondList = new CircularLinkedList(); // Create a new list to hold the second half
    secondList.head = secondHalfHead;
    secondList.printList(); // Output: 4 -> 5 -> 6 -> 4 (new head and circular structure for second half)
  }
}
