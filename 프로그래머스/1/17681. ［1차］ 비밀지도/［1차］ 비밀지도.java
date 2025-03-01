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
            System.out.println(Arrays.toString(strarr1));
            System.out.println(Arrays.toString(strarr2));
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