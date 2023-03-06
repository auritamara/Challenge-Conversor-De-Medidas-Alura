import java.text.DecimalFormat; 
import javax.swing.*;  

public abstract class Moeda extends Menu{

    protected double valor;
    protected double moeda;
    protected double dolar = 5.2078;
    protected double euro = 5.5244;
    protected double libra = 6.3066;
   

   public abstract double converterReal(double moeda);
   public abstract double converterParaReal(double moeda);


   public void exibirConversorDeMoeda(JFrame f){

    Object[] selectionValues = { "Real para Dolar", "Real para Euro", "Real para Libra", "Dolar para Real", "Euro para Real", "Libra para Real" };
    String initialSelection = "Real para Dolar";
    Object retornoDaOpcaoMoeda = JOptionPane.showInputDialog(f, "Escolha uma opção:",
    "Conversor de Medidas", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

    DecimalFormat df = new DecimalFormat("#,###.00");

    String opcaoSelecionadaMoeda = retornoDaOpcaoMoeda.toString();


        switch(opcaoSelecionadaMoeda){
            default:
                JOptionPane.showMessageDialog(f,"Opção Inválida!","Alert",JOptionPane.WARNING_MESSAGE);
                exibirConversorDeMoeda(f);
                break;
            case "Real para Dolar":
                JOptionPane.showMessageDialog(null, "O valor em dólar é $ " + df.format(converterReal(dolar)));
                break;
            case "Real para Euro":
                JOptionPane.showMessageDialog(null, "O valor em euro é " + df.format(converterReal(euro)));
                break;
            case "Real para Libra":
                JOptionPane.showMessageDialog(null, "O valor em libra é " + df.format(converterReal(libra)));
                break;
            case "Dolar para Real":
                JOptionPane.showMessageDialog(null, "O valor em real é " + df.format(converterParaReal(dolar)));
                break;
            case "Euro para Real":
                JOptionPane.showMessageDialog(null, "O valor em real é " + df.format(converterParaReal(euro)));
                break;
            case "Libra para Real":
                JOptionPane.showMessageDialog(null, "O valor em real é " + df.format(converterParaReal(libra)));
                break;
        }

   } 

}
