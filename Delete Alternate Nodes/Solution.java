// Node class representing a node in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    // Function to delete alternate nodes in the linked list
    public void deleteAlt(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null && temp.next != null) {
            // Skip the next node by linking current node to next of next node
            temp.next = temp.next.next;

            // Move to the next node (which is two steps ahead)
            temp = temp.next;
        }
    }
}

// Helper class to build and test the linked list
public class Main {
    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the Solution class
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Create a Solution object and delete alternate nodes
        Solution sol = new Solution();
        sol.deleteAlt(head);

        // Print the modified list after deleting alternate nodes
        System.out.println("List after deleting alternate nodes:");
        printList(head);
    }
}
