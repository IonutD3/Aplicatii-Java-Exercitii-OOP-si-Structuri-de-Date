import java.io.*;

public class CautSir {

    public static void main(String[] args) throws IOException {

        int[] sir;
        sir = new int[100];

        int nrElemente = 0;
        int j;
        int Nrcautare;

        sir[0] = 77;
        sir[1] = 99;
        sir[2] = 44;
        sir[3] = 55;
        sir[4] = 22;
        sir[5] = 88;
        sir[6] = 11;
        sir[7] = 00;
        sir[8] = 66;
        sir[9] = 33;

        nrElemente = 10;

        // Afisarea vectorului initial
        for (j = 0; j < nrElemente; j++)
            System.out.print(sir[j] + " ");

        System.out.println();

        // Cautarea lui 66
        Nrcautare = 66;

        for (j = 0; j < nrElemente; j++)
            if (sir[j] == Nrcautare)
                break;

        if (j == nrElemente)
            System.out.println("Nu am gasit niciun numar " + Nrcautare);
        else
            System.out.println("Am gasit numarul " + Nrcautare);

        // Cautarea lui 55
        Nrcautare = 55;

        for (j = 0; j < nrElemente; j++)
            if (sir[j] == Nrcautare)
                break;

        // Stergerea lui 55
        if (j < nrElemente) {

            for (int k = j; k < nrElemente - 1; k++)
                sir[k] = sir[k + 1];

            nrElemente--;
        }

        // Afisarea dupa stergere
        for (j = 0; j < nrElemente; j++)
            System.out.print(sir[j] + " ");

        System.out.println();
    }
}
