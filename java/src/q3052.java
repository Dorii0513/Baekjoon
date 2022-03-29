import java.io.*;

public class q3052 {
   public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[10];
        int [] cnt = new int[10];
        int sum = 0;
        

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }
        for(int i = 0; i < 10; i++){
            int chk = 0;
            for(int j = 0; j < 10; j++){
                if(arr[i] == arr[j]) {chk = chk + 1; cnt[i] = chk;}
            }
        }
        for(int i =  1; i <= 10; i++){
            int add = 0;
            for(int j = 0; j < 10; j++){
                if(i == cnt[j]){
                    if(i == 1){sum += 1;}
                    else{ add = add + 1;}//else 안넣어서 결과값 안나왔었음.
                }
            }
            sum += add/i;
        }
        System.out.print(sum);
    } 
}
