import java.util.Scanner;
    //Giải phương trình bậc nhất
    //1. a=0 b=0 phương trình vô số nghiệm
    //2. a=0 b khác 0 phương trình vô nghiệm
    //3. a khác 0 phương trình có nghiệm x= -b/a
public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        ptb1();
}
public static void ptb1()  
{
    float a, b;
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a: ");
    a =scanner.nextFloat();
    System.out.println("nhap b: ");
    b =scanner.nextFloat();
    giaiPTB1(a, b);
} 
public static void giaiPTB1(float a, float b)
    {
        if (a == 0)
        {
            if(b == 0)
            {
                System.out.println("phuong trinh co vo so nghiem");
            }else
            {
                System.out.println("phuong trinh vo nghiem");
            }
        }else
        {
            float x = -b / a;
            System.out.println("phuong trinh co nghiem =" + x);
        }
    }
}