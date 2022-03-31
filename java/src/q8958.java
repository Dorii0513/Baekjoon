import java.io.*;
public class q8958 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] fin = new int[N];

        for(int i = 0; i < N; i++){
            System.out.print((i+1) + "번 째: ");
            String str = br.readLine();
            char[] arr = str.toCharArray();
            for(int k = 0; k < arr.length; k++){
                int cnt = 0;
                if(arr[k]=='O'){
                    cnt += 1;
                    for(int j = k+1; j < arr.length; j++){
                        if(arr[k] == arr[j]) {cnt += cnt++;}
                        else { break;}
                        k++;
                    }
                }
                sum += cnt;
            }
            fin[i] = sum;
        }
        for(int i = 0; i < N; i++){
            System.out.println(fin[i]);
        }
    } 
}
