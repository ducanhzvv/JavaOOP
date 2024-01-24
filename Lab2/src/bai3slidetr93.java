import java.util.Scanner;

public class bai3slide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap tuoi: ");
        n =scanner.nextInt();
        phantuoi(n);
    }
    public static void phantuoi(int n)
    {
        if (n < 16)
        {
         System.out.println("Ban [Ten] o do tuoi vi thanh nien");   
        }else if (18 > n)
        {
            System.out.println("Ban [Ten] o do tuoi truong thanh ");
        }else
        {
            System.out.println("Ban [Ten] da gia");
        }
    }
}