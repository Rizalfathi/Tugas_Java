import java.util.Scanner;

public class LatihanSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        double suhu = scanner.nextDouble();

        if (suhu < 0) {
            System.out.println("Wujud es");
        } else if (suhu > 0 && suhu <= 100) {
            System.out.println("Wujud cair");
        } else if (suhu > 100) {
            System.out.println("Wujud uap");
        }

        scanner.close();
    }
}
