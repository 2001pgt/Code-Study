class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
    }
}