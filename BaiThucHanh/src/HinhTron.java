import java.util.Scanner;

public class HinhTron {
    public float r;
    public float dt;
    public float cv;
    public final float pi = 3.14f;

    public void nhapbk()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("R = ");
        r = scanner.nextFloat();
    }
    public void tinhcv()
    {
        cv = 2 * pi * r;
    }
    public void incv()
    {
        System.out.println("Chu Vi = " + cv);
    }
    public void tinhdt()
    {
        dt = pi * r * r;
    }
    public void indt()
    {
        System.out.println("Dien Tich = " + dt);
    }
}