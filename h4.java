import java.util.Scanner;
public class h4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Sisesta suvaline teks: ");
        String suvalinetekst = scanner.nextLine();
        String j = suvalinetekst.toUpperCase();
        System.out.println(j);
        System.out.println("Sümbolite arv: "+suvalinetekst.length());
        String[] tykeldus = suvalinetekst.split(" ");
        System.out.println(tykeldus[0]);
    }
}