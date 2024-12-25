class Solution {
    public int[] solution(int[] array) {
        // 배열을 순회하면서 가장 클 수를 찾는다.
        // 맥스 와 맥스 인덱스 변수를 만들고 배열의 첫번째 원소부터 비교한다
        // 만약 값이 맥스보다 크면 맥스와 맥스 인덱스 값을 해당 값으로 바꿔준다.
        // 그리고 순회를 마치고 두 값을 정수 배열에 넣어준다.
        int[] answer = new int[2];
        int max = 0;
        int maxindex = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                maxindex = i;
            }
        }
        answer[0] = max;
        answer[1] = maxindex;
        return answer;
    }
}