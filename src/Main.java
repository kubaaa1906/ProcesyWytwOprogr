import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz login: ");
        String login = scanner.nextLine();

        System.out.println("Wprowadz haslo: ");
        String haslo = scanner.nextLine();

        System.out.println("Twoj login: $" + login);
        System.out.println("Twoje haslo: $" + haslo);

        System.out.println("FIXED!!!!");
        System.out.println("testesttestest");

        Login login1 = new Login(login, haslo);
        System.out.println(login1);
    }
}