import java.util.Scanner;

public class baislide79chuong3 
{   Scanner scanner = new Scanner(System.in);
    public int a;
    public int b;
    public int c;
    public int d;
    public int nhap()
    {   while (true)
        {
        System.out.print("ban la nhan vien loai: ");
        a = scanner.nextInt();
        if(a == 1 || a == 2)
        {
            return a;
        }
        else
        {
            System.out.println( " vui long nhap 1 hoac 2");
        }
        }
    }
    public void tinhluong()
    {
        if (a == 1) 
        {   
            System.out.print("nhan so gio lam them : ");
            b = scanner.nextInt();
            d = 10000000 + 100000 * b;
        }
        else 
        {   
            System.out.print("so ngay lam them : ");
            c = scanner.nextInt();
            d = 20000000 + 800000 * c;
        }
    }
    public void in()
    {
        if (a == 1) 
        {
            System.out.println("ban la nhan vien thoi vu");
            System.out.println("luong thang nay cua ban la: " + d + " vnd");
        }
        else
        {
            System.out.println("ban la nhan vien toan thoi gian");
            System.out.println("luong thang nay cua ban la: " + d + " vnd");
        }
    }
}
