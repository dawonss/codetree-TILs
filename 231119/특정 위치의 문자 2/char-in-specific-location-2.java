import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] arr = new char[10];
        int n = 0;  

        for (int i = 0; i < 10; i++) {
             arr[i] = sc.next().charAt(0);
            if(i == 1 || i == 4 || i == 7){
                System.out.print(arr[i]+" ");
            }
        }

      
    }
}