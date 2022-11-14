package zadatak2;
/*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba
 uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */
public class Student {
    String ime;
    String prezime;
    int ocena;

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena=" + ocena +
                '}';
    }
}
