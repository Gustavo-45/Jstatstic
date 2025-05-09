import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;

public class App {
    public static void main(String[] args) throws Exception {
      JOptionPane.showMessageDialog(null,"\t             Alô, Jardim!","JARDIM",JOptionPane.INFORMATION_MESSAGE);
      int i = 0;
      String nome = "";
      String endereco;
      while (i == 0){
      nome = JOptionPane.showInputDialog(null,"Qual seu nome?","JARDIM",JOptionPane.QUESTION_MESSAGE);
      endereco = JOptionPane.showInputDialog(null,"Qual seu endereço?","JARDIM",JOptionPane.QUESTION_MESSAGE);
      int escolha = JOptionPane.showConfirmDialog(null, "Seu nome é: "+nome+"\n E seu endereço é o: "+endereco , "JARDIM", JOptionPane.YES_NO_CANCEL_OPTION);
        if(escolha ==JOptionPane.NO_OPTION){
          JOptionPane.showMessageDialog(null, "Desculpe pelo engano, me informe novamente", "JARDIM", JOptionPane.WARNING_MESSAGE);
        }else{
          i++;
        }
      }
      Double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá "+nome+"\nQual é a largura do seu jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));
      Double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá "+nome+"\nQual é o comprimento do seu jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));
      Double area = comprimento * largura;
      JOptionPane.showMessageDialog(null, "A área do seu jardim é de:"+area+"m2", "JARDIM", JOptionPane.INFORMATION_MESSAGE);
    }
}
