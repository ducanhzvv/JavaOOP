import java.util.Scanner;

public class bai5slidetr94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tong = 0;
        while (tong < 100) 
        { 
            System.out.println("nhap cac so: ");   
            n =scanner.nextInt();
            tong = tong + n;
        }
        System.out.println("tong cac so da nhap la: " + tong );
    }
}
