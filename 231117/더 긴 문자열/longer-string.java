import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        String str1 = sc.next();
        String str2 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 > len2){
            System.out.println(str1+" "+len1);
        }else if(len1< len2){
             System.out.println(str2+" "+len2);
        }else{
            System.out.print("same");

        }
    }
}