import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        
        int [] newArr = new int[10]; 
        newArr[0] = p1;
        newArr[1] = p2;

        for (int i = 2; i < 10; i++) {
            newArr[i] = (newArr[i-2] + newArr[i-1])%10;           
        }
 
         for (int i = 0; i < 10; i++) {
             System.out.print(newArr[i] + " ");    
        }

    }
}