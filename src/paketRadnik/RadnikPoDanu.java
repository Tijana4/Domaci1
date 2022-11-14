package paketRadnik;

public class RadnikPoDanu extends Radnik{
    int brojDana;

    public RadnikPoDanu()
    {

    }

    @Override
    void isplatiPlatu() {
        super.isplatiPlatu();
        System.out.println("plata od radnika po danu je " + (brojDana*1000));
    }

    @Override
    public String toString() {
        return "RadnikPoDanu{" +
                "brojDana=" + brojDana +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg=" + jmbg +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}
