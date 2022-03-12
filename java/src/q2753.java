/*
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
*/
import java.util.*;
public class q2753 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); //Scanner 객체 생성
        int year = input.nextInt(); // Scanner를 통해 연도(year) 입력받기
        
        // 배수와 관련된 조건이므로 나머지 값 설정
        // 나머지가 0이면 배수, 1이상이면 배수가 아님
        int A = year % 4; // 조건 A : 4의 나머지
        int B = year % 100; // 조건 B : 100의 나머지
        int C = year % 400; // 조건 C : 400의 나머지

        int fin; //결과값 fin 선언
        
        if(A == 0 && B != 0 || C == 0){ //A=0인 동시에 B는 0이 아님. 또는 C=0일 때 fin = 1
            fin = 1;
        }else { // 이외의 값은 fin = 0
            fin = 0;
        }
        System.out.print(fin); // fin값 출력
    }
}
