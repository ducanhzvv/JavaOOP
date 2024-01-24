import java.util.Scanner;

public class Baislide55 {
    public static void main(String[] args) {

          System.out.println("Cac so chia het cho 5 trong khoang tu 0 den 20 la: ");
        for (int n = 0; n <= 20; n++) 
        {
        if (n % 5 != 0) 
        {
        continue;
        }
            System.out.println(n);
        }
    }
}
