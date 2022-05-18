package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 에라토스테네스의 체
 *
 * 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다. 그림에서 회색 사각형으로 두른 수들이 여기에 해당한다.
 * 2는 소수이므로 오른쪽에 2를 쓴다.
 * 자기 자신을 제외한 2의 배수를 모두 지운다.
 * 남아있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다.
 * 자기 자신을 제외한 3의 배수를 모두 지운다.
 * 남아있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다.
 * 자기 자신을 제외한 5의 배수를 모두 지운다.
 * 남아있는 수 가운데 7은 소수이므로 오른쪽에 7을 쓴다.
 * 자기 자신을 제외한 7의 배수를 모두 지운다.
 * 위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.
 */
public class AlgorithmTestArray02_05 {

    // 소수 구하기 - 에라토스테네스의 체 (for문 반복횟수 줄이기)
    public int solution1(int n){
        int answer=0;
        // arr 배열 index n+1 번까지 0으로 초기화 (index 0 부터 시작이므로 n+1)
        int[] arr = new int[n+1];
        for(int i=2; i<arr.length; i++){
            //처음에 2는 소수이므로 2부터 시작. 또한 arr[2] = 0 이기 때문에 조건 만족
            if(arr[i] == 0){
                answer++;
                // i 배수 배열에 1대입 ( 즉 2,3,5,7,11,13.. 등 소수의 배수번째의 배열은 값 을 1로 변환)
                for(int j=i; j<arr.length; j+=i){
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_05 al = new AlgorithmTestArray02_05();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(al.solution1(input));
    }
}
