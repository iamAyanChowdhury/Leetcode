class Solution {
    public boolean isPalindrome(String s) {
        String f="";
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c)||Character.isLetter(c))
            {
                 f += c;
            }
        }

        f=f.toUpperCase();

        int start=0;
        int end=f.length()-1;

        while(start<=end)
        {
            if(f.charAt(start)!=f.charAt(end))
            {
                return false;
            }
            start++;
            end--;
          
        }
        return true;        
    }
}
