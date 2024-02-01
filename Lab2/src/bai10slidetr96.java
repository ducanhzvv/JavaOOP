import java.util.Scanner;

public class bai10slidetr96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kt;
        int sl = 0;
        System.out.println("nhap chuoi ky tu: ");
        chuoi =scanner.nextLine();
        System.out.println("nhap vao ky tu can dem: ");
        kt =scanner.next().charAt(0);
        for (int i = 1; i < chuoi.length(); i++)
        {
        if (kt == chuoi.charAt(i))
        {
            sl++;
        }
        }
        System.out.println("so lan xuat hien cua ky do la: " + sl);
    }
}