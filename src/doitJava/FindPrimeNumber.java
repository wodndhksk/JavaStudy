package doitJava;

/**
 *  100 이하의 소수 찾기
 */
public class FindPrimeNumber {
    public static void main(String[] args) {
        int num = 100;
        for(int i = 2; i < num; i++){ // 1은 어떠한 값과 나누어지기 때문에 제외
            for(int j=2; j <= i; j++){ // 2부터 자기자신 값까지 순차적으로 나누어보기
                if(i % j == 0 && i > j){
                    break;
                }
                if(i == j && i > 2){ // 자기 자신으로만 나누어 진다면
                    System.out.println(num + "이하의 소수값 : " + i);
                }
            }
        }

    }
}
