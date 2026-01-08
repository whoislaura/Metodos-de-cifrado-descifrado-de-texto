import java.util.Scanner;

public class Controlador {
    Scanner in = new Scanner(System.in);
    Configuracion config = new Configuracion();
    CifradoSustitucion sust = new CifradoSustitucion(config);
    CifradoVigenere vig = new CifradoVigenere(config);


}
