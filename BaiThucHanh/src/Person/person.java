package Person;

import java.util.Scanner;

public class person 
{
    public String hoten;
    public int tuoi;
    public String gioitinh;
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ho va ten: ");
        hoten = scanner.nextLine();
        System.out.print("nhap gioi tinh: ");
        gioitinh = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        tuoi = scanner.nextInt();
    }
    public void in()
    {
        System.out.println("hoa va ten: " + hoten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi tinh: " + gioitinh);
    }
    public void inthongtin(String name, String gioitinh, int age)
    {
        System.out.println("hoa va ten: " + name);
        System.out.println("tuoi: " + age);
        System.out.println("gioi tinh: " + gioitinh);
    }
}
