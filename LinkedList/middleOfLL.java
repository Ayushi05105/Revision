package LinkedList;

public class middleOfLL {

    public static  class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                this.next = null;
            }
        }

    public static Node Middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(4);
        System.out.println(Middle(head));

    }
    
}
