public class Basic{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static void display(Node head){
        Node temp = head;
          while(temp != null){
               System.out.print(temp.data+ " ");
               temp = temp.next;
          }
    }
    public static void main(String args[]){
           Node a = new Node(7);
           Node b = new Node(9);
           Node c = new Node(5);
           Node d = new Node(1);
           a.next = b;
           b.next = c;
           c.next = d;
           d.next = null;
           display(a);

    }
}