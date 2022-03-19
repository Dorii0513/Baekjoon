import java.util.*;
import java.io.*;
public class q10952 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A,B;
        int sum;
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            sum = A + B;
            bw.write(sum);
            if(A == 0 && B == 0) break;
        }
        bw.flush();
        bw.close();
        
    }
}
