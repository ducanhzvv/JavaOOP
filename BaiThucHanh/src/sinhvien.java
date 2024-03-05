import java.util.Scanner;

public class sinhvien {
    public String HoTen;
    public String MaSinhVien;
    public String khoa;
    public String gioitinh;
    public int namsinh;
    public int tuoi;

    public void nhapthongtinSV()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten sinh vien: ");
        HoTen = scanner.nextLine();
        System.out.println("Ma sinh vien: ");
        MaSinhVien = scanner.nextLine();
        System.out.println("Khoa: ");
        khoa = scanner.nextLine();
        System.out.println("Gioi tinh: ");
        gioitinh = scanner.nextLine();
        System.out.println("nam sinh: ");
        namsinh = scanner.nextInt();
    }

    public int tinhtuoiSV()
    {
        tuoi = 2024 - namsinh;
        return tuoi;
    }
    public void inthongtinSV()
    {
        System.out.println("Ho ten sinh vien: " + HoTen);
        System.out.println("Ma sinh vien: " + MaSinhVien);
        System.out.println("Khoa: " + khoa);
        System.out.println("Gioi tinh cua sinh vien: " + gioitinh);
        System.out.println("nam Sinh: " + namsinh);
        System.out.println("Tuoi: " + tuoi);
    }
}