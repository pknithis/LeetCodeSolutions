public class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        HashMap <Character,Character> hm = new HashMap<Character,Character>();
        
        if(s.length() <= 1) return false;
        hm.put('(',')');
        hm.put('[',']');
        hm.put('{','}');
        
        for(int i = 0;i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c=='{' || c=='[')
               {
                   st.push(c);
                   continue;
               }
            
            if(c == ')' || c=='}' || c==']')
            {
                if(st.size() == 0 ) return false;
                
                if(c != hm.get(st.pop()))
                  return false;
            }
        }
        if(st.size() !=0) return false;
        else
        return true;
    }
}