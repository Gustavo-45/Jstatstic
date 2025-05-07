import java.util.Random;

import javax.swing.JOptionPane;;
public class App {
    public static void main(String[] args) throws Exception {
        /*P(E) é a probabilidade do evento.
        n(E) é o número de resultados favoráveis (1 para o número específico que você está considerando).
        n(S) é o número total de resultados possíveis no espaço amostral (6 para um dado).
        P(E) = n(E)/n(S)
        */
        int nE = 100; //pois é 1 sobre 6 logo 1 = 100
        int nS = 6;
        Random random = new Random();
        int contLado1 = 0;
        int contLado2 = 0;
        int contLado3 = 0;
        int contLado4 = 0;
        int contLado5 = 0;
        int contLado6 = 0;
        double probabilidade = /*p(x) =*/ nE / nS;
        String mensagem =   "Espaço amostral:{1,2,3,4,5,6}\n"+
                            "Probabilidade de cair cada lado é de aproximadamente: "+probabilidade+"%\n" +
                            "Deseja lançar o dado?";
       while(true){
            int opcao = JOptionPane.showConfirmDialog(null, mensagem,"Lançando dados",JOptionPane.YES_NO_OPTION);
                if(opcao != JOptionPane.YES_OPTION){
                    String estatisticas = "Jogo finalizado!\n"+
                    "Total de lançamentos: "+(contLado1+contLado2+contLado3+contLado4+contLado5+contLado6)+"\n"+
                    "Quantidade de vezes que saiu cada lado:\n" +
                    "lado 1: "+contLado1+"\n"+
                    "lado 2: "+contLado2+"\n"+
                    "lado 3: "+contLado3+"\n"+
                    "lado 4: "+contLado4+"\n"+
                    "lado 5: "+contLado5+"\n"+
                    "lado 6: "+contLado6;
                    JOptionPane.showMessageDialog(null, estatisticas, "estatisticas", 1);
                    break;
                }
            int resultado = (random.nextInt(6)+1);
               switch (resultado) {
                case 1:
                    contLado1++;
                break;
                case 2:
                    contLado2++;
                break;
                case 3:
                    contLado3++;
                break;
                case 4:
                    contLado4++;
                break;
                case 5:
                    contLado5++;
                break;     
                case 6:
                    contLado6++;
                break;
               }
               if(opcao == JOptionPane.YES_OPTION){
                    int tenta = JOptionPane.showConfirmDialog(null, "Gostaria de tentar acerta o número que vai cair?(1-6) ","Lançando dados",JOptionPane.YES_NO_OPTION);
                        if(tenta == JOptionPane.YES_OPTION){
                            int tentativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o número sorteado?", "TENTE ACERTAR", 3));
                                if(resultado == tentativa){
                                    JOptionPane.showMessageDialog(null, "Parabéns você acertou, o número sorteado foi: "+resultado, "CORRETO", 1);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Que pena você errou, o número sorteado foi: "+resultado, "ERROU", 0);
                                }
               }
                else{ String saida = "Resultado do lançamento: "+resultado;
                      JOptionPane.showMessageDialog(null, saida, "Resultado", 1);}
         }

       }
  
    }
}
