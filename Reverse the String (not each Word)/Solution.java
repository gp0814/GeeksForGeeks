class Solution {
    
    // Function to reverse the words in a string separated by dots.
    String reverseWords(String str) {
        // Split the string based on the period character.
        String[] arr = str.split("\\.");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        
        // Loop through the array of words in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            // Append each word to the StringBuilder.
            sb.append(arr[i]);
            
            // Append a period after each word except the last one.
            if (i != 0) {
                sb.append(".");
            }
        }
        
        // Convert StringBuilder to String and return.
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String str1 = "i.like.this.program.very.much";
        String str2 = "hello.world";
        
        System.out.println("Original: " + str1);
        System.out.println("Reversed: " + solution.reverseWords(str1));
        
        System.out.println("Original: " + str2);
        System.out.println("Reversed: " + solution.reverseWords(str2));
    }
}
