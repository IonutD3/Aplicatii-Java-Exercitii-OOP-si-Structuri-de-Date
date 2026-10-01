public class OperatiiBanca {

    public static void main(String[] args) {

        ContBanca ba1 = new ContBanca(100.00);

        System.out.print("Inainte de tranzactie, ");
        ba1.afiseaza();

        ba1.depunere(74.35);
        ba1.retragere(20.00);

        System.out.print("Dupa tranzactie ");
        ba1.afiseaza();

        Client ba2 = new Client();

        ba2.afiseaza1();
        ba2.afiseaza2();
    }
}
