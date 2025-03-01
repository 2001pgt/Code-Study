class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            // 두 숫자를 비트 OR 연산으로 결합
            int num = arr1[i] | arr2[i];
            
            // n자리의 이진수 문자열 생성 (부족한 자리는 0으로 채움)
            String binaryStr = String.format("%" + n + "s", Integer.toBinaryString(num))
                                    .replace(' ', '0');
            
            // '1'은 '#'로, '0'은 공백으로 치환하여 최종 지도 문자열 생성
            answer[i] = binaryStr.replace('0', ' ').replace('1', '#');
        }
        
        return answer;
    }
}
