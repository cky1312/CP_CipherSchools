package Assignment_4;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression{
    static int evaluateExpression(String arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length(); i++){
            if(arr.charAt(i) == '+' || arr.charAt(i) == '-' || arr.charAt(i) == '*' || arr.charAt(i) == '/'){
                int v1 = st.peek(); st.pop();
                int v2 = st.peek(); st.pop();
                if (arr.charAt(i) == '+')
                    st.push(v2 + v1);
                else if (arr.charAt(i) == '-')
                    st.push(v2 - v1);
                else if (arr.charAt(i) == '*')
                    st.push(v2 * v1);
                else if (arr.charAt(i) == '/')
                    st.push(v2 / v1);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String str = "10 + 2 * 6";
        System.out.println(evaluateExpression(str));
    }
}