package zadatak2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("unesi ime prvog studenta");
        st1.ime=sc.next();
        System.out.println("unesi prezime prvog studenta");
        st1.prezime=sc.next();
        System.out.println("unesi ocenu prvog studenta");
        st1.ocena=sc.nextInt();


        ArrayList<Student>listaStudenata=new ArrayList<>();
        listaStudenata.add(st1);

        Student st2=new Student();
        System.out.println("unesi ime 2. studenta");
        st2.ime=sc.next();
        System.out.println("unesi prezime 2. studenta");
        st2.prezime=sc.next();
        System.out.println("unesi ocenu 2. studenta");
        st2.ocena=sc.nextInt();
        listaStudenata.add(st2);

        Student st3=new Student();
        System.out.println("unesi ime 3. studenta");
        st3.ime=sc.next();
        System.out.println("unesi prezime 3. studenta");
        st3.prezime=sc.next();
        System.out.println("unesi ocenu 3. studenta");
        st3.ocena=sc.nextInt();
        listaStudenata.add(st3);


        Student st4=new Student();
        System.out.println("unesi ime 4. studenta");
        st4.ime=sc.next();
        System.out.println("unesi prezime 4. studenta");
        st4.prezime=sc.next();
        System.out.println("unesi ocenu 4. studenta");
        st4.ocena=sc.nextInt();
        listaStudenata.add(st4);

        System.out.println(listaStudenata);


        ArrayList<Student>listaPolozeni=new ArrayList<>();


        for (Student ss:listaStudenata)
        {
            if (ss.ocena>5)
            {
                listaPolozeni.add(ss);
            }
           // else
            //{
              //  System.out.println("student nije polozio, zato ne ide u ovu listu!");
            //}
        }
        System.out.println(listaPolozeni);

    }
}
