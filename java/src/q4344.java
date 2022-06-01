import java.io.*;
import java.util.*;

public class q4344 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int C = Integer.parseInt(br.readLine());
        int scoreArr [];
        int[] rateArr = new int[C];
        
        for(int i = 0; i < C; i++){
            int studentNum = Integer.parseInt(st.nextToken());
            scoreArr = new int[studentNum];
            int sum = 0;
            int count = 0;

            for(int z = 0; z < studentNum; z++ ){
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                scoreArr[z] = score;
            }

            for(int x = 0; x < studentNum; x++){
                if (scoreArr[x] > sum/studentNum) {
                    count += 1;
                }
            }

            rateArr[i] = count/C * 100;
        }
        
        for(int y = 0; y < C; y++){
            System.out.println(rateArr[y] + "%");
        }
    
    }
}
