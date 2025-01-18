class Solution {
  public int[] solution(long n) {
      char[] arr = new StringBuffer(String.valueOf(n)).reverse().toString().toCharArray();
      int[] answer = new int[arr.length];

      for(int i = 0; i < arr.length; i++){
          answer[i] = arr[i] - 48;
      }

      return answer;
  }
}