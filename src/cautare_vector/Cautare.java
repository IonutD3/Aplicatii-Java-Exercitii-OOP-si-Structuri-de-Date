import java.util.*;

public class Cautare {

    public static void main(String[] args) {

        DeclarSir sir = new DeclarSir(100);

        int nrElemente = 0;
        int j;

        sir.setElem(0, 77);
        sir.setElem(1, 55);
        sir.setElem(2, 44);
        sir.setElem(3, 55);
        sir.setElem(4, 22);
        sir.setElem(5, 88);
        sir.setElem(6, 11);
        sir.setElem(7, 0);
        sir.setElem(8, 66);
        sir.setElem(9, 33);

        nrElemente = 10;

        // Afisare initiala
        for (j = 0; j < nrElemente; j++)
            System.out.print(sir.getElem(j) + " ");

        System.out.println();

        Scanner s = new Scanner(System.in);

        // Cautare
        System.out.print("Introdu numarul cautat: ");
        int cautNr = s.nextInt();

        for (j = 0; j < nrElemente; j++)
            if (sir.getElem(j) == cautNr)
                break;

        if (j == nrElemente)
            System.out.println("Nu am gasit numarul " + cautNr);
        else
            System.out.println("Am gasit numarul " + cautNr);

        // Stergere
        System.out.print("Introdu numarul care trebuie sters: ");
        int stergNr = s.nextInt();

        for (j = 0; j < nrElemente; j++)
            if (sir.getElem(j) == stergNr)
                break;

        if (j < nrElemente) {

            for (int k = j; k < nrElemente - 1; k++)
                sir.setElem(k, sir.getElem(k + 1));

            nrElemente--;

        } else {

            System.out.println("Nu am gasit numarul " + stergNr);
        }

        // Afisare dupa stergere
        System.out.println("Dupa stergere:");

        for (j = 0; j < nrElemente; j++)
            System.out.print(sir.getElem(j) + " ");

        System.out.println();

        // Stergerea lui 77
        double elem = 77.0;

        int poz = sir.sterge(elem);

        if (poz < nrElemente) {

            for (int k = poz; k < nrElemente - 1; k++)
                sir.setElem(k, sir.getElem(k + 1));

            nrElemente--;
        }

        sir.afisare(nrElemente);
    }
}
