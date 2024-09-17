import java.util.Stack;
import java.util.Scanner;

class Solution {
    // Method to check if parentheses are balanced
    static boolean ispar(String x) {
        int n = x.length();
        // If the length is odd, it can't be balanced
        if (n == 1 || n % 2 == 1) return false;

        Stack<Character> st = new Stack<>();
        
        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            char ch = x.charAt(i);
            
            // If opening brackets, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.add(ch);
            }
            // For closing parentheses, check for matching pairs
            else if (ch == ')' && !st.isEmpty()) {
                if (st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == '}' && !st.isEmpty()) {
                if (st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == ']' && !st.isEmpty()) {
                if (st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            } else {
                // If a closing bracket comes with an empty stack, it's not balanced
                return false;
            }
        }
        
        // If the stack is empty, all parentheses were balanced
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of parentheses to check:");
        String input = sc.nextLine();

        if (ispar(input)) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }

        sc.close();
    }
}
