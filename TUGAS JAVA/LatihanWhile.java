import java.util.Scanner;

public class LatihanWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            while (a > 10) {
                System.out.println("Muncul dari while");
            }
            do {
                System.out.println("Muncul dari do while");
            } while (a > 10);
        }
    }
}