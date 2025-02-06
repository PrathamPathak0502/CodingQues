class LinkedListCreate {
    Node head; 

  
    static class Node {
        int data;
        Node next;

        
        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    public static LinkedList insert(LinkedList list, int data) {
      
        Node newNode = new Node(data);
        newNode.next = null;

      
        if (list.head == null) {
            list.head = newNode;
        } else {
           
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
       
            last.next = newNode;
        }
        return list;
    }

    
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

       
        while (currNode != null) {
           
            System.out.print(currNode.data + " ");
           
            currNode = currNode.next;
        }
    }

        public static void main(String[] args) {
      
        LinkedList list = new LinkedList();

      
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

       
        printList(list);
    }
}
