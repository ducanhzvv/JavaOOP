import java.util.Scanner;

public class bai12slidetr97 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("nhap so dong: ");
        m =scanner.nextInt();
        System.out.println("nhap so cot: ");
        n =scanner.nextInt();
        int a[][] = new int[m][n];
        System.out.println("nhap cac so cua ma tran: ");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println("a[" +(1 + i) + "][" +(j + 1)+ "]");
                a[i][j] =scanner.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (max < a[i][j])
                {
                    max = a[i][j];
                }
            }
        }
        System.out.println("phan tu co gia tri lon nhat trong ma tran la: " + max);
    }
}
