public class FiboIteracyjny {
    public long FiboIte(long n) {
        int pierwszy = 1;
        int drugi = 1;
        int suma = 1;
        while (n>2) {
            suma=pierwszy+drugi;
            pierwszy=drugi;
            drugi=suma;

            n--;

        }
        return suma;

    }
}
