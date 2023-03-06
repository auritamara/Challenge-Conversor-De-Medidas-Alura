import java.text.DecimalFormat; 
import javax.swing.*;

public abstract class Temperatura extends Menu {
    
    
    protected double grau;
    protected double temperatura;
    protected double Celsius  = 1;
    protected double Fahrenheit = 1.8;
    protected double Kelvin = 273.15;

    public abstract double converterCelsiusemF(double temperatura);
    public abstract double converterCelsiusemK(double temperatura);
    public abstract double converterKelvinemF(double temperatura);

    public void exibirConversorTemperatura(JFrame f){

        Object[] selectionValues = { "Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius", "Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit" };
        String initialSelection = "Celsius para Fahrenheit";
        Object retornoDaOpcaoTemperatura = JOptionPane.showInputDialog(f, "Escolha uma opção:",
        "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        DecimalFormat df = new DecimalFormat("#,###.00");

        String opcaoSelecionadaTemperatura = retornoDaOpcaoTemperatura.toString();


        switch(opcaoSelecionadaTemperatura){
            default:
                JOptionPane.showMessageDialog(f,"Opção Inválida!","Alert",JOptionPane.WARNING_MESSAGE);
                exibirConversorTemperatura(f);
                break;
            case "Celsius para Fahrenheit":
                JOptionPane.showMessageDialog(null, "O valor em Fahrenheit é " + df.format(converterCelsiusemF(Fahrenheit)) + "° graus");
                break;
            case "Celsius para Kelvin":
                JOptionPane.showMessageDialog(null, "O valor em Kelvin é " + df.format(converterCelsiusemK(Kelvin)) + "K");
                break;
            case "Fahrenheit para Celsius":
                JOptionPane.showMessageDialog(null, "O valor em Celsius é " + df.format(converterCelsiusemF(Celsius)) + "° graus");
                break;
            case "Fahrenheit para Kelvin":
                JOptionPane.showMessageDialog(null, "O valor em Kelvin é " + df.format(converterKelvinemF(Fahrenheit)) + "K");
                break;
            case "Kelvin para Celsius":
                JOptionPane.showMessageDialog(null, "O valor em Celsius é " + df.format(converterCelsiusemK(Celsius)) + "° graus");
                break;
            case "Kelvin para Fahrenheit":
                JOptionPane.showMessageDialog(null, "O valor em Fahrenheit é " + df.format(converterKelvinemF(Kelvin)) + "° graus");
                break;
        }

    }


}
