package LinkedList;

public class lengthOfLoop {

    public static  class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                this.next = null;
            }
    }
    public static  int length(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        
        int cnt =1;
        while(slow != fast){
            slow = slow.next;
            cnt++;
        }
        return cnt;
    }
    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        head.next =a;
        Node b = new Node(3);
        a.next = b;
        Node c = new Node(4);
        b.next =c;
        Node d = new Node(5);
        c.next = d;
        System.out.println(length(head));

    }
}
