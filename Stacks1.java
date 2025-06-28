// import java.util.*;
import java.util.Stack;
public class Stacks1{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        // System.out.println("size: "+st.size());
        // System.out.println(st);
        System.out.println(st.isEmpty());
        st.push(5); 
        st.push(7); 
        st.push(2); 
        st.push(3); 
        st.push(7); 
        st.push(31); 
        st.push(23); 
        st.push(90); 
        //peek
        // System.out.println(st.peek());
        // st.pop(); 
        // System.out.println(st);
        // System.out.println("size is : "+st.size());
        // while(st.size()>3){
            //     st.pop();
            // }
        // System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}