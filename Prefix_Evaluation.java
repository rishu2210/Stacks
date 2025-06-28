import java.util.Stack;
public class Prefix_Evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i =str.length()-1;i>=0;i--){ // here we are going reverse
            char ch = str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            } else{ //means here is no number operator is there
                //here we are just exchanging the v1 and v2
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
  