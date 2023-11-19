import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] arr = new int[100];
        int n = 0;
     

        for (int i = 0; i < 100; i++) {
             arr[i] = sc.nextInt();
            if(arr[i] == 0){
                n = i;
                break;
            }
        }

        System.out.println(arr[n - 1]+arr[n - 2]+arr[n - 3]);
    }
}