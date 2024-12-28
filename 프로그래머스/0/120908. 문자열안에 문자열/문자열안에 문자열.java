class Solution {
    public int solution(String str1, String str2) {
        // StringBuilder에 str1을 저장 후 str2문자열 탐색
        // 탐색된 인덱스를 저장하는 변수가 -1이 아니면 1,-1이면 2
        StringBuilder sb = new StringBuilder(str1);
        int index = sb.indexOf(str2);
        if(index != -1)
            return 1; 
        else
            return 2;
    }
}