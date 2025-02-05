class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int size = s.length();
        if(size == 4 || size == 6){
            
        }
        else{
            return false;
        }
        char[] charArray = s.toCharArray(); // 문자 배열로 변경
        for(int i=0;i<size;i++){
            if( 48<=charArray[i] && 57>=charArray[i]){
            }
            else{
                return false;
            }
        }
        return answer;
    }
}