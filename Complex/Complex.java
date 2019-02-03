public class Complex {

    // Dodawanie
    static double DodawanieRe(double RE, double re) {
        double c1;
        c1 = RE + re;
        return c1;
    }

    static double DodawanieIn(double IN, double in) {
        double c2;
        c2 = IN + in;
        return c2;
    }

    // Odejmowanie
    static double OdejmowanieRe(double RE, double re) {
        double c1;
        c1 = RE - re;
        return c1;
    }

    static double OdejmowanieIn(double IN, double in) {
        double c2;
        c2 = IN - in;
        return c2;
    }

    //Mnozenie
    static double MnozenieRe(double RE, double re, double IN, double in) {
        double Re;
        double Re1;
        double Re2;
        Re1 = RE * re;
        Re2 = IN * in;
        Re = Re1 - Re2;

        return Re;
    }


    static double MnozenieIn(double RE, double re, double IN, double in) {
        double Re;
        double Re1;
        double Re2;
        Re1 = IN * re;
        Re2 = RE * in;
        Re = Re1 + Re2;

        return Re;
    }

    //Dzielenie

    static double DzielenieLicznikaRe(double RE, double re, double IN, double in) {
        double Re;
        double Re1;
        double Re2;
        double Re3;
        Re3 = in*-1;
        Re1 = RE * re;
        Re2 = IN * Re3;
        Re = Re1 - Re2;

        return Re;
    }
    static double DzielenieLicznikIn(double RE, double re, double IN, double in) {
        double Re;
        double Re1;
        double Re2;
        double Re3;
        Re3 = in*-1;
        Re1 = IN * re;
        Re2 = RE * Re3;
        Re = Re1 + Re2;

        return Re;
    }


    static double DzielenieMianownika(double re, double in) {
        double Re;
        double Re1;
        double Re2;
        Re1 = re * re;
        Re2 = in * in * -1;
        Re = Re1 - Re2;
        return Re;
    }
}
