class Solution {
    public int[] solution(int[] num_list) {
        int tmp = 0; // 임시 저장 공간
        int size = num_list.length; // 배열 크기
        // 자리 바꾸기 시작
        for(int j=0;j<(size/2);j++){
            tmp = num_list[(size-1)-j]; // 임시 저장공간에 j번째 원소의 대응되는 반대쪽 원소를 넣고
            num_list[(size-1)-j] = num_list[j]; // 대응되는 반대쪽 원소자리에 j번째 원소를 넣는다.
            num_list[j] = tmp; // 그리고 j번째 자리에는 임시 저장 공간에 넣어놨던 반대편 원소를 넣는다.
        }
        return num_list;
    }
}