import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        char[] charArray = str.toCharArray();
        boolean isTag = false;
        for(char c:charArray){
            if(c == '<'){
                if(tmp.length() != 0){
                    sb.append(tmp.reverse());
                    tmp.delete(0, sb.length());
                }
                isTag = true;
                sb.append(c);
                continue;
            }
            else if(isTag == false & c == ' '){
                if(tmp.length() != 0){
                    sb.append(tmp.reverse());
                    tmp.delete(0, sb.length());
                }
                sb.append(' ');
            }
            else if (c == '>') {
                isTag = false;
                sb.append(c);
                continue;
            }
            else if(isTag == true){
                sb.append(c);
                continue;
            }
            else if(isTag == false){
                tmp.append(c);
            }
        }
        if(isTag == false & tmp.length() != 0){
            sb.append(tmp.reverse());
        }
        System.out.println(sb.toString());
    }
}