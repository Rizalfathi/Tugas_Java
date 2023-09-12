import java.util.Scanner;

public class PengulanganNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        String nama = "Rizal Fathi Nurfalah Ramdhani";
        for (int i = 0; i < n; i++) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
