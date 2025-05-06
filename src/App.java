import java.util.Random;
import java.util.random.*;

import javax.swing.JOptionPane;;
public class App {
    public static void main(String[] args) throws Exception {
        String[] espacoAmostral = {"Cara" , "coroa"};
        Random random = new Random();
        int contCara = 0;
        int contCoroa = 0;
        String mensagem =   "Espaço amostral:{Cara,Coroa}\n"+
                            "Probabilidade de Cara: 50% \n" +
                            "Probabilidade de Cara: 50% \n" +
                            "Deseja lançar a moeda?";
       while(true){
            int opcao = JOptionPane.showConfirmDialog(null, mensagem,"Lançando moedas",JOptionPane.YES_NO_OPTION);
                if(opcao != JOptionPane.YES_OPTION){
                    String estatisticas = "Jogo finalizado!\n"+
                    "Total de lançamentos: "+(contCara+contCoroa)+"\n"+
                    "Caras: "+contCara+"\n"+
                    "Coroas: "+contCoroa;
                    JOptionPane.showMessageDialog(null, estatisticas, "estatisticas", 1);
                    break;
                }
            int resultado = random.nextInt(2);
                if(resultado == 0){
                    contCara++;
                }else{
                    contCoroa++;
                }
            String saida = "Resultado do lançamento: "+espacoAmostral[resultado]+
                            "\n(Indice generico: " +resultado+ ")";
            JOptionPane.showMessageDialog(null, saida, "Resultado", 1);




       }


    }
}
