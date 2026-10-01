public class Zbornou {

    public static void main(String args[]) {

        System.out.println("EX1");

        ZborComercial Avion1 = new ZborComercial();

        Avion1.altitudine = 20500;
        Avion1.viteza = 5000;
        Avion1.NumarZbor = 101;
        Avion1.Nrpasageri = 120;

        ZborComercial Avion2 = new ZborComercial();

        Avion2.altitudine = 10500;
        Avion2.viteza = 3000;
        Avion2.NumarZbor = 100;
        Avion2.Nrpasageri = 100;

        Avion1.AfiseazaZbor();
        Avion2.AfiseazaZbor();

        System.out.println("EX2");

        ZborComercial Avion3 = new ZborComercial();

        Avion3.altitudine = 15000;
        Avion3.viteza = 8000;
        Avion3.NumarZbor = 103;
        Avion3.Nrpasageri = 150;
        Avion3.latitudine = 130;
        Avion3.longitudine = 200;

        Avion3.AfiseazaZbor();

        System.out.println("EX3");

        for (int i = 1; i < 100; i++) {

            Avion1.SetAzimut(67 + i);
            Avion1.AfiseazaZbor();

            Avion2.RotesteAvion(15 * i);
            Avion2.AfiseazaZbor();

            Avion3.RotesteAvion(15 * i);
            Avion3.AfiseazaZbor();
        }

        System.out.println("EX4");

        Avion3.SetAzimut(15);
        Avion3.Aterizare();
    }
}
