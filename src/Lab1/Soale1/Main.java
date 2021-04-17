package Lab1.Soale1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a,b);
        for(int i = 2;i <= min;i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                System.out.println("Nesbat be ham avval nistan");
                return;
            }
        }
        System.out.println("Nesbat be ham avvalan");
    }
}
