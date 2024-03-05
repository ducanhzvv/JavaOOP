import java.util.Scanner;

public class nhanvien 
{
    public String hoten;
    public String chucvu;
    public double LuongTheoNgay;
    public int ngaycong;
    public int tuoi;
    public double Luong;
    public void nhapthongtinNV()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        hoten = scanner.nextLine();
        System.out.print("Nhap chuc vu cua ban : ");
        chucvu = scanner.nextLine();
        System.out.print("Nhap nam sinh cua ban : ");
        tuoi =scanner.nextInt();
        System.out.print("Nhap tien cong tren ngay : ");
        LuongTheoNgay = scanner.nextDouble();
        System.out.print("Nhap so ngay cong cua ban : ");
        ngaycong = scanner.nextInt();
    }
    public double tinhLuongNV()
    {
        Luong = LuongTheoNgay*ngaycong;
        return Luong;
    }
    public int tinhtuoiNV()
    {
        tuoi = 2024 - tuoi;
        return tuoi;
    }
    public void inthongtinNV()
    {
        System.out.println("Ho va ten : "+hoten);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Chuc vu : "+chucvu);
        System.out.println("Luong : "+Luong);
    }

}