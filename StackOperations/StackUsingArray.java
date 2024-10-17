public class StackUsingArray {
    public static class MyStack {
        int arr[];
        int size;
        int top;

        public MyStack(int size) {
            arr = new int[size];
            this.size = size;
            this.top = -1;
        }

        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack overflow: ");
                return;
            }
            top++;
            arr[top] = x;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[top--];

        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        boolean isFull(){
            return top == size -1;
        }

        boolean isEmpty(){
            return top == -1;
        }

        public int size(){
            return top+1;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
       
       st.display();

       System.out.println(st.peek());

       st.pop();

       st.display();
    }
}
