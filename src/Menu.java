
import javax.swing.*;

public class Menu {

    private JFrame f;

    public void exibirMenuPrincipal() {

        f = new JFrame();

        Object[] selectionValues = { "Conversor de Moeda", "Conversor de Temperatura", "Encerrar" };
        String initialSelection = "Conversor de Moeda";
        Object retornoDaOpcao = JOptionPane.showInputDialog(f, "Escolha uma opção:",
                "Conversor de Medidas", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        String opcaoSelecionada = retornoDaOpcao.toString();

        try {
            switch (opcaoSelecionada) {
                default:
                    JOptionPane.showMessageDialog(f, "Opção Inválida!", "Alert", JOptionPane.WARNING_MESSAGE);
                    exibirMenuPrincipal();
                    break;
                case "Encerrar":
                    break;
                case "Conversor de Moeda":
                    String valor = JOptionPane.showInputDialog(f, " Insira o valor:");

                    double valorCapturadoMoeda = Double.parseDouble(valor);
                    Moeda moeda = new ConversorMoeda(valorCapturadoMoeda);
                    moeda.exibirConversorDeMoeda(f);
                    Continua continuar = new Continua();
                    continuar.desejaContinuar();
                    break;
                case "Conversor de Temperatura":
                    String graus = JOptionPane.showInputDialog(f, " Insira os graus:");

                    double valorCapturadoGraus = Double.parseDouble(graus);
                    Temperatura temperatura = new ConversorTemperatura(valorCapturadoGraus);
                    temperatura.exibirConversorTemperatura(f);
                    Continua continuarTambem = new Continua();
                    continuarTambem.desejaContinuar();
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(f, "Opção inválida, insira um valor usando ponto.", "Alert",
                    JOptionPane.WARNING_MESSAGE);
            exibirMenuPrincipal();
        }

    }

}
