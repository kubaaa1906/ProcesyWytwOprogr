import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Rejestracja");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź swój adres e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Wprowadź swoje hasło: ");
        String haslo = scanner.nextLine();

        System.out.println("Wprowadzony e-mail: " + email);
        System.out.println("Wprowadzone hasło: " + haslo);

        scanner.close();
    }
}