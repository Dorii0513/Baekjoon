import java.io.*;
public class q8958 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int[] fin = new int[N];

        for(int i = 0; i < N; i++){
            System.out.print((i+1) + "번 째: ");
            arr[i] = br.readLine();
        }

        for(int i = 0; i < N; i++){
            int cnt = 0;
            int sum = 0;
            for(int k = 0; k < N; k++){
                if(arr[i].charAt(k)=='O'){
                    cnt++;
                } else {cnt = 0;}
                sum += cnt;
            }
            System.out.println(sum);
        }
    } 
}
