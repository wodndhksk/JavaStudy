package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTestArray02_09 {
    public int solution1(int len, int[] arr){
        int answer = 0;
        int tmp = 0;
        tmp = getMaxLen(len, arr);
        if(tmp < getMaxHight(len,arr))
            tmp = getMaxHight(len,arr);
        if(tmp < getMaxCross(len,arr))
            tmp = getMaxCross(len,arr);
        answer = tmp;
        return answer;
    }
    public int solution2(int len, int[][] arr){
        int answer=0;
        int sum1, sum2;
        for(int i=0; i<len; i++){
            sum1=0; sum2=0;
            // 열 더한값, 행 더한값 중 Max값 구하기
            for(int j=0; j<len; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=0; sum2=0;
        // 대각선 값 두개 중 Max값 구하기
        for(int i=0; i<len; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][len-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
    public int getMaxLen(int len, int[] arr){
        int answer = 0;
        int sum =0;
        for(int i=0; i<len*len; i+=len){
            for(int j=0; j<len; j++)
                sum += arr[i+j];
            if(answer < sum)
                answer = sum;
            sum=0;
        }
        return answer;
    }
    public int getMaxHight(int len, int[] arr){
        int answer = 0;
        int sum = 0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len*len; j+=len)
                sum += arr[i+j];
            if(answer < sum)
                answer = sum;
            sum=0;
        }
        return answer;
    }
    public int getMaxCross(int len, int[] arr){
        int answer=0;
        int sum = 0;
        for(int i=0; i<len*len; i+=len+1){
            sum += arr[i];
        }
        for(int i=len-1; i<len*len; i+=len-1)
            answer += arr[i];
        if(answer < sum)
            answer = sum;
        return answer;
    }


    public static void main(String[] args) {
        AlgorithmTestArray02_09 al = new AlgorithmTestArray02_09();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        //sol1
//        int[] arr1 = new int[len*len];
//        for(int i=0; i<len*len; i++)
//            arr1[i] = sc.nextInt();
//        System.out.println(al.solution1(len, arr1));

        //sol2
        int[][] arr2 = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++)
                arr2[i][j] = sc.nextInt();
        }
        System.out.println(al.solution2(len, arr2));


    }
}
