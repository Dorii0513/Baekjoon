import java.io.*;
public class q1110 {

    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N < 10){
            N = N * 10;
        }
        int num1 = N / 10;
        int num2 = N % 10;
        int newNum;
        int i = 0; 
        while(true){
            i++;
            if(num1 + num2 >= 10){
                newNum = num2 * 10 + (num1 + num2 - 10);
            } else{
                newNum = num2 * 10 + (num1 + num2);
            }
            num1 = newNum / 10;
            num2 = newNum % 10;
            System.out.println("새로운 수: " + newNum);
            if(N == newNum){break;}
        }
        System.out.print(i);
    }
}
