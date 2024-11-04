import java.util.Scanner;
import java.util.List;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserInput() {
        scanner.nextLine();
        System.out.print("Enter user name: ");
        return scanner.nextLine();
    }

    public void showUserAdded() {
        System.out.println("User added!");
    }

    public void displayUsers(List<UserModel> users) {
        System.out.println("User List:");
        for (UserModel user : users) {
            System.out.println("- " + user.getName());
        }
    }

    public void showExitMessage() {
        System.out.println("Exiting...");
    }

    public void showInvalidOptionMessage() {
        System.out.println("Invalid option. Please try again.");
    }

    public void closeScanner() {
        scanner.close();
    }
}
