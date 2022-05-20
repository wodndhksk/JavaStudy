package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTestArray02_07 {
    public int solution(int[] arr){
        int answer = 0;
        int num=0;
        for(int x : arr){
            if(x == 1){
                num++;
                answer += num;
            }else if(x==0){
                num = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        AlgorithmTestArray02_07 al = new AlgorithmTestArray02_07();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0; i<input; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(al.solution(arr));
    }
}
