import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        System.out.println("Bienvenido al conversor de monedas");

        int opcion = 0;
        while (opcion != 7 ){

        String Menu = """
                Digite el numero segun la conversion que desea realizar
                
                1 - Colones CR a Dolares
                2 - Dolares US a Colones CR
                3 - Colones CR a Pesos COP
                4 - Pesos COP a Colones CR
                5 - Colones CR a Pesos MEX
                6 - Pesos MEX a Colones CR
                7 - Salir
                """;

            System.out.println(Menu);
            opcion = sn.nextInt();

            switch (opcion){
                case 1 :
                    ConvertirMoneda.convertir("CRC", "USD", consulta,sn);
                    break;
                case 2 :
                    ConvertirMoneda.convertir("USD", "CRC", consulta,sn);
                    break;
                case 3 :
                    ConvertirMoneda.convertir("CRC", "COP", consulta,sn);
                    break;
                case 4 :
                    ConvertirMoneda.convertir("COP", "CRC",consulta,sn);
                    break;
                case 5 :
                    ConvertirMoneda.convertir("CRC", "MXN", consulta,sn);
                    break;
                case 6 :
                    ConvertirMoneda.convertir("MXN", "CRC", consulta,sn);
                case 7 :
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}