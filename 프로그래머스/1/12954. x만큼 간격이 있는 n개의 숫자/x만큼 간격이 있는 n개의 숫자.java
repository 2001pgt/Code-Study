class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = (long)(i+1)*x;
        }
        return arr;
    }
}