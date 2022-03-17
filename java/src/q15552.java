import java.util.*;
import java.io.*;

public class q15552 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //System.out.print("반복 횟수를 입력하시오 : ");
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            //System.out.print("숫자를 입력하시오 : ");
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            //System.out.print(sum + "\n");
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
