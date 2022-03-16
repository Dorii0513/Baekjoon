/*
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
*/

import java.util.*;
import java.io.*;

public class q2884 {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //M이 45 이상일 때 H 값은 변동이 없음
        //M이 45미만일 때, M은 15+M의 출력값을 가져야함.
        int H2 = 0;
        int M2 = 0;
        
        if (M >= 45) { 
            H2 = H; M2 = M - 45;
        } else if (M <45) M2 = 15 + M;  // M2 = M - 45 + 60 (시각이 바뀌면서 60분이 넘어옴)
            if(H > 0) H2 = H - 1;
            else H2 = 23; // H >= 0 이므로  여기서 else는 H == 0일 때를 의미함
        
        System.out.print(H2 + " " + M2);
    }
}
