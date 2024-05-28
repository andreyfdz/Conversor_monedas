import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir (String monedaBase , String monedaTarget, ConsultarMoneda consulta, Scanner sn){
        double cantidad;
        double cantidadConvertida;
        DecimalFormat df = new DecimalFormat("###.00");


        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1"+monedaBase+"="+ monedas.conversion_rate()+ " "+ monedaTarget);

        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = sn.nextDouble();

        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad +" "+ monedaBase + " = " + df.format(cantidadConvertida)+ " " + monedas.target_code());
    }
}
