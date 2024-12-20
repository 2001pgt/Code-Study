class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String sb = "";
        String result = "";
        // 한 문자씩 새문자열에 추가
        // 추가 후 숫자가 완성되는지 확인 
        // 완성되면 해당숫자 다른 문자열에 추가
        // 마지막에 문자열을 정수로 변환
        for(int i=0;i<numbers.length();i++)
        {
            sb += String.valueOf(numbers.charAt(i));
            switch(sb){
                case "zero":
                    result += "0";
                    sb = "";
                    break;    
                case "one":
                    result += "1";
                    sb = "";
                    break;
                case "two":
                    result += "2";
                    sb = "";
                    break;
                case "three":
                    result += "3";
                    sb = "";
                    break;
                case "four":
                    result += "4";
                    sb = "";
                    break;
                case "five":
                    result += "5";
                    sb = "";
                    break;
                case "six":
                    result += "6";
                    sb = "";
                    break;
                case "seven":
                    result += "7";
                    sb = "";
                    break;
                case "eight":
                    result += "8";
                    sb = "";          
                    break;
                case "nine":
                    result += "9";
                    sb = "";
            }
        }
        
        return Long.valueOf(result);
    }
}

// 다른 풀이
// 인덱스 값이 문자열의 값과 같다는 것을 활용
class Solution {
    public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }
}
// replace 노가다
class Solution {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }
}
