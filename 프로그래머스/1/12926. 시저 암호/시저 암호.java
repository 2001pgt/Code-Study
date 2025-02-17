class Solution {
    public String solution(String s, int n) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                continue;
            }
            
            // 대문자인 경우
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = (char) ('A' + (charArray[i] - 'A' + n) % 26);
            } 
            // 소문자인 경우
            else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = (char) ('a' + (charArray[i] - 'a' + n) % 26);
            }
        }
        
        return String.valueOf(charArray);
    }
}