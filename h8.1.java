//artur golubevs
import java.util.Scanner;

public class h8.1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //kujundi valimine
        System.out.println("vali kujund: kuup, silinder, koonus");
        String kujund = scanner.nextLine();
        //sõltuvalt kujundist arvutab pindala
        double ruumala = 0.0;
        switch (kujund) {
            case "kuup":
                double kyljepikkus = kys("sisesta küljepikkus: ");
                ruumala = kuup(kyljepikkus);
                break;
            case "silinder":
                double raadius = kys("sisesta silindri raadius: ");
                double korgus = kys("sisesta silindri kõrgus: ");
                ruumala = silinder(raadius, korgus);
                break;
            case "koonus":
                double koonuseRaadius = kys("sisesta raadius: ");
                double koonuseKorgus = kys("Sisesta kõrgus: ");
                ruumala = koonus(koonuseRaadius, koonuseKorgus);
                break;
            default:
                System.out.println("vale sisestus, proovi uuesti");
                break;
        }
        if (ruumala > 0) {
            System.out.println("Kujundi ruumala on: " + ruumala);
        }
    }
    //kuubi alamprogramm
    public static double kuup(double kyljepikkus) {
        return kyljepikkus * kyljepikkus * kyljepikkus;
    }
    //silindri alamprogramm
    public static double silinder(double raadius, double korgus) {
        return Math.PI * raadius * raadius * korgus;
    }
    //ruumala alamprogramm
    public static double koonus(double raadius, double korgus) {
        return (1.0 / 3.0) * Math.PI * raadius * raadius * korgus;
    }
    //küsib mõõtmeid
    public static double kys(String kysimus) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(kysimus);
        return scanner.nextDouble();
    }
}
