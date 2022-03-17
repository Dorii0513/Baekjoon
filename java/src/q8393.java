/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/
import java.util.*;
public class q8393 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        int sum = 0;
        for(int i = 0; N > i; N--){
            sum += N;
        }
        System.out.print(sum);
    }
}
