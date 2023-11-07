import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            i++;
            System.out.print("Sisesta esimene number: ");
            int num1 = scanner.nextInt();
            if (num1 >= 0) {
                System.out.println("Esimene arv sobib!");
                System.out.print("Sisesta teine number: ");
                int num2 = scanner.nextInt();
                if (num2 >= 1) {
                    System.out.println("Teine arv sobib!");
                    int s = jagamine(num1, num2);
                    System.out.println("Vastus on: " + s);
                } else {
                    if (num2 == 0) {
                        System.out.println("Teine arv on null, aga null ei sobi");
                    } else {
                        System.out.println("Teine arv on väiksem kui null");
                    }
                }
            } else {
                System.out.println("Esimene arv on väiksem kui null");
            }
        }
    }

    static int jagamine(int a, int b) {
        int jag = a / b;
        return jag;
    }
}
