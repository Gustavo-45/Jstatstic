import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
          JOptionPane.showMessageDialog(null, "Switch e Loops", "Aula-3", 1);

          int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção: \n1.Estatistica descritiva \n2.Probabilidade \n3.Modelos Probabilísticos","Escolha",3));
         
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
            default:
            JOptionPane.showMessageDialog(null, "Opção invalida", "ERRO", 0);
               break;
          }

          int contador = 0;
          while(contador<5){
            JOptionPane.showMessageDialog(null, "Viva o Senai"+contador, null, 1);
            contador++;
          }

          int i = 1;
          while (i<=10) {
            System.out.println(i);
            i++;    
          }
          for(int cont = 1; cont<=10;cont++){
            System.out.println(cont);
          } 
          String sair;
          do{
            sair = JOptionPane.showInputDialog("Deseja sair (sim) ou (não)?");
          }while (sair.equalsIgnoreCase("não"));{
          }

    }
}
