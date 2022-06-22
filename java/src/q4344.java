import java.io.*;
import java.util.*;

public class q4344 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++){
            int sum = 0;
            int count = 0;
            float avg = 0;

            st = new StringTokenizer(br.readLine()," ");
            int [] caseArr = new int [st.countTokens()];
            System.out.println(st.countTokens());

            for(int j = 0; j < st.countTokens(); j++){
                caseArr[j] = Integer.parseInt(st.nextToken());
                sum += caseArr[j];
                System.out.println(sum);
            }
            
            sum -= caseArr[0];
            System.out.println(sum);
            System.out.println(caseArr[2]);

            for(int z = 1; z < caseArr[0]; z++){
                if(caseArr[z] > sum/caseArr[0]){
                    count += 1;
                }
            }
            System.out.println(count);
            avg = count * 100 / caseArr[0];
            System.out.println(String.format("%.3f", avg));
        }
            
        }
        
        
    
}

