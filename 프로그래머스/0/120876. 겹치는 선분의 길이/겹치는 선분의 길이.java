class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[202]; // -100 ~ 100을 0 ~ 200으로 매핑
        int answer = 0;

        // 모든 선의 구간을 배열에 기록
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 101; // 오프셋 +101
            int end = lines[i][1] + 101;
            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        // 겹치는 구간의 길이를 계산
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) { // 두 선 이상이 겹친 경우
                answer++;
            }
        }

        return answer;
    }
}
