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