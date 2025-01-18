메모리: 75 MB, 시간: 0.04 ms
import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        // System.out.println(str);
        
        int[] answer = new int[str.length()];
        for(int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i));
            answer[i] = str.charAt(str.length()-1-i)-48;
            // System.out.println(Arrays.toString(answer));
        }
        return answer;
    }
}
// 다른 풀이 속도비교 
메모리: 90.5 MB, 시간: 7.73 ms
class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}

메모리: 92.3 MB, 시간: 16.89 ms
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

메모리: 84.5 MB, 시간: 0.25 ms
class Solution {
  public int[] solution(long n) {
      String s = String.valueOf(n);
      StringBuilder sb = new StringBuilder(s);
      sb = sb.reverse();
      String[] ss = sb.toString().split("");

      int[] answer = new int[ss.length];
      for (int i=0; i<ss.length; i++) {
          answer[i] = Integer.parseInt(ss[i]);
      }
      return answer;
  }
}
메모리: 77.7 MB, 시간: 0.05 ms
class Solution {
  public int[] solution(long n) {
      int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
  }
}
메모리: 85.7 MB, 시간: 0.14 ms
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
