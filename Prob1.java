package Assign3;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res=(((num+8)/3)%5)*5;
        System.out.println(res);
    }
}
