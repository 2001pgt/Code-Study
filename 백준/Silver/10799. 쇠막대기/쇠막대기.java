import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. (인가 ) 인가
        // 2 (이면 스택에 추가
        // 3 ) 이라면 전에 괄호가 무엇인지 판단
        // 4 이전 괄호가 ( =  절단, ) = 쇠막대 끝 이전 괄호를 판단하는 불리안 변수 추가
        // 5 자르는것은 스택 안에 문자열 길이 - 1 만큼
        // ( 들어올때 마다 막대 갯수 1개씩 추가
        // (추가후 ) 바로들어오면 막대갯수 -1 하고 그 상태에서 현재 막대갯수 만큼 전체
        // 막대 갯수에 추가
        // 총필요한 변수
        // 괄호 판단,전체 막대 갯수,현재 막대 갯수

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        // 입력받은 문자열 -> 문자 배열로 변환
        char[] charArray = str.toCharArray();
        // 문자 배열 출력 테스트 코드
        // System.out.println(charArray);
        // 변수
        boolean isCut = false;
        int totalStick = 0;
        int nowStick = 0;
        for(char c : charArray){
            if(c == '('){
                stack.push('(');
                totalStick++;
                nowStick++;
                isCut = true;
            }
            else if (c ==')') {
                if(isCut){
                    nowStick--;
                    stack.pop();
                    totalStick--;
                    totalStick += nowStick;
                    isCut = false;
                }
                else{
                    nowStick--;
                    stack.pop();
                    isCut = false;
                }
            }
        }
        System.out.println(totalStick);

    }
}
