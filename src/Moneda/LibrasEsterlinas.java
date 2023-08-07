package Moneda;

import Conversion.Conversor;

public class LibrasEsterlinas extends Conversor {

    final private double LIBRASESTERLINAS = 0.785; // Declaramos el valor de las libras esterlinas actualmente 08/2023
    
    /**
     * @param dinero es una variable de tipo String
     * @return el valor de la operacion convertido a una variable de tipo String
     * El parametro dinero es convertido a double, se le multiplica el valor de la moneda, ademas de el valor 100.0
     * se ingresan al metodo Math.round para redondearlo y luego el numero es dividido entre 100.0 para que nos de
     * 3 cifras significativas.
     */
    @Override
    public String convertirDinero(String dinero){
        double libras = Math.round(Double.parseDouble(dinero) * LIBRASESTERLINAS *100.0)/100.0;
        return String.valueOf(libras);
    }
}
