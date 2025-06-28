import java.util.Stack;
public class reversestack {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        } 
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);

    }
        public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);

        // Stack<Integer> gt = new Stack<>();
        // while(rt.size()>0){
        //     gt.push(rt.pop());
        // }
        // System.out.println(gt);
        

        // while(gt.size()>0){
        //     st.push(gt.pop());
        // }
        // System.out.println(st);

        //reversing recursively
        reverse(st); 
        System.out.println(st);

    }  
}
