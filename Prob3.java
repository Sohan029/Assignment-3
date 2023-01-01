package Assign3;
import java.util.Scanner;
public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int samp = 0;
        while(num != 0){
            samp = samp + (num % 10);
            num=num/10;
        }
        System.out.println(samp);
    }
}
