package paketRadnik;

public class RadnikPoSatu extends Radnik{
int brojSati;
    void isplatiPlatu() {
        super.isplatiPlatu();
        System.out.println("plata od radnika po satu je " + (brojSati*150));
    }
}
