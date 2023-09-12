import java.util.Scanner;

public class Latihan24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia anak: ");
        int usia = scanner.nextInt();

        if (usia >= 4 && usia <= 6) {
            if (usia <= 5) {
                System.out.println("Anak diterima di TK Kelas A");
            } else {
                System.out.println("Anak diterima di TK Kelas B");
            }
        } else {
            System.out.println("Maaf hanya untuk anak usia 4 - 6 tahun");
        }

        scanner.close();
    }
}
