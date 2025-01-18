import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        // System.out.println(str);
        
        int[] answer = new int[str.length()];
        for(int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i));
            answer[i] = str.charAt(str.length()-1-i)-48;
            // System.out.println(Arrays.toString(answer));
        }
        return answer;
    }
}