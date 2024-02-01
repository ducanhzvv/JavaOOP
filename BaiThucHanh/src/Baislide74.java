import java.util.Scanner;

public class Baislide74 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do
        {
         System.out.println("nhap so luong phan tu");
         n =scanner.nextInt();   
        } while (n < 0);
        int a[] = new int[n];
        System.out.println("nhap cac phan tu: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println("nhap phan tu thu " +(i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        int t = 0;
        for(int i = 0; i < n; i++)
        {
            if( a[i] % 2 == 0)
            {
                t +=a[i];
            }
        }
        System.out.println("Tong cac so chan la: " + t);
    }
}