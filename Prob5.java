package Assign3;
import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int num = (x^y);
        int count =0;
        while(num != 0){
            num &= (num - 1);
            count += 1;
        }
        System.out.println(count);
    }
}
