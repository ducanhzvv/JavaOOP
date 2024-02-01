import java.util.Scanner;
public class baisile90 {
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    String chuoi;
    char kytu;
    System.out.println("nhap chuoi ca ky tu: ");
    chuoi =scanner.nextLine();
    System.out.println("cac ky tu co trong chuoi la: ");
    for (int i = 0; i < chuoi.length(); i++)
    {
        kytu = chuoi.charAt(i);
        System.out.println(kytu);
    }
    }

}
