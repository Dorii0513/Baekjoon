/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 
 */

import java.io.*;
import java.util.*;
public class q11021 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i = 1; i <= T; i++){
            
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sum = A + B;
            bw.write("Case #" + i + ": " + sum + "\n");

        } 
        bw.flush();
        bw.close();
    }

}
