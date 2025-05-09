import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      JOptionPane.showMessageDialog(null,"\t             Alô, Jardim!","JARDIM",JOptionPane.INFORMATION_MESSAGE);
      int i = 0;
      String nome = "";
      String endereco;
      String grandesa;
      
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
        if(area>=200){
          grandesa = "Grande";
      }
        else{grandesa = "Pequeno";}
      JOptionPane.showMessageDialog(null, "A área do seu jardim é de:"+area+"m2\nSeu jardim é: "+grandesa, "JARDIM", JOptionPane.INFORMATION_MESSAGE);
   
      Double preço = 0.0;
      Double contServiço1 = 0.0;
      Double contServiço2 = 0.0;
      Double contServiço3 = 0.0;
      Double contServiço4 = 0.0;
      Double contServiço5 = 0.0;
      boolean loop = true;

      while (loop) {
      int servico =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do serviço que gostaria de requisitar, para saber sua descrição(1-5):\n1-Plantio\n2-Poda\n3-Controle de pragas\n4-Adubação\n5-Irrigação"));
        switch (servico) {
          case 1:
            JOptionPane.showMessageDialog(null,"Plantio: Profissionais capacitados para plantar diversas espécies de plantas e flores.\nValor:R$44,00 por m2");
            contServiço1++;
            preço = preço +44;
            break;
          case 2:
            JOptionPane.showMessageDialog(null,"Poda: Realização de poda de árvores e arbustos para manter a saúde das plantas.\nValor:R$59,99 por m2");
            contServiço2++; 
            preço = preço+59.99;
            break;
          case 3:
            JOptionPane.showMessageDialog(null,"Controle de pragas: Aplicação de técnicas para controle de pragas e doenças que afetam as plantas.\nValor:R$300,00 por m2");
            contServiço3++;
            preço = preço +300;
            break;
          case 4:
            JOptionPane.showMessageDialog(null,"Adubação: Mistura de nutrientes ao solo para promover o crescimento saudável das plantas.\nValor:R$30,00 por m2");
            contServiço4++;
            preço = preço + 30; 
            break;
          case 5:
            JOptionPane.showMessageDialog(null,"Irrigação: Instalação e manutenção de sistemas de rega para garantir que as plantas recebam a quantidade adequada de água.\nValor:R$120,00 por m2");
            contServiço5++;
            preço = preço + 120;
            break;
          default:
            JOptionPane.showMessageDialog(null, "Insira um número de acordo com as opções(1-5)", "Error", JOptionPane.ERROR_MESSAGE);
            break;
          }

          int escolha2 = JOptionPane.showConfirmDialog(null,"Gostaria de mais algum serviço?","JARDIM",JOptionPane.YES_NO_OPTION);
           if (escolha2 == JOptionPane.NO_OPTION){
            loop = false;
           }
        }
        Double total = contServiço1+contServiço2+contServiço3+contServiço4+contServiço5;
        Double desconto = (preço * area) * (total /100);
        Double preçoFinal = preço*area - desconto;
        JOptionPane.showMessageDialog(null, "Parabéns você ganhou: "+Math.round(desconto)+"% por ter escolhido um total de "+total+" serviços.\nO preço final pelos serviços escolhidos é de: R$"+preçoFinal, "JARDIM", JOptionPane.INFORMATION_MESSAGE);


  }
}

