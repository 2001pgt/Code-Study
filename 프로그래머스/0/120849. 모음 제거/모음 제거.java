class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            // 문자를 하나씩 검사해서 다섯가지중 하나라도 해당되면 추가x, 해당안되면 sb 객체에 추가
            switch(my_string.charAt(i)){
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    sb.append(my_string.charAt(i));      
            }
        }
        String answer = sb.toString();
        return answer;
    }
}