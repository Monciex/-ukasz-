public class Main {

    public static void main(String[] args) {
        //Czesc rzeczywista
        double RE =1;
        double re =2;
        //Czesc urojona
        double IN = 8;
        double in =3;

        System.out.println(+Complex.DodawanieRe(RE,re)+"  " + Complex.DodawanieIn(IN,in)+"i"); //Dodawanie
        System.out.println(+Complex.OdejmowanieRe(RE,re)+"  " + Complex.OdejmowanieIn(IN,in)+"i"); //Odejmowanie
        System.out.println(Complex.MnozenieRe(RE,re,IN,in)+ " " + Complex.MnozenieIn(RE,re,IN,in)+"i"); // Mnozenie
        System.out.println(Complex.DzielenieLicznikaRe(RE,re,IN,in)/Complex.DzielenieMianownika(re,in)+" "+ Complex.DzielenieLicznikIn(RE,re,IN,in)/Complex.DzielenieMianownika(re,in)+"i"); //Dzielenie

    }
