class Zbor {

    int altitudine;
    private int azimut;
    int viteza;
    float latitudine;
    float longitudine;

    void RotesteAvion(int unghi) {
        azimut = (azimut + unghi) % 360;

        if (azimut < 0)
            azimut = azimut + 360;
    }

    void SetAzimut(int unghi) {
        azimut = unghi % 360;

        if (azimut < 0)
            azimut = azimut + 360;
    }

    int GetAzimut() {
        return azimut;
    }

    void Aterizare() {
        for (azimut = 15; altitudine >= 0; altitudine -= 100) {

            viteza = viteza - 100;

            if (viteza < 0)
                viteza = 0;

            AfiseazaZbor();
        }
    }

    void AfiseazaZbor() {
        System.out.println(
            altitudine + " m " +
            azimut + " grade " +
            viteza + " km/ora"
        );
    }
}
