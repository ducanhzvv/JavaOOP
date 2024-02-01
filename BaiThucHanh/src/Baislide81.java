import java.util.Scanner;

public class Baislide81 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("nhap so dong cua ma tran");
        m =scanner.nextInt();
        System.out.println("nhap so cot cua ma tran");
        n =scanner.nextInt();
        int a[][] = new int[m][n];
        System.out.println("nhap vao cac so cua ma tran");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println("a[" +(i + 1)+ "][" +(j + 1)+ "]");
                a[i][j] = scanner.nextInt();
            }
        }
        int max = a[0][0];
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
        System.out.println("phan tu lon nhat cua ma tran la: " + max);
    }
}