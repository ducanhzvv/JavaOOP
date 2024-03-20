import java.util.Scanner;

public class hintron extends hinhhoc 
{
    float r;
    public hintron()
    {
        ten = "hinh tron";
    }
    void nhapbk()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = scanner.nextFloat();
    }
    //tao class person, nv ke thua tu person, nv lam vc full time va k full time
    void tinhCV()
    {
        CV = 2 * pi * r;
    }
    void tinhDT()
    {
        DT = pi * r * r;
    }
}
