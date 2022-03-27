import java.io.*;
import java.util.*;
public class q2864 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        String A = st.nextToken();
        String B = st.nextToken();
        int [] A_arr = new int[A.length()];
        int [] B_arr = new int[B.length()];

        int [] A_max = new int[A.length()];
        int [] B_max = new int[B.length()];
        int [] A_min = new int[A.length()];
        int [] B_min = new int[B.length()];

        for(int i = 0; i < A.length(); i++){
            A_arr[i] = A.charAt(i) - '0';
            if(A_arr[i] == 5) A_max[i] = 6;
            else A_max[i] = A_arr[i];
            if(A_arr[i] == 6) A_min[i] = 5;
            else A_min[i] = A_arr[i];
        }
        for(int i = 0; i < B.length(); i++){
            B_arr[i] = B.charAt(i) - '0';
            if(B_arr[i] == 5) B_max[i] = 6;
            else B_max[i] = B_arr[i];
            if(B_arr[i] == 6) B_min[i] = 5;
            else B_min[i] = B_arr[i];
        }
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        for(int A_Max : A_max){
            num1 *= 10;
            num1 += A_Max;
        }
        for(int B_Max : B_max){
            num2 *= 10;
            num2 += B_Max;
        }
        for(int A_Min : A_min){
            num3 *= 10;
            num3 += A_Min;
        }
        for(int B_Min : B_min){
            num4 *= 10;
            num4 += B_Min;
        }
        int sum_max = num1 + num2;
        int sum_min = num3 + num4;
        System.out.print(sum_min +" "+ sum_max);
    }
}
/*이규님 풀이
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2864 {

   public static void main(String[] args) throws IOException {
      // 5와 6
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      String A = st.nextToken();
      String B = st.nextToken();
      int max=0;
      int min=0;
      
      max += Integer.parseInt(A.replace('5', '6')) + Integer.parseInt(B.replace('5', '6'));

      
      min += Integer.parseInt(A.replace('6', '5')) + Integer.parseInt(B.replace('6', '5'));

      
      System.out.println(min+" "+max);
   }

}*/