import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int n = 0;  
        int m = 0;  

        for (int i = 0; i < 10; i++) {
             arr[i] = sc.nextInt();
            if(i % 2 == 0){
               n += arr[i];
            }
            if(i % 2 == 1){
               m += arr[i];
            }
        }
        if(n>m) System.out.print(n-m);
        else if(n<m) System.out.print(m-n);

      
    }
}