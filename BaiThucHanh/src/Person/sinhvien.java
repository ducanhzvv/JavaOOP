package Person;

import java.util.Scanner;

public class sinhvien {
    public String hoten;
    public String MSV;
    public float diemkyI;
    public float diemkyII;

    public void nhapThongTin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien : ");
        System.out.print("Ho va ten : ");
        hoten = scanner.nextLine();
        System.out.print("Ma sinh vien : ");
        MSV = scanner.nextLine();
        System.out.print("Diem hoc ky I : ");
        diemkyI = scanner.nextFloat();
        System.out.print("Diem hoc ky II : ");
        diemkyII = scanner.nextFloat();
    }

    public float diemTB() 
    {
        return (diemkyI + diemkyII ) / 2;
    }

    public void inThongTin() 
    {
        System.out.println("Thong tin sinh vien :");
        System.out.println("Ho va ten:" + hoten);
        System.out.println("Ma sinh vien : " + MSV);
        System.out.println("Diem trung binh hoc ky:" + diemTB());
    }

    public void ketQua() 
    {
        if (diemTB() >= 8)
        {
            System.out.println("Dat loai gioi.");
        }
        else if (diemTB() >= 6.5)
            {
                System.out.println("Dat loai kha.");
            }
        else if (diemTB() >= 5)
            {
                System.out.println("Dat loai trung binh.");
            }
        else
            {
                System.out.println("Dat loai yeu.");
            }
    }
}
