import java.io.*;
import java.util.*;
public class q1546 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        float [] arr = new float[N];
        float max = 0;
        float sum = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) max = arr[i];
        }
        for(int i = 0; i < N; i++){
            sum += (arr[i]/max)*100;
        }
        System.out.print(sum/N);
    }
}
