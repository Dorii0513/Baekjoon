import java.io.*;
import java.util.*;

public class q10951 {
    
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str = br.readLine();
        while(str != null){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write((A+B) + "\n" );
        }
        br.close();
        bw.flush();
        bw.close();
    }        
}    
    /*
        while(true){
            try{ //System.out.print("숫자를 입력하시오: ");
                st = new StringTokenizer(br.readLine()," ");
                A = Integer.parseInt(st.nextToken());
                B = Integer.parseInt(st.nextToken());
                //if(st == null){break;} 
                sum = A + B;
                bw.write(sum + "\n");
            }catch (NoSuchElementException e){
                break;
            }catch (NullPointerException e){
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
*/