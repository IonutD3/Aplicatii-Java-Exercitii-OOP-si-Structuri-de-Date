import java.util.*;

class Client {

    Scanner s = new Scanner(System.in);

    public void afiseaza1() {

        System.out.println("Introdu numele ");
        String num = s.nextLine();

        System.out.println("Introdu genul ");
        String gen = s.next();

        System.out.println("Introdu varsta ");
        int var = s.nextInt();

        System.out.println("Nume: " + num);
        System.out.println("Gen: " + gen);
        System.out.println("Varsta: " + var);

        s.nextLine(); // consumam Enter-ul ramas
    }

    public void afiseaza2() {

        System.out.println("Introdu numele ");
        String num = s.nextLine();

        System.out.println("Introdu adresa ");
        String adr = s.nextLine();

        System.out.println("Introdu capital ");
        float cap = s.nextFloat();

        System.out.println("Nume: " + num);
        System.out.println("Adresa: " + adr);
        System.out.println("Capital: " + cap);
    }
}
