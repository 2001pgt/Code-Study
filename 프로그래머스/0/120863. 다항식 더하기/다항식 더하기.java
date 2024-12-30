class Solution {
    public String solution(String polynomial) {
        // 일단 공백을 기준으로 문자열 배열로 쪼개
        // 배열의 문자열 원소 중 x가 들어가 있다면
        // 문자열의 크기가 1일때와 그보다 클때로 나눈다.
        // 1일때는 x의 계수 +1
        // 1보다 클때는 0~마지막 인덱스 까지 substring 한 문자를 정수로 바꿔 x의 계수에 더해준다
        
        // 배열의 문자열 원소 중 x가 들어가 있지 않다면
        // 상수이므로 해당 문자열을 정수로 바꿔 상수에 변수에 더해준다.
        int x = 0; // x계수
        int num = 0; // 상수
        // 공백을 기준으로 분리
        String[] words = polynomial.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains("x"))
            {
                if(words[i].length()>1)
                {
                    x += Integer.valueOf(words[i].substring(0, words[i].length()-1));
                }
                else
                {
                    x+=1;
                }
            }
            else
            {   
                if(!words[i].equals("+"))
                {                    
                   num += Integer.valueOf(words[i]);
                }
            }
        }
        String answer = "";
        if(x == 1)
        {   
            if(num == 0){
                answer += "x";
            }
            else
            {
                answer += "x"+" + "+num;
            }
        }
        else if(x == 0)
        {
            answer +=num; 
        }
        else if(num == 0)
        {
            answer += x+"x";
        }
        else
        {
            answer += x+"x"+" + "+num;   
        }
        
        return answer;
    }
}