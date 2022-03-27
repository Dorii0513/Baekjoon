import java.io.*;

public class q2562 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int[] arr = new int[9];
        int check = 0;
        for(int i = 0; i < 9; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(arr[i] > max) { max = arr[i]; check = i + 1;}
        }
        System.out.print(max +"\n"+ check);
    }
}
