
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      //INTRODUÇÃO
      JOptionPane.showMessageDialog(null,"\t             Alô, Jardim!","JARDIM",JOptionPane.INFORMATION_MESSAGE);

      //VARIAVEIS
      int i = 0;
      String nome = "";
      String endereco;

      //LOOP
      while (i == 0){

        //ENTRADA E SAIDA
      nome = JOptionPane.showInputDialog(null,"Qual seu nome?","JARDIM",JOptionPane.QUESTION_MESSAGE);
      endereco = JOptionPane.showInputDialog(null,"Qual seu endereço?","JARDIM",JOptionPane.QUESTION_MESSAGE);
      int escolha = JOptionPane.showConfirmDialog(null, "Seu nome é: "+nome+"\n E seu endereço é o: "+endereco , "JARDIM", JOptionPane.YES_NO_CANCEL_OPTION);

      //CONDIÇÕES
        if(escolha ==JOptionPane.NO_OPTION){
          JOptionPane.showMessageDialog(null, "Desculpe pelo engano, me informe novamente", "JARDIM", JOptionPane.WARNING_MESSAGE);
        }else{
          //PARAR LOOP
          i++;
        }
      }

      //VARIAVEIS
      Double vetor[] = new Double[20];
      int i2 = 0;
      int contJardins = 1;
      Double area = 0.0;
      Double comprimento =0.0;
      Double largura =0.0;
      int contGrande = 0;
      int contPequeno = 0;
      Double moda = 0.0;
      int maiorFrequencia = 0;
      //LOOP
      while (i2 ==0) {
      
        //ENTRADA DE DADOS
      largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá "+nome+" para realizar o serviço preciso saber qual é a largura do "+contJardins+ "º jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));
      comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "E qual é o comprimento do "+ contJardins+"º jardim?", "JARDIM", JOptionPane.QUESTION_MESSAGE));

      //CALCULO DA AREA
      Double areaJardim = comprimento * largura;

      //ARMAZENAR AREA
      area += areaJardim;
        if(areaJardim>=100){  
          contGrande++;
      }
        else{ 
          contPequeno++;
      }
       
      //VETOR
      vetor[contJardins-1] = areaJardim;
      String mensagem = "Áreas dos jardins inseridos\n";

      //CALCULA MODA
      for (int i3 = 0; i3 < contJardins; i3++) {
      //contagem tem que ser criada dentro da condição
      int contagem = 0;
        mensagem += (i3 + 1) + "º jardim: " + vetor[i3] + " m²\n";
           for (int j = 0; j < contJardins; j++) {
             if (vetor[i3].equals( vetor[j]) ) {
              contagem++;
        }
      }
      //armazena moda
      if (contagem > maiorFrequencia){
        maiorFrequencia = contagem;
        moda = vetor[i3];
      }
      }
      JOptionPane.showMessageDialog(null, mensagem, "JARDINS", JOptionPane.INFORMATION_MESSAGE);

      //escolha do usuario continuar ou nao
      int escolha1 = JOptionPane.showConfirmDialog(null, "Gostaria de inserir mais um jardim?", "JARDIM",JOptionPane.YES_NO_OPTION);
       if(escolha1 == JOptionPane.NO_OPTION){
        //Finalzia o loop
          i2++;
          //saida de dados
          JOptionPane.showMessageDialog(null, "Área total:"+area+"m2\nMédia das áreas:"+area/contJardins +"\nModa :"+moda+"\nVocê tem "+contGrande+" jardins grandes e "+contPequeno+" jardins pequenos.", "JARDIM", JOptionPane.INFORMATION_MESSAGE);
       }
       //conta jardins apenas se selecionar sim
      else{contJardins++;
      }
  }
      //variaveis
      Double preço = 0.0;
      Double contServiço1 = 0.0;
      Double contServiço2 = 0.0;
      Double contServiço3 = 0.0;
      Double contServiço4 = 0.0;
      Double contServiço5 = 0.0;
      boolean loop = true;

      //loop
      while (loop) {
        //escolha do usuario
      int servico =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do serviço que gostaria de requisitar, para saber sua descrição(1-6):\n1-Plantio\n2-Poda\n3-Controle de pragas\n4-Adubação\n5-Irrigação\n6-Sair"));
        switch (servico) {
          case 1:
            JOptionPane.showMessageDialog(null,"Plantio: Profissionais capacitados para plantar diversas espécies de plantas e flores.\nValor:R$4,00 por m2");
            contServiço1++;
            preço = preço +4;
            break;
          case 2:
            JOptionPane.showMessageDialog(null,"Poda: Realização de poda de árvores e arbustos para manter a saúde das plantas.\nValor:R$5,99 por m2");
            contServiço2++; 
            preço = preço+5.99;
            break;
          case 3:
            JOptionPane.showMessageDialog(null,"Controle de pragas: Aplicação de técnicas para controle de pragas e doenças que afetam as plantas.\nValor:R$30,00 por m2");
            contServiço3++;
            preço = preço +30;
            break;
          case 4:
            JOptionPane.showMessageDialog(null,"Adubação: Mistura de nutrientes ao solo para promover o crescimento saudável das plantas.\nValor:R$3,00 por m2");
            contServiço4++;
            preço = preço + 3; 
            break;
          case 5:
            JOptionPane.showMessageDialog(null,"Irrigação: Instalação e manutenção de sistemas de rega para garantir que as plantas recebam a quantidade adequada de água.\nValor:R$12,00 por m2");
            contServiço5++;
            preço = preço + 12;
            break;
            case 6: 
            loop = false;
            break;
          default:
            JOptionPane.showMessageDialog(null, "Insira um número de acordo com as opções(1-6)", "Error", JOptionPane.ERROR_MESSAGE);
            break;
          }
        }
        //calculos dos resultados das escolhas
        Double total = 2*(contServiço1+contServiço2+contServiço3+contServiço4+contServiço5);
        Double varlorTotal = preço * area;
        Double desconto = varlorTotal * (total /100);
        Double preçoFinal = varlorTotal - desconto;
        JOptionPane.showMessageDialog(null, "Parabéns você ganhou: "+total+"% de desconto \nDesconto: R$"+desconto +"\nO preço final pelos serviços escolhidos nos "+contJardins+" jardins é de: R$"+preçoFinal, "JARDIM", JOptionPane.INFORMATION_MESSAGE);


  }
}

