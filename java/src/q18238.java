//수정 필요

import java.io.*;

public class q18238 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char [] arr_input = input.toCharArray();

        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char [] arr = Alphabet.toCharArray();
        
        int time = 0;
        int sum = 0;
        int [] check = new int[arr_input.length];

        for(int i = 0; i < arr_input.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr_input[i] == arr[j]){
                    check[j] = j; 
                    //System.out.print(check[j] + " ");
                    break;
                }
                //else continue;
            }
            System.out.println(check[i]);
            if(check[i] > 13) time = check[i] - 13;
            else { time = check[i]; }
            sum += time;
        }
        System.out.print(sum);
    
    }
}
