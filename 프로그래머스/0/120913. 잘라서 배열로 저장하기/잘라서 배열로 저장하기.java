class Solution {
    public String[] solution(String my_str, int n) {
    StringBuilder sb = new StringBuilder();
    int size = (my_str.length() + n - 1) / n;
    String[] strarr = new String[size];
    int index = 0;
    for (int i = 0; i < my_str.length(); i++) {
        sb.append(my_str.charAt(i));
        if ((i + 1) % n == 0 || i == my_str.length() - 1) {
            strarr[index++] = sb.toString();
            sb.setLength(0); // StringBuilder 초기화
        }
    }
    return strarr;
}
}