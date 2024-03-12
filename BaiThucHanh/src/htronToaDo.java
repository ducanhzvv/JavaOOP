import java.util.Scanner;

public class htronToaDo {
    float r, x, y;
    Scanner scanner = new Scanner(System.in);
    void nhapbk()
    {
        System.out.println("nhap r: ");
        r = scanner.nextFloat();
    }
    void nhapbk(int r)
    {
        System.out.println("nhap r: ");
        r = scanner.nextInt();
    }
    void nhaptoado()
    {
        System.out.println("nhap x: ");
        x = scanner.nextFloat();
        System.out.println("nhap y: ");
        y = scanner.nextFloat();
    }
    void inbk()
    {
        System.out.println("ban kinh hinh tron la: " + r);
    }
    void intoado()
    {
        System.out.println("toa do ban kinh hinh tron la: " + "(" + x + ", " + y + ")");
    }
}