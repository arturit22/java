//artur golubevs
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class h6 {
    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sisesta arv: "); 
            String sisend = scanner.nextLine();
            if (sisend.isEmpty()) {
                break;
            }
        int summa = arvudesumma(arvud);
        double keskmine = arvudekeskmine(arvud);
        salvestaandmedfaili(arvud, summa, keskmine); 
        }
    }

    public static int arvudesumma(ArrayList<Integer> arvud) {
        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }
        return summa;
    }

    public static double arvudekeskmine(ArrayList<Integer> arvud) {
        if (arvud.isEmpty()) {
            return 0.0;
        }
        int summa = arvudesumma(arvud);
        return (double) summa / arvud.size();
    }

    public static void salvestaandmedfaili(ArrayList<Integer> arvud, int summa, double keskmine) {
        try (PrintWriter writer = new PrintWriter("andmed.txt")) { 
            writer.println("Sisestatud arvud: ");
            for (int arv : arvud) {
                writer.println(arv);
            }
            writer.println("Summa: " + summa);
            writer.println("Keskmine: " + keskmine);
            System.out.println("Andmed on salvestatud faili 'andmed.txt'.");
        } catch (FileNotFoundException e) {
            System.out.println("Viga faili salvestamisel: " + e.getMessage());
        }
    }
}