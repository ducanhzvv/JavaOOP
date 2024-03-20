import java.util.Scanner;

public class hinhvuong extends hcn 
{
    public hinhvuong()
    {
        ten = "Hinh Vuong";
    }
    public void nhapcanh()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh : ");
        a = b = scanner.nextFloat();
    }
}
