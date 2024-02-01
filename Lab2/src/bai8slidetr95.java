import java.util.Scanner;

public class bai8slidetr95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong so: ");
        n =scanner.nextInt();
        int a[] = new int[n];
        System.out.println("nhap cac so: ");
        for( int i = 0; i < n; i++)
        {
            System.out.println("nhap phan tu thu " + (i +1) + ": ");
            a[i] =scanner.nextInt();
        }
        double t = 0;
        for (int i = 0; i < n; i++)
        {
            t += a[i];
        }
        double tb = t / n;
        System.out.println("trung binh cac so vua nhap la: " + tb);
    }
}
