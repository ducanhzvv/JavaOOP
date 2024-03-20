package Person;

import java.util.Scanner;

public class nhanvien extends person 
{
    String chucvu;
    int ID;
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma nhan vien: ");
        ID = scanner.nextInt();
        super.nhapthongtin();
        System.out.print("Chuc vu: ");
        chucvu = scanner.nextLine();
    }

}
