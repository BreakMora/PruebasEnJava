package Moneda;
import Conversion.Conversor;

public class Yen extends Conversor {

    final private double  YEN = 142.231; // Declaramos el valor del euro actualmente 08/2023

    /**
     * @param dinero es una variable de tipo String
     * @return el valor de la operacion convertido a una variable de tipo String
     * El parametro dinero es convertido a double, se le multiplica el valor de la moneda, ademas de el valor 100.0
     * se ingresan al metodo Math.round para redondearlo y luego el numero es dividido entre 100.0 para que nos de
     * 3 cifras significativas.
     */
    @Override
    public String convertir_Mi_Moneda(String dinero){
        double yenes = Math.round(Double.parseDouble(dinero) * YEN * 100.0)/100.0;
        return String.valueOf(yenes);
    }

    @Override
    public String convertir_A_Mi_Moneda(String dinero) {
        double dolar = Math.round(Double.parseDouble(dinero) / YEN * 100.0)/100.0;
        return String.valueOf(dolar);
    }
}
