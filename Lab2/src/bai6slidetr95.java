import java.util.Scanner;

public class bai6slidetr95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, gt =1; int i =1;
        System.out.println("nhap giai thua: ");
        n =scanner.nextInt();
        do 
        { 
            gt *= i; i++; 
        } while (i <= n);
        System.out.println("giai thua cua " + n + " la: " + gt);
    }
}
