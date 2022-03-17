/*
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
*/
import java.io.*;

public class q2739 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i = 1; i < 10; i++ ){
            num = N * i;
            System.out.printf("%d * %d = %d \n",N,i,num);
        }
    }    
}
