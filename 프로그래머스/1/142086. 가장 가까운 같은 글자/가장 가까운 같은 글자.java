class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int idx = -1;
            for(int j=0;j<i;j++){
                // 만약 같은 문자를 발견시 해당 문자의 인덱스를 idx에 저장
                if(s.charAt(i) == s.charAt(j)){
                    idx = i - j;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}