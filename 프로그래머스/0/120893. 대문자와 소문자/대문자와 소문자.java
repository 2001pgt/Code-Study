class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0;i<my_string.length();i++)
        {
            if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else{
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}