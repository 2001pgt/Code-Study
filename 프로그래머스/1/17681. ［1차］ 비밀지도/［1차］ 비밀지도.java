class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            char[] row = new char[n];
            // 오른쪽부터 한 자리씩 채워나가면서
            // bit 값이 1이면 '#' 아니면 ' ' 할당
            for (int j = n - 1; j >= 0; j--) {
                row[j] = (combined & 1) == 1 ? '#' : ' ';
                combined >>= 1;
            }
            answer[i] = new String(row);
        }
        return answer;
    }
}
