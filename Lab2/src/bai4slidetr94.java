import java.util.Scanner;

public class bai4slidetr94 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("nhap so");
        n =scanner.nextInt();
        if (1 > n || n > 12) 
        {
            System.out.println("vui long nhap tu 1 den 12");
            n =scanner.nextInt();
        }
        switch(n)
        {
            case 1:System.out.println("thang 1");
                break;
            case 2:System.out.println("thang 2");
                break;
            case 3:System.out.println("thang 3");
                break;
            case 4:System.out.println("thang 4");
                break;
            case 5:System.out.println("thang 5");
                break;
            case 6:System.out.println("thang 6");
                break;
            case 7:System.out.println("thang 7");
                break;
            case 8:System.out.println("thang 8");
                break;
            case 9:System.out.println("thang 9");
                break;
            case 10:System.out.println("thang 10");
                break;
            case 11:System.out.println("thang 11");
                break;
            case 12:System.out.println("thang 12");
                break;
           
        }
    }
}
