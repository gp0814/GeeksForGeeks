class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Node temp=head;
        String s="";
        ArrayList<Integer> al=new ArrayList<>();
         ArrayList<Integer> al1=new ArrayList<>();
        while(temp!=null)
        {
            //s+=temp.data;
            al.add(temp.data);
            al1.add(temp.data);
            temp=temp.next;
        }
        Collections.reverse(al);
        if(al.equals(al1))
        {
            return true;
        }
        return false;
    }
}