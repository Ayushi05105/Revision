package LinkedList;

public class reverseLL {

    public static  class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                this.next = null;
            }
        }

    public static void print(Node head) {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + "  ");
        temp = temp.next;
    }

    System.out.println(" ");
}    

    public static  Node rev(Node head){
        Node after = null;
        Node prev = null;
        Node curr = head;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(4);
        print(head);
        head = rev(head);
        print(head);
       

    }
    
}
