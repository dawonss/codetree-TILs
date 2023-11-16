import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int [] arr = new int[100]; 
        int [] newArr = new int[100]; 

        for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();       
        }

        for (int i = 0; i < n; i++) {
               newArr[i] = arr[i] * arr[i];           
        }
        
        for (int i = 0; i < n; i++) { 
            System.out.print(newArr[i] + " ");      
        }

    }
}