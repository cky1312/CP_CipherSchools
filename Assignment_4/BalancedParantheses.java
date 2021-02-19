package Assignment_4;

import java.util.*;

public class BalancedParantheses {

    static boolean isBalanced(String str) {
        boolean b = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                st.push(str.charAt(i));

            if (st.empty())
                return false;
            char c;
            switch (str.charAt(i)) {
                case ')':
                    c = st.pop();
                    if (c == '}' || c == ']')
                        return false;
                    break;
                case '}':
                    c = st.pop();
                    if (c == ')' || c == ']')
                        return false;
                    break;
                case ']':
                    c = st.pop();
                    if (c == ')' || c == '}')
                        return false;
                    break;
            }

        }
        if (!st.empty())
            b = false;

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");

        sc.close();
    }

}
