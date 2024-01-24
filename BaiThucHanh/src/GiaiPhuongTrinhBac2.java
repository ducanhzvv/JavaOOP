import java.util.Scanner;
// a =0 thi gptb1
// a khac 0 
// tinh delta
// delta < 0 vo ngiem
// delta = 0 nghiem kep x=-b/(2*a)
// delta > 0 2 nghiem phan biet 
public class GiaiPhuongTrinhBac2{
    public static void main(String[] args) {
        ptb2();
    }
    public static void ptb2()
    {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = scanner.nextFloat();
        System.out.print("nhap b: ");
        b = scanner.nextFloat();
        System.out.print("nhap c: ");
        c = scanner.nextFloat();
        giaiptb2(a, b, c);
    }
    public static void giaiptb2(float a, float b, float c)
    {
        if (a == 0)
        {
            if (b == 0)
        {
            if(c == 0)
            {
                System.out.println("phuong trinh co vo so nghiem");
            }else
            {
                System.out.println("phuong trinh vo nghiem");
            }
        }else
        {
            float x = -c / b;
            System.out.println("phuong trinh co nghiem =" + x);
        }
        }else
        {
            float delta = (b * b) - (4*a*c);
            float x1, x2;
            if ( delta > 0)
            {
                x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("phuong trinh co 2 ngiem: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }else if(delta == 0)
            {
                x1 = (-b / (2 * a ));
                System.out.println("phuong trinh co nghiem kep : x = " + x1);
            }else
            {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}