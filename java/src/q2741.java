//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//import java.util.*;
import java.io.*;
/*public class q2741 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; (N+1) > i; i++){
            System.out.print(i + "\n");
        }
    }
}
*/

public class q2741 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; N >= i; i++){
            System.out.print(i + "\n");
        }
    }
}
