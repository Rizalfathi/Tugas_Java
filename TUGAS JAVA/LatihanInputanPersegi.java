import java.util.Scanner;

public class LatihanInputanPersegi {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Panjang : ");
            int s = sc.nextInt();

            System.out.print("Lebar : ");
            int t = sc.nextInt();
            int v = s * t;
            System.out.println("Luas = " + v);
        }
    }
}
