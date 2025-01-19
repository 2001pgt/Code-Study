import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] charArray = str.toCharArray();
        
        // 정렬 수행
        Arrays.sort(charArray);
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        // 정렬된 문자 배열을 문자열로 변환
        String sortedStr = new String(charArray);
        
        return Long.valueOf(sortedStr);
    }
}