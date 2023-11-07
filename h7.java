//artur golubevs
import java.util.Scanner;
public class h7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("sisesta esimene arv: ");
                int num1 = scanner.nextInt();
                System.out.print("sisesta teine arv: ");
                int num2 = scanner.nextInt();
                int jag = jagamine(num1, num2);
                System.out.println(jag);
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("sisestada tohib ainult arvud");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("nulliga jagada ei saa");
            }
        }
        System.out.println("programmi lõpp");
    }
    static int jagamine(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("nulliga jagada ei saa");
        }
        return a / b;
    }
}
