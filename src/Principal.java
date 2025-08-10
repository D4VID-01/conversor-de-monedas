import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaEquivalencia consulta = new ConsultaEquivalencia();

        String monenadaBase;
        String monenadaDestino;
        Divisa conversion;
        String cantidadConversion;

        while (true){

            consulta.mostrarMenu();

            var eleccionUsuario = Integer.valueOf(lectura.nextLine());

            if (eleccionUsuario == 1){
                monenadaBase = "USD";
                monenadaDestino = "MXN";
            } else if (eleccionUsuario == 2) {
                monenadaBase = "MXN";
                monenadaDestino = "USD";
            } else if (eleccionUsuario == 3) {
                monenadaBase = "USD";
                monenadaDestino = "EUR";
            } else if (eleccionUsuario == 4) {
                monenadaBase= "EUR";
                monenadaDestino = "USD";
            } else if (eleccionUsuario == 5) {
                monenadaBase= "USD";
                monenadaDestino = "COP";
            } else if (eleccionUsuario == 6) {
                monenadaBase= "COP";
                monenadaDestino = "USD";
            } else if (eleccionUsuario == 7){
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Intete de nuevo.");
                continue;
            }

            System.out.println("Ingrese el valor en " + monenadaBase +  " que desea convertir a " + monenadaDestino);
            cantidadConversion = lectura.nextLine();
            conversion = consulta.buscaConversion(monenadaBase, monenadaDestino);
            double conversionFinal = Integer.parseInt(cantidadConversion) * conversion.conversion_rate();
            System.out.println(conversion);
            System.out.println(">>>>>>>>>> El valor de " + cantidadConversion + " " + monenadaBase + " corresponde al valor de " +
                    conversionFinal + " " + monenadaDestino + " <<<<<<<<<<\n");
        }


    }
}
