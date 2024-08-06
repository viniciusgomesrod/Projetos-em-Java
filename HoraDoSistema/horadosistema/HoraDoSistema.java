package horadosistema;

import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());

        Locale Idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(Idioma);
    }
}
