import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayUpdatedData(String data) {
        System.out.println("Data updated to: " + data);
    }

    public void displayFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
