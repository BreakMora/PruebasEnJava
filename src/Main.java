import javax.swing.JOptionPane;
import Conversion.Conversor;
import Moneda.*;

public class Main {
    static Conversor convertir;
    static String dinero = null;

    public static void main(String[] args) {
        boolean menu = true;
        String[] opcmenu = {
                "- Selección -",
                "Convertir Dolares a Moneda Extranjera.",
                "Convertir Moneda Extranjera a Dolares."};
        while(menu){
                String opcion = (JOptionPane.showInputDialog(
                        null,
                        "Seleccione la opcion de conversión: ",
                        "Menu Conversor de Monedas",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcmenu,
                        "- Selección -")).toString();
                
                switch(opcion){
                        case "Convertir Dolares a Moneda Extranjera.":
                                Convertir_Dolares_a_MonedaExtranjera();
                                break;
                        case "Convertir Moneda Extranjera a Dolares.":
                                Convertir_MonedaExtranjera_a_Dolares();
                                break;
                }
        }
    }

    private static void Convertir_Dolares_a_MonedaExtranjera(){
        String[] conversiones = {
                "- Selección -",
                "Convertir de Dólar a Euros.",
                "Convertir de Dólar a Libras Esterlinas.",
                "Convertir de Dólar a Yen Japonés.",
                "Convertir de Dólar a Won Sur-Coreano."};
        
        String opcion = (JOptionPane.showInputDialog(
                null,
                "Seleccione la opcion de conversión: ",
                "Menu Conversor de Dolar a Moneda Extranjera",
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
    }

    private static void Convertir_MonedaExtranjera_a_Dolares(){
        String[] conversiones = {
                "- Selección -",
                "Convertir de Euros a Dólar.",
                "Convertir de Libras Esterlinas a Dólar.",
                "Convertir de Yen Japonés a Dólar.",
                "Convertir de Won Sur-Coreano a  Dólar."};

        String opcion = (JOptionPane.showInputDialog(
                null, 
                "Seleccione la opcion de conversión: ", 
                "Menu Conversor de Moneda Extranjera a Dolares", 
                JOptionPane.QUESTION_MESSAGE,
                null,
                conversiones,
                "- Selección -")).toString();

        switch (opcion) {
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