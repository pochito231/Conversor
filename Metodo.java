import java.util.Scanner;
import java.util.List;

public class Metodo {
   // private final List<Registro> historial = new ArrayList<>();

    public void convertir(String envio, String llega, Scanner sc, Consulta consulta){
            System.out.println("Cuantos deseas convertir");
            double monto = sc.nextDouble();

            Coin mon = consulta.moneda(envio, llega);

           // System.out.println("El cambio es de " + monto + mon.base_code() + " a "+ mon.conversion_rate()*monto + mon.target_code());
            //Registro regis = new Registro.
          //  historial.add()
        }
}
///falto terminar