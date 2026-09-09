package oops;

public class BigNumber {
    public static class Node{
        int digit;
        Node next;
         Node(int digit){
            this.digit = digit;
           // this.next = next;
        }
    }
    private Node head;
    private boolean neg;
    private BigNumber(String s){
        if(s==null || s.length()==0){
            throw new IllegalArgumentException("Invalid No.");
        }

        int start = 0;

        if(s.charAt(0)=='-'){
            neg = true;
            start = 1;
        }
        else if(s.charAt(0)=='+'){
            start = 1;
        }
        
        if(start == s.length()){
            throw new IllegalArgumentException("Invalid Number");
        }
        while(start <s.length()-1 && s.charAt(start)=='0'){
            start++;
        }
        for(int i = s.length()-1;i>=start;i--){
            char c= s.charAt(i);
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("Invalid number");
            }
            addFirst(c-'0');
        }
    }

  private BigNumber(){
    head = null;
    neg = false;
  }
  private void addFirst(int digit){
    Node a = new Node(digit);
    a.next = head;
    head = a;
  }
    
}   

