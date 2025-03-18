메모리: 90.5 MB, 시간: 2.22 ms
class Solution {
    public String solution(String s, String skip, int index) {
        // s를 문자 배열로 변환
        // for each문으로 문자 변환 시작
        // 만약 넘길때 skip에 해당되는 문자를 만나면 index 값 +1 해서 한번더 스킵
        // 변환된 문자는 Stringbuilder 객체에 추가한다.
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        char[] skipArray = skip.toCharArray();
        for(char c : charArray){
            for(int i=0;i<index;i++){
                c = (char)(c+1);
                if(c >122){
                    c = (char)(c-26);
                }
                for(int j=0;j<index;j++){
                    for(char sk :skipArray){
                        if(c == sk){
                            c = (char)(c+1);
                            if(c >122){
                                c = (char)(c-26);
                            }
                        // System.out.println(c);
                        }   
                    }
                }   
            }
            // System.out.println(c);
            sb.append(c);
        }
        return sb.toString();
    }
}
// String 클래스의 contains매서드를 활용하여 문자가 skip에 해당되는지 검사하였고
// while()문을 이용해 스킵 했을때의 반복횟수카운트를 +1하는 형태로 풀었다.
// 이렇게 하면 skip한 만큼 skip검사를 더할수있어서 skip을 놓치는 경우가 없어진다.
메모리: 72.9 MB, 시간: 1.50 ms
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}
