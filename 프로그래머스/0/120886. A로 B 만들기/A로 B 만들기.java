class Solution {
    public int solution(String before, String after) {
        // before 첫 문자부터 마지막 문자까지 after안에 있는지 확인한다.
        // 만약 있다면 해당 위치의 after문자를 삭제
        // 없다면 0 반환
        // 전부 통과 하면 1 반환
        StringBuilder sb = new StringBuilder(after);
        for(int i=0;i<before.length();i++){
            
            if(sb.indexOf(String.valueOf(before.charAt(i))) == -1){
                return 0;
            }
            else{
                sb.deleteCharAt(sb.indexOf(String.valueOf(before.charAt(i))));  
            }
            
        }
        return 1;
    }
}