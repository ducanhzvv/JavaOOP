import java.util.Scanner;

public class Baislide35 {
    public static void main(String[] args) {
        sosanh();
    }
    public static void sosanh()
    {
        Scanner scanner = new Scanner(System.in);
        Float a, b;
        System.out.println("nhap so thu nhat: ");
        a =scanner.nextFloat();
        System.out.println("nhap so thu 2: ");
        b =scanner.nextFloat();
        ssvahienthi(a , b);
    }
    public static void ssvahienthi(float a, float b)
    {
        if(a > b)
        {
            System.out.println("so thu nhat lon hon so thu 2");
            System.out.println("so be hon la: " + b );
        }else
        {
            System.out.println("so thu nhat be hon so thu 2");
            System.out.println("so be hon la: " + a );
        }
    }
}