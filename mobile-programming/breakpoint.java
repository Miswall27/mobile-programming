import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class breakpoint {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b:");
        b = scanner.nextInt();

        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
    }
}