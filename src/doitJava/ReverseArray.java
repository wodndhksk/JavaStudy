package doitJava;

/**
 * 배열요소를 역순으로 정렬
 */

public class ReverseArray {
    static void swap(int arr[], int left, int right){
        int t = arr[left];
        arr[left] = arr[right];
        arr[right] = t;
    }
    static void reverse(int arr[]){
        for (int i=0; i<arr.length/2; i++){
            swap(arr, i, (arr.length-i)-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 6, 9, 8};

        reverse(arr);

        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
