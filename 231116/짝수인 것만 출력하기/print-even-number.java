import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int [] newArr = new int[n]; 


        for (int i = 0; i < n; i++) {
           newArr[i] = sc.nextInt();     
        }
          for (int i = 0; i < n; i++) {
            if(newArr[i] % 2 == 0){
              System.out.print(newArr[i] + " ");  
            }         
        }
           
    }
}