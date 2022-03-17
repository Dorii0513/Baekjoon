/*
흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. 
"Quadrant n"은 "제n사분면"이라는 뜻이다.

예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
*/

//Scanner 이용한 풀이
import java.util.*;

public class q14681 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //Scanner객체 선언
        int x = input.nextInt(); // x좌표 입력 받기
        int y = input.nextInt(); // y좌표 입력 받기
        input.close();
        if(x > 0 && y > 0) System.out.println("1"); // 둘다 양수일 때 1 출력
        else if(x < 0 && y > 0) System.out.println("2"); // x 음수, y 양수일 때 2 출력
        else if(x < 0 && y < 0) System.out.println("3"); // x 음수, y 음수일 때 3 출력
        else if(x > 0 && y < 0) System.out.println("4"); // x 양수, y 음수일 때 4 출력

    }
}

/* BufferedReader이용 풀이

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        if(x > 0 && y > 0) System.out.println("1");
        else if(x < 0 && y > 0) System.out.println("2");
        else if(x < 0 && y < 0) System.out.println("3");
        else if(x > 0 && y < 0) System.out.println("4");
    }
}
*/


