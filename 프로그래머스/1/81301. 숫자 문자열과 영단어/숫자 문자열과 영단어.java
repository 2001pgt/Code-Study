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