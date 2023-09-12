import java.util.Scanner;

public class LatihanInputanLingkaran {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double p = Math.PI;

            System.out.print("jari-jari : ");
            double t = sc.nextDouble();

            System.out.print("jari-jari : ");
            double z = sc.nextDouble();
            double v = p * t * z;
            System.out.println("Luas = " + v);
        }
    }
}
