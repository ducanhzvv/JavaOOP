import java.util.Scanner;

public class Person 
{
    public String name;
    public int tuoi;
    Scanner scanner = new Scanner(System.in);
    public void nhap()
    {
        System.out.println("nhap ho va ten: ");
        name = scanner.nextLine();
        System.out.println("nhap ma tuoi: ");
        tuoi = scanner.nextInt();
    }
    public void inthongtin()
    {
        System.out.println("ho va ten: " + name);
        System.out.println("tuoi cua ban: " + tuoi);
    }
}
