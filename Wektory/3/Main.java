public class Main {

    public static void main(String[] args) {
        IloczynWektorowy Ilo = new IloczynWektorowy();
        // Wektor 1
        int a = 1;
        int b = 2;
        int c = 3;
        // Wektor 2
        int d = 4;
        int e = 5;
        int f = 6;
        System.out.println(Ilo.Iloczyn1(b,f,c,e)+" "+Ilo.Iloczyn2(c,d,a,f)+" "+Ilo.Iloczyn3(a,e,b,d));

    }
}
