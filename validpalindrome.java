public class Solution {
    boolean isValidChar(char c)
    {
        if ((c >= 'a' && c<= 'z') ||(c>='A' && c<='Z') || (c>='0' && c<='9')) return true;
        else return false;
    }
    public boolean isPalindrome(String s) {
        StringBuilder stemp = new StringBuilder();
        
        if(s.length() <=1 ) return true;
        
        for(int i =0;i<s.length();i++)
        {
            if(isValidChar(s.charAt(i)))
               stemp.append(Character.toLowerCase(s.charAt(i)));
        }
        
        if(stemp.length()==0) return true;

        int start=0, last=stemp.length()-1;
        while(stemp.charAt(start) == stemp.charAt(last))
        {
            start++; last --;
            if((start == last) || (start > last) )
            return true;
        }
        return false;
        
    }
}