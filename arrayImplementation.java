import java.util.*;

public class arrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = -1;

        void push(int x) {
            if (idx == arr.length - 1) {
                System.out.println("Stack is full");
                return;
            }
            idx++;
            arr[idx] = x;
        }

        int peek() {
            if (idx == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx];
        }

        int pop() {
            if (idx == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx];
            idx--;
            return top;
        }

        void display() {
            if (idx == -1) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = 0; i <= idx; i++) { 
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx + 1; 
        }
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        st.push(8);
        st.display();

        System.out.println("Size of s tack: " + st.size());
        st.pop();
        st.display();
    }
}
