public class List_3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            
        }
    }
    static void disp(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    static void insertAtMid(int idx, Node head, int val){
         Node newNode = new Node(val);
         if(head == null){
              head = newNode;
         }
         else{
            Node temp = head;
            for(int i =0; i<idx-1; i++){
                   temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
         }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
       disp(head);
       insertAtMid(3, head, 11);
       disp(head);

    }
}
