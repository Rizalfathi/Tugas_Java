import java.util.Scanner;

public class LatihanPengkondisian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("abcd1234")) {
            System.out.println("Selamat datang admin");
        } else {
            System.out.println("Maaf anda tidak dikenali");
        }

        scanner.close();
    }
}
