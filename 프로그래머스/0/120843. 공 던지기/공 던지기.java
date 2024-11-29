class Solution {
    public int solution(int[] numbers, int k) {
        int n = 0;
        // 공식 ((k-1)*2 - 배열크기*n) < 배열크기 인 인덱  
        if((k-1)*2 - numbers.length*n>numbers.length){
            while(((k-1)*2 - numbers.length*n) > numbers.length){
                n++;
            }
        }
        
        
       
        
        return numbers[(k-1)*2 - numbers.length*n];
    }
}