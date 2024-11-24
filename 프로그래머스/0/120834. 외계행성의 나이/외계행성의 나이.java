class Solution {
    public String solution(int age) {
        String answer = "";
        // 정수를 문자열로 형변환
        String strAge = String.valueOf(age);
        
        for(int i=0;i<strAge.length();i++){
            // 스위치문을 활용해 문자로 변경된 인덱스i의 수를 알파벳으로 변환
            switch(strAge.charAt(i)){
                case '0':
                    answer += "a";
                    break;
                case '1':
                    answer += "b";
                    break;
                case '2':
                    answer += "c";
                    break;
                case '3':
                    answer += "d";
                    break;
                case '4':
                    answer += "e";
                    break;
                case '5':
                    answer += "f";
                    break;
                case '6':
                    answer += "g";
                    break;
                case '7':
                    answer += "h";
                    break;
                case '8':
                    answer += "i";
                    break;
                case '9':
                    answer += "j";
            }
        }
        return answer;
    }
}