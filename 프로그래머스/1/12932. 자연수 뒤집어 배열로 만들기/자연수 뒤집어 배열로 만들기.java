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
// 아래 풀이들은 프로그래머스에 올라온 풀이중 좋아요가 높은 풀이들이다. 이들의 성능을 확인해 봤는데 4번째 풀이 말고는 성는차이가 꽤났다.
// 첫번째 풀이는 문자열에 정수를 추가하는 과정이 새로운 문자열 객체를 생성하는 방식이라 시간이 오래 걸리는듯하다.
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
// 이 풀이는 왜오래 걸리는지는 잘모르겠지만 일단 코드는 짧긴하다
메모리: 92.3 MB, 시간: 16.89 ms
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
// 이 풀이도 reverse매서드 때문에 시간이 살짝 걸리는듯하다.
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
// 이 풀이가 수학적으로 잘풀어낸 풀이같다.
// 성능도 나의 풀이와 거의 같다.
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
// 이 풀이는 스트링버퍼로 n을 문자열로 바꾼뒤 뒤집어서 문자열 배열로 만든거 같다.
// 그 뒤에 아스키코드로 문자를 하나씩 정수 배열에 넣은 듯하다.
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
