import java.util.Stack;

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> stack = new Stack<>();
        int ans =0;
        int currlen=0;
        stack.push(-1);
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    currlen=i-stack.peek();
                    ans=Math.max(ans,currlen);
                }
            }
        }
        return ans;
            
    }
}