import java.util.*;

public class q9498 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); 
        
        int score = input.nextInt(); 
        
        String grade;
        
        switch(score/10){ 
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
            default :  
                grade = "F";
                break;
        } 
        input.close();
        
    System.out.print(grade); 
    }
}
