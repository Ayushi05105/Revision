package LinkedList;

public class insertDelete {
        public static  class Node{
            int data;
            Node next;
             Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static  Node insertAtHead(Node head,int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return head;
        }

        public static void deleteAthead(Node head){
            if(head == null) return;
            head = head.next;
        }

        public static int length(Node head){
            int cnt=0;
            while(head.next!=null){
                head = head.next;
                cnt++;
            }
            return cnt+1;
        }
        public static  boolean search(Node head,int data){
            while(head !=null){
                if(head.data == data){
                    return true;
                }
                head = head.next;
            }
            return false;
        }
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(5);
            head.next.next = new Node(4);
            System.out.println(length(head));
            System.out.println(search(head, 5));
        }
        
    }
    




