import java.util.Scanner;
public class q2439 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        for(int i = 1; i <= N; i++){
            for(int j = (N-1); j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
