import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);  // 문자 정렬
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String sortedStr = new String(charArray);
        return sortedStr;
    }
}