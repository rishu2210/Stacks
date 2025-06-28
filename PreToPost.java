import java.util.Stack;
public class PreToPost {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        //953+4*6/-
        Stack<String> val = new Stack<>();
        for(int i =str.length()-1;i>=0;i--){ // here we are going reverse
            char ch = str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            } else{ //means here is no number operator is there
                //here we are just exchanging the v1 and v2
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;

                //v1 v2 op
                String t = v1+v2+op;
                val.push(t);
            }
        }
        System.out.println(val.peek());        
    }
    
}
