import java.util.Scanner;

public class trutron extends hintron 
{
    public float h;
    public trutron()
    {
        ten = "hinh tru tron";
    }
    public void nhapthongso()
    {
        Scanner scanner = new Scanner(System.in);
        super.nhapbk();
        System.out.print("nhap chieu cao: ");
        h = scanner.nextFloat();
    }
    public void tinhTT()
    {
        TT = DT * h;
    }
}
