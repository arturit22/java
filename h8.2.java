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
    public String saamark() {
        return mark;
    }

    public String saamudel() {
        return mudel;
    }

    public int saakiirus() {
        return kiirus;
    }

    //omaduste lisamine
    public void lisamark(String uusmark) {
        this.mark = uusmark;
    }

    public void lisamudel(String uusmudel) {
        this.mudel = uusmudel;
    }

    // Kiiruse suurendamine
    public void suurendakiirust(int suurendus) {
        this.kiirus += suurendus;
    }

    public static void main(String[] args) {
        //auto objektid
        Auto auto1 = new Auto("toyota", "camry");
        Auto auto2 = new Auto("ford", "mustang");

        //auto omadused
        System.out.println("auto 1 mark: " + auto1.saamark());
        System.out.println("auto 1 mudel: " + auto1.saamudel());
        System.out.println("auto 1 kiirus: " + auto1.saakiirus());

        System.out.println("auto 2 mark: " + auto2.saamark());
        System.out.println("auto 2 mudel: " + auto2.saamudel());
        System.out.println("auto 2 kiirus: " + auto2.saakiirus());

        //kiiruse suurendamine
        auto1.suurendakiirust(30);
        auto2.suurendakiirust(20);

        //uued kiirused
        System.out.println("Auto 1 uus kiirus: " + auto1.saakiirus());
        System.out.println("Auto 2 uus kiirus: " + auto2.saakiirus());
    }
}