package Person;

import java.util.Scanner;

public class nhanvienfulltime extends nhanvien 
{
    public int luong;
    public int sogiotangca;
    public int tienthuongtangca;
    public int songay;
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("so ngay di lam: ");
        songay = scanner.nextInt();
        System.out.print("so gio lam tang ca: ");
        sogiotangca = scanner.nextInt();
        System.out.print("tien luong tang ca trong 1h: ");
        tienthuongtangca = scanner.nextInt();
    }
    public void luong()
    {
        luong = 30 * songay + sogiotangca * tienthuongtangca;
    }
    public void in()
    {
        super.in();
        System.out.println("tien luong: " + luong );
    }
}
