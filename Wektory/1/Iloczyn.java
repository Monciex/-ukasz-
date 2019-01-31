public class Iloczyn {

    static int iloczynSkalarny(int wektor1[], int wektor2[]) {
        int wynik = 0;
        for (int i = 0; i < 2; i++) {
            wynik += wektor1[i] * wektor2[i];

        }
        return wynik;
    }
}
