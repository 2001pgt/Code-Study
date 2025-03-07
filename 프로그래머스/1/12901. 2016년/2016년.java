class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // a-1번 for문을 돌려 1월부터 a-1월까지 날짜를 더한다
        int day = 0;
        for(int i=1;i<a;i++){
            if( i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12 ){
                day+=31;
            }
            else if(i==4 || i==6 || i==9 || i==11){
                day+=30;
            }
            else{
                day+=29;
            }
        }  
        // 더한 결과에 b를 더한다.
        day+=b;
        // 요일 배열을 만든다.
        String[] seven = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        // 최종 결과를 7로 나눈 나머지-1 값을 인덱스로 하고 요일 배열에서 찾아 답으로한다. 
        day = (day%7)-1 < 0 ? 6 : (day%7)-1;
        answer = seven[day];
        return answer;
    }
}