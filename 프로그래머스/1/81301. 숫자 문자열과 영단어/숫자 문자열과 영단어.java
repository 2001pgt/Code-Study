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