import java.io.*;
import java.util.*;

public class q4344_2 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        int scoreArr [];
        float[] rateArr = new float[C];
        
        for(int i = 0; i < C; i++){
            int studentNum = Integer.parseInt(br.readLine());
            scoreArr = new int[studentNum];
            int sum = 0;
            int count = 0;
            
            st = new StringTokenizer(br.readLine()," ");
            for(int z = 0; z < studentNum; z++ ){
                scoreArr[z] = Integer.parseInt(st.nextToken());
                sum += scoreArr[z];
            }

            for(int x = 0; x < studentNum; x++){
                if (scoreArr[x] > sum/studentNum) {
                    count += 1;
                }
            }

            rateArr[i] = count * 100 / studentNum;
        }
        
        for(int y = 0; y < C; y++){
            System.out.println(rateArr[y] + "%");
        }
    
    }
}
