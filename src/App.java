import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
            int opcao;
            JOptionPane.showMessageDialog(null, "O jogo da estatistica: \nJStatistics", "JStatistics",JOptionPane.DEFAULT_OPTION);
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Vamos começar o jogo? \nEscolha a estrategia: \n1.Populacional 2.Amostral","Fase: 1", JOptionPane.QUESTION_MESSAGE));
            JOptionPane.showMessageDialog(null, "Voce escolheu: "+opcao, "Fase: 1", JOptionPane.INFORMATION_MESSAGE);

            String opcaoVariavel = JOptionPane.showInputDialog(null, "Qual o tipo de variavel você deseja cadastrar?: \n1.Quantitativo\n2.Qualitativo","Fase: 2", JOptionPane.QUESTION_MESSAGE);
            int opVariavel = Integer.parseInt(opcaoVariavel); 
            JOptionPane.showMessageDialog(null, "Voce escolheu: "+opVariavel, "Fase: 2", JOptionPane.INFORMATION_MESSAGE);


    }
}
