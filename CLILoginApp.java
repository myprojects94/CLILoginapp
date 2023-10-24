import java.util.Scanner;

public class CLILoginApp {
    public static void main(String[] args) {
        UserDatabase userDB = new UserDatabase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the CLI Login App");

        while (true) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (userDB.isValidUser(username, password)) {
                System.out.println("Login successful. Welcome, " + username + "!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
            }
        }

        scanner.close();
    }
}
