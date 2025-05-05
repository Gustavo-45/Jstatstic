
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
         int op = 0;
         JOptionPane.showMessageDialog(null, "Switch e Loops", "Aula-3", 1);

            while(op != 4){
               op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção: \n1.Estatistica descritiva \n2.Probabilidade \n3.Modelos Probabilísticos\n4.Sair","Escolha",3));
               switch (op) {
                  case 1:
                     JOptionPane.showMessageDialog(null, "Estatísticas Descritivas", "Escolha 1", 1);
                     break;
                  case 2:
                     JOptionPane.showMessageDialog(null, "Probabilidade", "Escolha 2", 1);
                     break;
                  case 3:
                     JOptionPane.showMessageDialog(null, "Modelos Probabilísticos", "Escolha 3", 1);
                     break;
                  case 4:
                     JOptionPane.showMessageDialog(null, "Saindo.....", "Saida", 0);
                     break;
                  default:
                     int saida1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Opção invalida. \n1.Continuar\n2.Sair.", "ERRO", 0));
                        if(saida1 == 2){op = 4;}
      
            }
         }
     }
}