import java.util.Scanner;

public class LatihanBanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        if (nilai > 70) {
            System.out.println("Nilai lebih besar dari 70");
        } else if (nilai == 70) {
            System.out.println("Nilai sama dengan 70");
        } else {
            System.out.println("Nilai kurang dari 70");
        }

        sc.close();
    }
}