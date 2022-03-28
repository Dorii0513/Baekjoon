import java.io.*;
import java.util.stream.Stream;

public class q2577 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        int multi = A * B * C;
        int [] arr = Stream.of(String.valueOf(multi).split("")).mapToInt(Integer::parseInt).toArray(); // A B C 곱한 값을 자리 수 마다 배열에 저장

        int [] chk = new int[10]; // 몇 번 쓰였는지 체크하는 배열

        for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < 10; j++){
               if(arr[i] == j) chk[j] = chk[j] + 1;
           }
        }
        for(int i = 0; i < chk.length; i++){
            System.out.println(chk[i]);
        }
    }
}
