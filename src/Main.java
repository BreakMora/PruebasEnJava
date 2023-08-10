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
                "Convertir de Dólar a Yen Japonés.",
                "Convertir de Dólar a Won Sur-Coreano."};
        
        String[] conversiones2 = {
                "- Selección -",
                "Convertir de Euros a Dólar.",
                "Convertir de Libras Esterlinas a Dólar.",
                "Convertir de Yen Japonés a Dólar.",
                "Convertir de Won Sur-Coreano a  Dólar."};
        
        String opcion1 = (JOptionPane.showInputDialog(
                null,
                "Seleccione la opcion de conversión: ",
                "Menu Conversor de Monedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                conversiones,
                "- Selección -")).toString();

        String opcion2 = (JOptionPane.showInputDialog(
                null, 
                "Seleccione la opcion de conversión: ", 
                "Menu Conversor de Monedas", 
                JOptionPane.QUESTION_MESSAGE,
                null,
                conversiones2,
                "- Selección -")).toString();
        
        switch (opcion1) {
            case "Convertir de Dólar a Euros.":
                convertir = new Euro();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dólar a Euros",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes €" + convertir.convertir_Mi_Moneda(dinero) + " Euros.",
                        "Dolares Convertidos a Euros",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case "Convertir de Dólar a Libras Esterlinas.":
                convertir = new LibrasEsterlinas();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Libras Esterlinas",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes £" + convertir.convertir_Mi_Moneda(dinero) + " Libras Esterlinas.",
                        "Dolares Convertidos a Libras Esterlinas",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Convertir de Dólar a Yen Japonés":
                convertir = new Yen();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Yen Japones",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes ¥" + convertir.convertir_Mi_Moneda(dinero) + " Yenes.",
                        "Dolares Convertidos a Yen Japones",
                        JOptionPane.INFORMATION_MESSAGE);

                break;
            case "Convertir de Dólar a Won Sur-Coreano.":
                convertir = new Won();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de dolares a convertir: ",
                        "Convertir de Dolar a Won Sur-Coreano",
                        JOptionPane.QUESTION_MESSAGE)).toString();

                JOptionPane.showMessageDialog(
                        null,
                        "Tienes \u20A9" + convertir.convertir_Mi_Moneda(dinero) + " Wones.",
                        "Dolares Convertidos a Won Sur-Coreano",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        
        switch (opcion2) {
                case "Convertir de Euros a Dólar.":
                convertir = new Euro();
                dinero = (JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad de Euros a convertir: ",
                        "Convertir de Euros a Dolares",
                        JOptionPane.QUESTION_MESSAGE)).toString();
                JOptionPane.showMessageDialog(
                        null,
                        "Tienes $" + convertir.convertir_A_Mi_Moneda(dinero) + " Dolares.",
                        "Euros Convertidos a Dolares",
                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                case "Convertir de Libras Esterlinas a Dólar.":
                convertir = new LibrasEsterlinas();
                        dinero = (JOptionPane.showInputDialog(
                                null,
                                "Ingrese la cantidad de Libras Esterlinas a convertir: ",
                                "Convertir de Libras Esterlinas a Dolares",
                                JOptionPane.QUESTION_MESSAGE)).toString();

                        JOptionPane.showMessageDialog(
                                null,
                                "Tienes $" + convertir.convertir_A_Mi_Moneda(dinero) + " Dolares.",
                                "Libras Esterlinas Convertidos a Dolares",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                case "Convertir de Yen Japonés a Dólar.":
                convertir = new Yen();
                        dinero = (JOptionPane.showInputDialog(
                                null,
                                "Ingrese la cantidad de Yenes a convertir: ",
                                "Convertir de Yenes a Dolares",
                                JOptionPane.QUESTION_MESSAGE)).toString();

                        JOptionPane.showMessageDialog(
                                null,
                                "Tienes $" + convertir.convertir_A_Mi_Moneda(dinero) + " Dolares.",
                                "Yenes Convertidos a Dolares",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                case "Convertir de Won Sur-Coreano a  Dólar.":
                convertir = new Yen();
                        dinero = (JOptionPane.showInputDialog(
                                null,
                                "Ingrese la cantidad de Wones a convertir: ",
                                "Convertir de Wones a Dolares",
                                JOptionPane.QUESTION_MESSAGE)).toString();

                        JOptionPane.showMessageDialog(
                                null,
                                "Tienes $" + convertir.convertir_A_Mi_Moneda(dinero) + " Dolares.",
                                "Wones Convertidos a Dolares",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
        }
    }
}
