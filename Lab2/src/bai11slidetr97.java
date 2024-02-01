import java.util.Scanner;

public class bai11slidetr97 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("So phan tu cua mang: ");
        n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Phan tu thu " +(i +1)+ " la: ");
            a[i] = scanner.nextInt();
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++)//mang a dc lam giong bang b
        {
            b[i] = a[i];
        }
        // Sx mang b theo thu tu tang dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) 
            {
                if (b[i] > b[j]) 
                {
                    int tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }
        System.out.println("mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nmang da xep sap theo thu tu tang dan la: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(b[i] + " ");
        }
    }
}
