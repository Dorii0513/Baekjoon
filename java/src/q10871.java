import java.io.*; 
import java.util.*;

public class q10871 {
   public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //System.out.print("N과 X를 입력하시오: ");
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        //System.out.print("num을 입력하시오: ");
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 1; i <= N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < X) bw.write(num + " ");
        }
        bw.flush();
        bw.close();
   } 
}
