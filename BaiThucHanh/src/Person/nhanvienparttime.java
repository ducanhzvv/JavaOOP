package Person;

import java.util.Scanner;

public class nhanvienparttime extends nhanvien
{
    public int luong;
    public int sogio;
    public int songay;
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("so gio lam trong ngay: ");
        sogio = scanner.nextInt();
        System.out.print("so ngay di lam: ");
        songay = scanner.nextInt();
    }
    public void luong()
    {
        luong = sogio * songay;
    }
    public void in()
    {
        super.in();
        System.out.println("tien luong: " + luong );
    }
}
