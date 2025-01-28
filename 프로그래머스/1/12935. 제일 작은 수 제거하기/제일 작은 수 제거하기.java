class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int[] arr2 = new int[arr.length-1];
        int min = arr[0];
        if(arr.length == 1)
            return answer;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i=0,j=0;i<arr.length;i++,j++){
            if(arr[i] == min){
                j--;
            }
            else{
                arr2[j] = arr[i];
            }
        }
        return arr2;
    }
}