import java.util.*;

public class q9498 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); //scanner 클래스 객체 생성
        
        int score = input.nextInt(); // scanner를 통해 점수(변수) 입력 받기
        
        String grade; // 문자열 grade 선언
        
        switch(score/10){ // score/10에 대한 switch 함수 생성 (앞 자릿수를 구별하여 grade를 다르게 지정)
            case 10 :
            case 9 :
                grade = "A";
                break;
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            case 6 :
                grade = "D";
                break;
            default :   // 나머지 case는 모두 grade를 "F"로 함
                grade = "F";
                break;
        }
    System.out.print(grade); // grade값 출력
    }
}
