import javax.swing.*;  
public class Continua extends Menu {
    

    public void desejaContinuar(){
        int resposta;
        
        resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            exibirMenuPrincipal();
        } 
        else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        } 

    }
}
