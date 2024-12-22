import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
            if(count==1)
            {
                answer += s.charAt(i);   
            }
                count=0;
        }
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        return sortedStr;
    }
}