import java.util.Scanner;

public class bai9slidetr96 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kytu;
        int chuthuong = 0, chuhoa = 0, chuso = 0;

        System.out.println("nhap chuoi ky tu: ");
        chuoi = scanner.nextLine();
        
        System.out.println("cac ky chu thuong co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) 
        {
            kytu = chuoi.charAt(i);

            if (Character.isLowerCase(kytu)) 
            {  
                System.out.print(kytu + " ");
                chuthuong++;
            }
        }
        System.out.println("\nso ky tu thuong trong chuoi la: " + chuthuong);

        System.out.println("cac ky chu hoa co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) 
        {
            kytu = chuoi.charAt(i);

            if (Character.isUpperCase(kytu)) 
            {  
                System.out.print(kytu + " ");
                chuhoa++;
            }
        }
        System.out.println("\nso ky tu thuong trong chuoi la: " + chuhoa);

        System.out.println("cac ky tu chu so la: ");
        for (int i = 0; i < chuoi.length(); i++)
        {
            kytu = chuoi.charAt(i);
            if (Character.isDigit(kytu))
            {
                System.out.print(kytu + " ");
                chuso++;
            }
        }
        System.out.println("\nso ky tu cho so la: " + chuso);
    }
}
