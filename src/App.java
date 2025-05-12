import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

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

      int i2 = 0;
      int contJardins = 1;
      Double area = 0.0;
      Double comprimento =0.0;
      Double largura =0.0;
      int contGrande = 0;
      int contPequeno = 0;
      while (i2 ==0) {
        
      largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá "+nome+"\n para realizar o serviço preciso saber qual é a largura do "+contJardins+ "º jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));
      comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá "+nome+"\nE qual é o comprimento do"+ contJardins+"º jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));
      area = area + comprimento * largura;
        if(area>=100){
          contGrande++;
      }
        else{ 
          contPequeno++;
      }
      JOptionPane.showMessageDialog(null, "A área total é de:"+area+"m2\nVocê tem "+contGrande+" jardins grandes e "+contPequeno+" jardins pequenos.", "JARDIM", JOptionPane.INFORMATION_MESSAGE);

      int escolha1 = JOptionPane.showConfirmDialog(null, "Gostaria de inserir mais um jardim?", "JARDIM",JOptionPane.YES_NO_OPTION);
       if(escolha1 == JOptionPane.NO_OPTION){
          i2++;
       }
      contJardins++;
    }
      Double preço = 0.0;
      Double contServiço1 = 0.0;
      Double contServiço2 = 0.0;
      Double contServiço3 = 0.0;
      Double contServiço4 = 0.0;
      Double contServiço5 = 0.0;
      boolean loop = true;

      while (loop) {
      int servico =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do serviço que gostaria de requisitar, para saber sua descrição(1-6):\n1-Plantio\n2-Poda\n3-Controle de pragas\n4-Adubação\n5-Irrigação\n6-Sair"));
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
            case 6: 
            loop = false;
            break;
          default:
            JOptionPane.showMessageDialog(null, "Insira um número de acordo com as opções(1-6)", "Error", JOptionPane.ERROR_MESSAGE);
            break;
          }
        }
        Double total = contServiço1+contServiço2+contServiço3+contServiço4+contServiço5;
        Double varlorTotal = preço * area;
        Double desconto = varlorTotal * (total /100);
        Double preçoFinal = varlorTotal - desconto;
        JOptionPane.showMessageDialog(null, "Parabéns você ganhou: "+total+"% de desconto \nDesconto: R$"+desconto +"\nO preço final pelos serviços escolhidos é de: R$"+preçoFinal, "JARDIM", JOptionPane.INFORMATION_MESSAGE);


  }
}

