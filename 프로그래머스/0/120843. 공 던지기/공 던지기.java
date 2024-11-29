class Solution {
    public int solution(int[] numbers, int k) {
        int n = 0;
        
        // 이 numbers 배열의 크기보다 (k-1)*2 이 크다면
        if((k-1)*2 > numbers.length){
            // (k-1)*2 에서 (배열 길이)*n 만큼 뺀값이 더 작아질때 까지 n을 늘려라
            while(((k-1)*2 - numbers.length*n) > numbers.length){
                n++;
            }
        }
        // (k-1)*2 식이 나온 이유
        // 만약 numbers 배열을 무한히 복사해서 이어붙인다면 
        // k번 째 공을 던지는 사람을 찾는법은
        // 첫번째 사람이 무조건 공을 던지므로 k-1을하고 
        // 1명을 건너뛰면서 공을 던지므로 인덱스 (k-1)*2의 사람이 공을 던지게 된다.
        // (k-1)*2이 배열보다 크다면 배열은 어쩌피 반복되기 때문에 
        // (k-1)*2가 배열크기 보다 작아질 때까지 배열크기 만큼 뺀 값을 인덱싱을 하면된다.
        
        return numbers[(k-1)*2 - numbers.length*n];
    }
}