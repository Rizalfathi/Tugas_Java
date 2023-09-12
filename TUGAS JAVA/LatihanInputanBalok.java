import java.util.Scanner;

public class LatihanInputanBalok {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" Panjang : ");
            int s = sc.nextInt();

            System.out.print("Lebar : ");
            int t = sc.nextInt();

            System.out.print("tinggi : ");
            int z = sc.nextInt();
            int v = s * t * z;
            System.out.println("Luas = " + v);
        }
    }
}
