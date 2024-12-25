class Solution {
    public int solution(String[] s1, String[] s2) {
        // 이중 for문을 돌려서 전부 비교한다
        // 같은 문자열을 발견하면 카운트 한다
        int SameCount = 0;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    SameCount++;
                }
            }
        }
        return SameCount;
    }
}