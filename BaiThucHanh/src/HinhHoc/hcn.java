import java.util.Scanner;
public class hcn extends hinhhoc 
{
    float a, b;
    public hcn ()
    {
        ten = "hinh chu nhat";
    }
    public void nhapsodo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        a = scanner.nextFloat();
        System.out.println("nhap chieu rong: ");
        b = scanner.nextFloat();
    }
    public void tinhCV()
    {
        CV = 2 * (a + b);
    }
    public void tinhDT()
    {
        DT = a * b;
    }
}
