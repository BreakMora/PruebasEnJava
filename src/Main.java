import javax.swing.JOptionPane;
import Conversion.Conversor;
import Moneda.*;

public class Main {
    static Conversor convertir;

    public static void main(String[] args) {
        String dinero = null;

        String[] conversiones = {
                "- Selección -",
                "Convertir de Dólar a Euros.",
                "Convertir de Dólar a Libras Esterlinas.",
                "Convertir de Dólar a Yen Japonés",
                "Convertir de Dólar a Yen Won Sur-Coreano"};

        String opcion = (JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión: ",
                "Menu Conversor de Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                conversiones,
                "- Selección -")).toString();

        switch (opcion) {

            case "Convertir de Dólar a Euros.":
                convertir = new Euro();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dólar a Euros.",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes €" + convertir.convertirDinero(dinero) + " Euros.",
                        "Dolares Convertidos a Euros: ",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "Convertir de Dólar a Libras Esterlinas.":
                convertir = new LibrasEsterlinas();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Libras Esterlinas.",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes £" + convertir.convertirDinero(dinero) + " Libras Esterlinas.",
                        "Dolares Convertidos a Libras Esterlinas: ",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Convertir de Dólar a Yen Japonés":
                convertir = new Yen();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Yen Japones.",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes ¥" + convertir.convertirDinero(dinero) + " Yenes.",
                        "Dolares Convertidos a Yen Japones.",
                        JOptionPane.INFORMATION_MESSAGE);

                break;
            case "Convertir de Dólar a Yen Won Sur-Coreano":
                convertir = new Won();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Won Sur-Coreano.",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes \u20A9" + convertir.convertirDinero(dinero) + " Wones.",
                        "Dolares Convertidos a Won Sur-Coreano.",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
