package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTestArray02_10 {
    public int solution1(int n, int[][] arr){
        int answer=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int a = arr[i][j];
                int top = arr[i-1][j];
                int bot = arr[i+1][j];
                int left = arr[i][j-1];
                int right = arr[i][j+1];
                if(a>top && a>bot && a>left && a>right)
                    answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        AlgorithmTestArray02_10 al = new AlgorithmTestArray02_10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println(al.solution1(n, arr));
    }
}
