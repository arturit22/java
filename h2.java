public class h2 {

    public static void main(String[] args) {
        tollid(10); 
        ellips(5, 3); 
        minutidtundideks(120); 
        double kiirus1 = leiakiirus(100, 1.5); 
        double kiirus2 = leiakiirus(150, 2); 
        kiirustevahe(kiirus1, kiirus2);
    }

    public static void tollid(float tollid){
        float meetrid = tollid * 0.0254f;
        System.out.println(tollid + " tolli on " + meetrid + " meetrit");
    }

    public static void ellips(float s, float a){
        double pindala = Math.PI * a * s;
        System.out.printf("Ellipsi pindala on %.2f ruutmeetrit\n", pindala);
    }

    public static void minutidtundideks(int minutid) {
        int tunnid = minutid / 60;
        int jääkMinutid = minutid % 60;
        System.out.println(minutid + " minutit on " + tunnid + " tundi ja " + jääkMinutid + " minutit");
    }

    public static double leiakiirus(double distants, double aeg) {
        return distants / aeg;
    }

    public static void kiirustevahe(double kiirus1, double kiirus2) {
        double vahe = Math.abs(kiirus1 - kiirus2);
        System.out.println("Sportlaste kiiruste vahe on " + vahe + " km/h");
    }
}
