import java.io.*;

public class q3052 {
   public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[10];
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(arr[i] != arr[j]) cnt = cnt++;
            }
        }
        System.out.print((cnt/10)+1);
    } 
}
