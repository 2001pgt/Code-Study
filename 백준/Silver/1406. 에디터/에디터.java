import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 BufferedReader, BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        // 두개의 스택을 만든다.
        // 한쪽은 입력받은 문자열을 문자로쪼개 넣을 스택
        // 한개는 첫번째 스택에서 pop한 문자를 저장할 스택

        // 명령어 맵핑
        // L => pop -> pop 한 문자를 두번째 스택에 push
        // D => psuh(두번째 스택의 pop문자)
        // B => pop() 그냥 삭제
        Stack<Character> stackMain = new Stack<>();
        Stack<Character> stackSub = new Stack<>();
        for(char c : s.toCharArray()){
            stackMain.push(c);
        }
        //System.out.println("메인 스택: "+ stackMain);
        for(int i=0;i<n;i++){
            String cmd = br.readLine();
            if(cmd.length() > 1){
                stackMain.push(cmd.charAt(2));
            }
            else{
                switch (cmd){
                    case "L":
                        if(stackMain.size()>0){
                            //System.out.println("1");
                            stackSub.push(stackMain.peek());
                            stackMain.pop();
                        }
                        break;
                    case "D":
                        if(stackSub.size()>0){
                            //System.out.println("2");
                            stackMain.push(stackSub.peek());
                            stackSub.pop();
                        }
                        break;
                    case "B":
                        //System.out.println("3");
                        if(stackMain.size()>0){
                            stackMain.pop();
                        }
                        break;
                }
            }
            //System.out.println("메인 스택: "+ stackMain);
            //System.out.println("서브 스택:"+ stackSub);
        }
        //System.out.println(stackMain);
        //System.out.println(stackSub);
        StringBuilder sb = new StringBuilder();
        //System.out.println(stackMain.size());
        int mainSize = stackMain.size();

        for(int i=0;i<mainSize;i++){
            //System.out.println("main peek: "+stackMain.peek());
            stackSub.push(stackMain.peek());
            stackMain.pop();
        }
        int subSize = stackSub.size();
        for(int i=0;i<subSize;i++){
            sb.append(stackSub.peek());
            stackSub.pop();
        }
        System.out.println(sb.toString());
    }
}
