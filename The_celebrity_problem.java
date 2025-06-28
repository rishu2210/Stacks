import java.util.Stack;
public class The_celebrity_problem {
    public int celebrity(int mat[][],int n) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(mat[v1][v2]==0){ //may be v1 is celeb & v2 is not celeb
                st.push(v1);
            }
            else if(mat[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;
        int potential = st.pop();
        for(int j=0;j<n;j++){
            if(mat[potential][j]==1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(mat[i][potential]==0) return -1;
        }
        return potential;
    }
    public static void main(String[] args) {
        The_celebrity_problem sol = new The_celebrity_problem();
        int[][] mat = {
            {0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 0, 0}
        };
        int n = 4;
        System.out.println(sol.celebrity(mat, n)); // Output: 1
    }
}