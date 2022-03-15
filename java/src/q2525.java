/*
째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
*/
import java.io.*;
import java.util.*;

public class q2525 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int Timer = Integer.parseInt(br.readLine());

        int H2;
        int M2 = Timer + M1;
        int Q = M2/60; 
        if(M2 < 60){
            H2 = H1;
        }else{
            M2 = M2 - Q * 60;
            H2 = Q + H1;
            if(H2 > 23) H2 = H2 - 24;
        }

        System.out.print(H2 + " " + M2);
    }   
}
