메모리: 80.9 MB, 시간: 3.45 ms
class Solution {
    public int solution(String A, String B) {
        // 맨앞에 마지막 문자를 삽입 마지막 문자 삭제
        // B와 비교 같으면 count 출력
        // 다르면 한번더 밀고 비교 반복
        // 문자열의 길이-1번 반복 후 같지 않다면 -1 리턴
        StringBuilder sb = new StringBuilder(A);
        if(A.equals(B))
            return 0;
        for(int i=0;i<A.length();i++){
            sb.insert(0,String.valueOf(sb.charAt(sb.length()-1)));
            System.out.println("삽입결과:"+sb);
            sb.deleteCharAt(sb.length()-1);
            System.out.println("삭제결과:"+sb);
            if(sb.toString().equals(B)){
                return i+1;
            }
        }
        return -1;
    }
}
// 다른 풀이
// B를 두개 이어붙여서 A가 처음 등장하는 인덱스를 반환
2.16ms, 72.3MB
class Solution {
    public int solution(String A, String B) {

        return (B+B).indexOf(A);
    }
}
