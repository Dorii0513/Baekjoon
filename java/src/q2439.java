import java.util.Scanner;
public class q2439 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; N--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
