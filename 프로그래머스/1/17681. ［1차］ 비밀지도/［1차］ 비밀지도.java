메모리: 85.4 MB, 시간: 9.55 ms
import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 10진수 정수 배열을 2진수 문자열 배열로 변환
        // 2개의 지도를 모두 변환 후 만약 각 문자열의 길이가 n보다 작다면 작은 만큼 "0"추가
        String[] strarr1 = new String[n];
        String[] strarr2 = new String[n];
        for(int i=0;i<n;i++){
            String binary = Integer.toBinaryString(arr1[i]);
            binary = String.format("%" + n + "s", binary).replace(' ', '0');
            strarr1[i] = binary;
            
            binary = Integer.toBinaryString(arr2[i]);
            binary = String.format("%" + n + "s", binary).replace(' ', '0');
            strarr2[i] = binary;
        }
        
        // 변환된 지도2개의 같은 인덱스의 값을 비교해 0이 아니면 모두 # 으로 처리
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                if(strarr1[i].charAt(j) == '0' && strarr2[i].charAt(j) == '0'){
                    sb.append(" ");
                }
                else{
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}

// 다른 풀이
// or연산자를 이용해 두 지도의 통합을 한번에 해결
// format매서드로 문자열의 한변의 크기에 맞춰 지도를 생성
// replaceAll로 벽과 통로 문제가 제시한 문자에 맞게 변환
메모리: 79.5 MB, 시간: 11.90 ms
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
// 위의 풀이에서 format 매서드에 문제 조건인 1 ≦ n ≦ 16 을 활용 어떤 길이가 오든 이진수를 오른쪽 정렬하여 빈칸을 공백으로 채움
// substring으로 문자열의 끝에서 n번째 길이부터 끝까지 자른 후
// 위와 같이 replaceAll
메모리: 92.8 MB, 시간: 2.43 ms
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      String temp;

      for(int i = 0 ; i < n ; i++){
          temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
          temp = temp.substring(temp.length() - n);
          temp = temp.replaceAll("1", "#");
          temp = temp.replaceAll("0", " ");
          answer[i] = temp;
      }

      return answer;
  }
}
// 재귀를 사용한방식
// // makeSharp는 십진수를 이진수로 변환하는 매서드
// 기본 사례:
// n == 0인 경우
// 만약 남은 길이 m이 0보다 크다면, 남은 자리수만큼 공백 " "을 채워 반환합니다.
// m이 0이면 빈 문자열 ""을 반환합니다.

// 재귀 사례:
// n이 0이 아닐 때, n을 2로 나눈 몫과 남은 길이 m-1을 가지고 재귀호출합니다.
// 재귀호출 결과 뒤에 현재 자리의 비트를 판단하여 n % 2 값이 0이면 " " (공백)을, 1이면 "#"를 추가합니다. 나머지는 동이

메모리: 68.8 MB, 시간: 2.38 ms
class Solution {
    public String makeSharp(int n, int m) {
        if(n == 0) {
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
        }
    }
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}
// 챗 gpt o3-mini-high 모델에게 가장 속도가 빠른 풀이를 도출해내라고 했을때 풀이
메모리: 79.3 MB, 시간: 0.34 ms
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            int temp = arr1[i] | arr2[i];
            int w = n;
            while(w-- != 0) {
                str.insert(0, (temp % 2) == 1 ? "#" : " ");
                temp >>= 1;
            }
            answer[i] = String.valueOf(str);
        }
        return answer;
    }
}


