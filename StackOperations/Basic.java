import java.util.Scanner;
import java.util.Stack;

/**
 * ImplementationUsingArray
 */
public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the elements you want to insert: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
      System.out.println(st);

      // reverse order
      Stack<Integer> rt = new Stack<>();
      while (st.size()> 0) {
        int x = st.peek();
        rt.push(x);
        st.pop();
      }
      System.out.println(rt);
    }
}