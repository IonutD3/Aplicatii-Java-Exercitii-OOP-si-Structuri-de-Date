class DeclarSir {

    private double[] a;
    private int size;

    public DeclarSir(int size) {

        a = new double[size];
        this.size = size;
    }

    public void setElem(int index, double value) {
        a[index] = value;
    }

    public double getElem(int index) {
        return a[index];
    }

    public int sterge(double element) {

        int i;

        for (i = 0; i < size; i++) {

            if (getElem(i) == element)
                break;
        }

        return i;
    }

    public void afisare(int nrelem) {

        System.out.println("Elementele vectorului:");

        for (int i = 0; i < nrelem; i++)
            System.out.print(getElem(i) + " ");
    }
}
