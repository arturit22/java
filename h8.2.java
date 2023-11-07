//artur golubevs
public class Auto {
    //omadused
    public String mark;
    public String mudel;
    public int kiirus;

    //konstruktor
    public Auto(String mark, String mudel) {
        this.mark = mark;
        this.mudel = mudel;
        this.kiirus = 0; 
    }

    //omaduste küsimine
    public String saaMark() {
        return mark;
    }

    public String saaMudel() {
        return mudel;
    }

    public int saaKiirus() {
        return kiirus;
    }

    //omaduste lisamine
    public void lisaMark(String uusMark) {
        this.mark = uusMark;
    }

    public void lisaMudel(String uusMudel) {
        this.mudel = uusMudel;
    }

    // Kiiruse suurendamine
    public void suurendaKiirust(int suurendus) {
        this.kiirus += suurendus;
    }

    public static void main(String[] args) {
        //auto objektid
        Auto auto1 = new Auto("Toyota", "Camry");
        Auto auto2 = new Auto("Ford", "Mustang");

        //auto omadused
        System.out.println("Auto 1 mark: " + auto1.saaMark());
        System.out.println("Auto 1 mudel: " + auto1.saaMudel());
        System.out.println("Auto 1 kiirus: " + auto1.saaKiirus());

        System.out.println("Auto 2 mark: " + auto2.saaMark());
        System.out.println("Auto 2 mudel: " + auto2.saaMudel());
        System.out.println("Auto 2 kiirus: " + auto2.saaKiirus());

        //kiiruse suurendamine
        auto1.suurendaKiirust(30);
        auto2.suurendaKiirust(20);

        //uued kiirused
        System.out.println("Auto 1 uus kiirus: " + auto1.saaKiirus());
        System.out.println("Auto 2 uus kiirus: " + auto2.saaKiirus());
    }
}
