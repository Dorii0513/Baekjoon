import java.io.*;
import java.util.*;

public class q4344 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        float [] avg = new float[C];

        for(int i = 0; i < C; i++){
            float sum = 0;
            float count = 0;
            
            st = new StringTokenizer(br.readLine()," ");
            int num = st.countTokens();
            int [] caseArr = new int [num];

            for(int j = 0; j < num; j++){
                caseArr[j] = Integer.parseInt(st.nextToken());
                sum += caseArr[j];
            }
            
            sum -= caseArr[0];

            for(int z = 1; z < num; z++){
                if(caseArr[z] > sum/caseArr[0]){
                    count += 1;
                }
            }
            avg[i] = count * 100 / caseArr[0];
        }
        for(int a = 0; a < C; a++){
            System.out.print(String.format("%.3f", avg[a]) + "%"); 
        }
    }
          
}

