class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // p와t의 길이를 저장하는 변수
        int size_p = p.length();
        int size_t = t.length();
        // p를 정수로 변환
        long nump = Long.parseLong(p);
        // 모든 비교 경우의 수
        int total_try = size_t-size_p+1;
        // substring()을 사용하여 size_p길이 만큼 추출하여 크기비교
        // for문으로 전부 실행
        for(int i=0;i<total_try;i++){
            String result = t.substring(i,i+size_p);
            System.out.println(result);
            if(Long.parseLong(result)<=nump){
                answer++;
            }
        }
        return answer;
    }
}