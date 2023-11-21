import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr2d = new String[5][3];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
             arr2d[i][j] = sc.next().toUpperCase();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
             System.out.println();
        
        }
    }
}