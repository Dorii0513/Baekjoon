/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 

첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
*/

import java.util.*;
import java.io.*;

public class q2480 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int prize = 0;
        if(num1 == num2 && num2 == num3) prize = 10000 + num1 * 1000;
        else if(num1 == num2 || num1 == num3 ) prize = 1000 + num1 * 100;
        else if(num2 == num3) prize = 1000 + num2 * 100;
        else 
            if(num1 > num2 )
                if(num1 > num3) prize = num1 * 100;
                else prize = num3 * 100;
            else
                if(num2 > num3) prize = num2 * 100;
                else prize = num3 * 100;
    
        System.out.print(prize);
    }
}
