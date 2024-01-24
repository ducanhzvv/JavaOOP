import java.util.Scanner;

public class Baislide47 {
    public static void main(String[] args) {
        nhapson();
    }
    public static void nhapson()
    {
        int n, tong = 0;
        Scanner scanner = new Scanner(System.in);      
        do 
        {
         System.out.println("nhap cac so nguyen : ");
           n =scanner.nextInt();
           tong += n;               //tong = tong + n;
        } 
        while (tong < 100); 
         System.out.println("tong cac so vua nhap = " + tong);
    }
}
