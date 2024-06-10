import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consulta consulta = new Consulta();
        int numero = 0;
        String envio="HNL", llega;
        Metodo met = new Metodo();
        while(numero!=9){
            System.out.println("""
                    ************************
                        Conversor de monedas 
                    Escoge una opcion
                    
                    1.Convertir HNL a EUR
                    
                    2.Convertir HNL a USD
                    
                    3.Convertir HNL a VES
                    
                    4.Convertir HNL a BRL 
                    
                    5.Convertir HNL a ARS
                    
                    6.Convertir HNL a COP
                    
                    7.Convertir HNL a MXN
                    
                    8.Convertir a cualquier moneda
                    
                    9.SALIR
                    
                    ************************""");
            numero = sc.nextInt();
            sc.nextLine();

            switch (numero){


                case 1:
                    llega = "EUR";
                    met.convertir(envio,llega,sc,consulta);
                    espera();
                    break;
                    case 2:
                        llega = "USD";
                        met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                    case 3:
                        llega = "VES";
                        met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                    case 4:
                        llega = "BRL";
                        met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                    case 5:
                        llega = "ARS";
                        met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                    case 6:
                        llega = "COP";
                        met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                    case 7:
                        llega = "MXN";met.convertir(envio,llega,sc,consulta);
                        espera();
                    break;
                case 8:
                    System.out.println("Nota en esta opcion tienes que saber la nomenclatura de las monedas Si no te la sabes te invito que las busques ya que el programa solo acepta la nomenclatura ejemplo\n" +
                            "lempiras= HNL, dolares = USD A continuacion ingresa el codigo de moneda al que quieres convertir");
                    llega = sc.nextLine();

                    met.convertir(envio,llega,sc,consulta);
                    espera();
                    
                    break;
                case 9:
                    System.out.close();
                    break;
                    default:
                        System.out.println("Digita una opcion valida");
                    break;
            }

        }


    }
    public static void espera(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Interrumpido");
        }
        System.out.println(" ");
    }
}


