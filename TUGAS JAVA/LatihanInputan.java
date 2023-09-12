import java.util.Scanner;

public class LatihanInputan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukan nama anda : ");
            String nama = sc.next();
            System.out.println("Hallo " + nama);
        }
    }
}