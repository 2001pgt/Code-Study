class Solution {
    public int[] solution(String[] strlist) {
        // 1.일단 배열 할당
        int[] answer = new int[strlist.length];
        
        for(int i=0;i<strlist.length;i++)
        {   
            // 2.문자열 변수에 저장
            String str = strlist[i];
            // 3.길이를 정수 배열에 넣기
            answer[i] = str.length();
        }
        
        return answer;
    }
}