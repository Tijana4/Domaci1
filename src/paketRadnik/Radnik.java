package paketRadnik;
//Napraviti apstraktnu klasu Radnik
//Napraviti Main klasu za ispis
//Sub klase: radnik po satu, radnik po danu, radnik fiksno
//polja: ime, prezime, jmbg, ziro racun, plata
//napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
//u Main klasi podatke za svaki objekat puniti preko Scanner klase

public abstract class Radnik {
   protected String ime;
    protected String prezime;
    protected int jmbg;
    protected String ziroRacun;
    protected double plata;



    void isplatiPlatu()
    {
        System.out.println("ispis radnika i plate");
    }
}
