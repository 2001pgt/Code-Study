class Solution {
    public String solution(String cipher, int code) {
        
        // 반복문 돌려서 i+1이 code의 배수 일때 마다 i번째 문자 answer에 추가
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cipher.length();i++)
        {
            if((i+1)%code == 0)
            {
                sb.append(cipher.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }
}