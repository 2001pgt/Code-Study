메모리: 70.6 MB, 시간: 0.09 ms
class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int answer = 0;
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            switch (sb.toString()) {
                case "0":
                    result.append("0");
                    sb.setLength(0);
                    break;
                case "1":
                    result.append("1");
                    sb.setLength(0);
                    break;
                case "2":
                    result.append("2");
                    sb.setLength(0);
                    break;
                case "3":
                    result.append("3");
                    sb.setLength(0);
                    break;
                case "4":
                    result.append("4");
                    sb.setLength(0);
                    break;
                case "5":
                    result.append("5");
                    sb.setLength(0);
                    break;
                case "6":
                    result.append("6");
                    sb.setLength(0);
                    break;
                case "7":
                    result.append("7");
                    sb.setLength(0);
                    break;
                case "8":
                    result.append("8");
                    sb.setLength(0);
                    break;
                case "9":
                    result.append("9");
                    sb.setLength(0);
                    break;
                case "zero":
                    result.append("0");
                    sb.setLength(0);
                    break;
                case "one":
                    result.append("1");
                    sb.setLength(0);
                    break;
                case "two":
                    result.append("2");
                    sb.setLength(0);
                    break;
                case "three":
                    result.append("3");
                    sb.setLength(0);
                    break;
                case "four":
                    result.append("4");
                    sb.setLength(0);
                    break;
                case "five":
                    result.append("5");
                    sb.setLength(0);
                    break;
                case "six":
                    result.append("6");
                    sb.setLength(0);
                    break;
                case "seven":
                    result.append("7");
                    sb.setLength(0);
                    break;
                case "eight":
                    result.append("8");
                    sb.setLength(0);
                    break;
                case "nine":
                    result.append("9");
                    sb.setLength(0);
                    break;
            }
        }
        String str = result.toString();
        answer = Integer.parseInt(str);
        return answer;
    }
}

// 다른 풀이
메모리: 72.9 MB, 시간: 0.56 ms
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}

메모리: 80.4 MB, 시간: 0.11 ms
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
메모리: 79.5 MB, 시간: 4.71 ms
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}

메모리: 87.1 MB, 시간: 0.13 ms
class Solution {
    public int solution(String s) {

        String[][] mapArr = { {"0", "zero"}, 
                              {"1", "one"}, 
                              {"2", "two"}, 
                              {"3", "three"}, 
                              {"4", "four"}, 
                              {"5", "five"}, 
                              {"6", "six"}, 
                              {"7", "seven"}, 
                              {"8", "eight"}, 
                              {"9", "nine"} };

        for(String[] map : mapArr){
            s = s.replace(map[1], map[0]);
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}

