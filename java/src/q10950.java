import java.io.*;
import java.util.*;

public class q10950 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("반복 횟수를 입력하시오 : ");
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            //System.out.print("숫자를 입력하시오 : ");
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            System.out.print(sum + "\n");
        }

    }
}
