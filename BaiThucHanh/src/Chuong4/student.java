package Chuong4;

import java.util.Scanner;

public class student {
    public String ID;
    public String Name;
  
    public void nhapthongtin()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma sinh vien: ");
        ID = scanner.nextLine();
        System.out.println("nhap ho ten sinh vien: ");
        Name = scanner.nextLine();
    }
    public void in()
        {   
            System.out.println("ho va ten: " + Name);
            System.out.println("ma sinh vien: " + ID);
        }
}
