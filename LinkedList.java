//Program to reverse a linked list
import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(30);
        Node node3 = new Node(20);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Node current = node1;
        ArrayList<Integer> rev = new ArrayList<>();

        // Collect data in reverse order
        while (current != null) {
            rev.add(current.data);
            current = current.next;
        }

        // Update the linked list with the reversed data
        current = node1;
        for (int i = rev.size() - 1; i >= 0; i--) {
            current.data = rev.get(i);
            current = current.next;
        }

        // Print the reversed linked list
        current = node1;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}