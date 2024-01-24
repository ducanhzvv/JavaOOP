import java.util.Scanner;

public class Baislide40 {

    public static void main(String[] args) {
        date();
    }
    public static void date()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap so ngay: ");
        n =scanner.nextInt();
        switch (n) 
        {
            case 1:System.out.println("ngay thu hai");
                break;
            case 2:System.out.println("ngay thu ba");
                break;
            case 3:System.out.println("ngay thu tu");
                break;
            case 4:System.out.println("ngay thu nam");
                break;
            case 5:System.out.println("ngay thu sau");
                break;
            case 6:System.out.println("ngay thu bay");
                break;
            case 7:System.out.println("ngay chu nhat");
                break;
            default:System.out.println("nhap sai moi nhap lai, vui long nhap tu 1 den 7");
                break;
        }
    }
}