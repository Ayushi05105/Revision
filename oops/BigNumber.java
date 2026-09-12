package oops;

class BigNumber {
class Node{
    int digit;
    Node next;
     Node(int digit){
        this.digit = digit;
        this.next = null;
    }
   }
    private Node head;
    private boolean negative;
    BigNumber(String s){
        if(s.charAt(0)=='-'){
            negative = true;
            s = s.substring(1);
        }
        else{
            negative = false;
        }

        // leading zero remove
        while(s.length() > 1 && s.charAt(0)=='0'){
            s = s.substring(1);
        }

        //create ll
        Node tail = null;
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i)-'0';
            Node newNode = new Node(digit);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        //-0 -> 0
        if(s.equals("0")){
            negative = false;
        }

        
    }
    @Override 
        public String toString(){
            StringBuilder sb = new StringBuilder();
            if(negative){
                sb.append("-");
            }
            Node temp = head;
            while(temp != null){
                sb.append(temp.digit);
                temp = temp.next;
            }
            return sb.toString();
        }

        private int length(){
            int cnt =0;
            Node temp = head;
            while(temp != null){
                cnt++;
                temp = temp.next;
            }
            return cnt;
        }
        private int compareMagnitude(BigNumber other){
            int len1 = this.length();
            int len2 = other.length();

            if(len1 > len2){
                return 1;
            }
            if(len1 < len2){
                return -1;
            }
            Node temp1 = this.head;
            Node temp2 = other.head;
            while(temp1 != null){
                if(temp1.digit > temp2.digit){
                    return 1;
                }
                if(temp1.digit < temp2.digit){
                    return -1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return 0;
        }

        private Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        private BigNumber addMagnitude(BigNumber other){
            Node p = reverse(this.head);
            Node q = reverse(other.head);
            Node resHead = null;
            Node resTail = null;
            int carry =0;
            while(p != null || q!= null || carry != 0){
                int sum = carry;
                if(p != null){
                    sum += p.digit;
                    p = p.next;
                }
                if(q != null){
                    sum += q.digit;
                    q = q.next;
                }
                int digit = sum %10;
                carry = sum /10;

                Node newNode = new Node(digit);
                if(resHead == null){
                    resHead = newNode;
                    resTail = newNode;
                }
                else{
                    resTail.next = newNode;
                    resTail = newNode;
                }
            }
            resHead = reverse(resHead);
            BigNumber res = new BigNumber("0");
            res.head = resHead;
            res.negative = false;

            return res;
        }
    public static void main(String[] args) {
        BigNumber a = new BigNumber("456");
        BigNumber b = new BigNumber("123");
        System.out.println(a.compareMagnitude(b));
    }
}   

