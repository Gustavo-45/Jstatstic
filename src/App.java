
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
         int op  = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o resultado de uma população? \n1.Parâmetro\n2.Estatística"));
         if(op == 1){
            JOptionPane.showMessageDialog(null, "Certa Resposta");
         }
         else{
            JOptionPane.showMessageDialog(null, "Resposta Errada!","Errado!",JOptionPane.ERROR_MESSAGE);
         }

         Double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a média dos segunites números: \n30;\n50;\n80;\n90;"));
         if(media == 62.5){
            JOptionPane.showMessageDialog(null, "Certa Resposta");
         }
         else{
            JOptionPane.showMessageDialog(null, "Resposta Errada!","Errado!",JOptionPane.ERROR_MESSAGE);
         }

         int moda = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a moda dos seguintes valores:\n10;\n40;\n50;\n80;\n10;"));
         if (moda == 10) {
            JOptionPane.showMessageDialog(null, "Certa Resposta");
         }
         else{
            JOptionPane.showMessageDialog(null, "Resposta Errada!","Errado!",JOptionPane.ERROR_MESSAGE);
         }

         String mediana = JOptionPane.showInputDialog("Qual a medida de tendêncai central que mostra o centro da amostra?");

         if(mediana.equalsIgnoreCase("Mediana")){
            JOptionPane.showMessageDialog(null, "Certa Resposta");
        }
        else{
           JOptionPane.showMessageDialog(null, "Resposta Errada!","Errado!",JOptionPane.ERROR_MESSAGE);
        }
    }
}

/*Considerando os números 30,50,80,90 Digite o valor da média aritimética simples. R:62,5
 * Considerando os valores 10,40,50,80,10. Digite qual é a moda.R:10
 * Qual a medida de tendêncai central que mostra o centro da amostra?R:Médiana 
 * 
*/