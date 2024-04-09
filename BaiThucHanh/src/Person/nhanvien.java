package Person;

import java.util.Scanner;

public class nhanvien extends person 
{   
    int ID;
    String chucvu;
    public void nhap()
    {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chuc vu hien tai: ");
        chucvu = scanner.nextLine();
        System.out.print("nhap ma nhan vien: ");
        ID = scanner.nextInt();
        super.nhap();
    }
    public void in()
    {   System.out.println("thong tin cua ban: ");
        System.out.println("ma nhan vien cua ban: " + ID);
        super.in();
        System.out.println("chuc vu hien tai: " + chucvu);
    }
}
