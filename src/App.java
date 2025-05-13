
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      //INTRODUÇÃO
      JOptionPane.showMessageDialog(null,"\t             Alô, Jardim!","JARDIM",JOptionPane.INFORMATION_MESSAGE);

      //VARIAVEIS
      int i = 0;
      String nome = "";
      String endereco = "";

   

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
        
         //EXIBE OS DADOS DO USUARIO COM O MÉTODO EXIBIR DA CLASSE CLIENTE
         Cliente registroCliente = new Cliente(nome,endereco);

         registroCliente.exibir();

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

      //CALCULO DA AREA COM O METODO CALCULARAREA DA CLASSE JARDIM
      Jardim jardim = new Jardim(comprimento, largura);
      Double areaJardim = jardim.calcularArea();
      

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
      String mensagem = "Áreas dos jardins inseridos:\n";
        for (int i3 = 0; i3 < contJardins; i3++) {
           mensagem += (i3 + 1) + "º jardim: " + vetor[i3] + " m²\n";
          }

      // Estatísticas com a nova classe
      double media = Estatisticas.calcularMedia(vetor, contJardins);
      double moda1 = Estatisticas.calcularModa(vetor, contJardins);
      double mediana = Estatisticas.calcularMediana(vetor, contJardins);
      double maximo = Estatisticas.calcularMaximo(vetor, contJardins);
      double minimo = Estatisticas.calcularMinimo(vetor, contJardins);

            // Exibe tudo
            mensagem += "\nEstatísticas:\n" +
                "Área total: " + area + " m²\n" +
                "Média: " + media + " m²\n" +
                "Moda: " +  moda1 + " m²\n" +
                "Mediana: " + mediana+ " m²\n" +
                "Máximo: " + maximo + " m²\n" +
                "Mínimo: " + minimo+ " m²\n";


      //escolha do usuario continuar ou nao
      int escolha1 = JOptionPane.showConfirmDialog(null, "Gostaria de inserir mais um jardim?", "JARDIM",JOptionPane.YES_NO_OPTION);
       if(escolha1 == JOptionPane.NO_OPTION){
        //Finalzia o loop
          i2++;
          //saida de dados
          JOptionPane.showMessageDialog(null,"Você tem "+contGrande+" jardins grandes e "+contPequeno+" jardins pequenos.\n"+mensagem, "JARDIM", JOptionPane.INFORMATION_MESSAGE);
       }
       //conta jardins apenas se selecionar sim
      else{contJardins++;
      }
  }
      //variaveis
      
      boolean loop = true;
      int totalServicos = 0;
      Double precoFinalTotal = 0.0;
      Servico plantio = new Servico("Plantio", 4.0);
      Servico poda = new Servico("Poda", 5.99);
      Servico controlePragas = new Servico("Controle de Pragas", 12.0);
      Servico adubacao = new Servico("Adubação", 20.0);
      Servico irrigacao = new Servico("Irrigação", 30.0);
      double contServiço1 = 0.0;
      double contServiço2 = 0.0;
      double contServiço3 = 0.0;
      double contServiço4 = 0.0;
      double contServiço5 = 0.0;
    



      //loop
      while (loop) {
        //escolha do usuario
      int servico =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do serviço que gostaria de requisitar, para saber sua descrição(1-6):\n1-Plantio\n2-Poda\n3-Controle de pragas\n4-Adubação\n5-Irrigação\n6-Sair"));
      switch (servico) {
        case 1:
            JOptionPane.showMessageDialog(null,
                " Serviço de Plantio:\n" +
                "- Preparo do solo\n" +
                "- Seleção e plantio de mudas\n" +
                "- Garantia de espaçamento ideal\n" +
                "Preço: R$" + plantio.getPrecoPorMetroQuadrado() + " por m²"
            );
            totalServicos++;
            precoFinalTotal += plantio.aplicarDesconto(area, totalServicos * 2);
            contServiço1++;
            break;
    
        case 2:
            JOptionPane.showMessageDialog(null,
                " Serviço de Poda:\n" +
                "- Corte e modelagem de arbustos e árvores\n" +
                "- Remoção de galhos secos ou perigosos\n" +
                "- Estímulo ao crescimento saudável\n" +
                "Preço: R$" + poda.getPrecoPorMetroQuadrado() + " por m²"
            );
            totalServicos++;
            precoFinalTotal += poda.aplicarDesconto(area, totalServicos * 2);
            contServiço2++;
            break;
    
        case 3:
            JOptionPane.showMessageDialog(null,
                " Controle de Pragas:\n" +
                "- Aplicação de defensivos naturais e químicos\n" +
                "- Inspeção detalhada das plantas\n" +
                "- Prevenção de novas infestações\n" +
                "Preço: R$" + controlePragas.getPrecoPorMetroQuadrado() + " por m²"
            );
            totalServicos++;
            precoFinalTotal += controlePragas.aplicarDesconto(area, totalServicos * 2);
            contServiço3++;
            break;
    
        case 4:
            JOptionPane.showMessageDialog(null,
                " Adubação:\n" +
                "- Aplicação de fertilizantes orgânicos e químicos\n" +
                "- Correção do solo\n" +
                "- Estímulo ao crescimento e floração\n" +
                "Preço: R$" + adubacao.getPrecoPorMetroQuadrado() + " por m²"
            );
            totalServicos++;
            precoFinalTotal += adubacao.aplicarDesconto(area, totalServicos * 2);
            contServiço4++;
            break;
    
        case 5:
            JOptionPane.showMessageDialog(null,
                " Irrigação:\n" +
                "- Instalação de sistemas de irrigação\n" +
                "- Programação de horários automáticos\n" +
                "- Economia de água e manutenção da umidade ideal\n" +
                "Preço: R$" + irrigacao.getPrecoPorMetroQuadrado() + " por m²"
            );
            totalServicos++;
            precoFinalTotal += irrigacao.aplicarDesconto(area, totalServicos * 2);
            contServiço5++;
            break;
    
        case 6:
            loop = false;
            break;
    
        default:
            JOptionPane.showMessageDialog(null,
                " Opção inválida. Insira um número de 1 a 6.",
                "Erro", JOptionPane.ERROR_MESSAGE
            );
            break;
    }
    
        }
        //calculos dos resultados das escolhas
        int descontoTotal = totalServicos * 2;
        if (descontoTotal > 30) descontoTotal = 30;
        
        JOptionPane.showMessageDialog(null,
            "Parabéns, você ganhou: " + descontoTotal + "% de desconto total nos serviços\n" +
            "Valor total final pelos serviços nos " + contJardins + " jardins: R$" + precoFinalTotal,
            "Resumo dos Serviços", JOptionPane.INFORMATION_MESSAGE);

            // Exibe a probabilidade de cada serviço ser escolhido
                String relatorioProbabilidades = ProbabilidadeServicos.gerarRelatorioFrequencia(
                    contServiço1, contServiço2, contServiço3, contServiço4, contServiço5
            );
        JOptionPane.showMessageDialog(null, relatorioProbabilidades, "Probabilidade dos Serviços", JOptionPane.INFORMATION_MESSAGE);
        GraficoServicos.exibirGrafico(contServiço1, contServiço2, contServiço3, contServiço4, contServiço5);

                // CONSTRUIR RELATÓRIO FINAL
        StringBuilder relatorioFinal = new StringBuilder();
        relatorioFinal.append("===== RELATÓRIO FINAL - SERVIÇOS DE JARDINAGEM =====\n\n");
        relatorioFinal.append("Cliente: ").append(nome).append("\n");
        relatorioFinal.append("Endereço: ").append(endereco).append("\n\n");

        relatorioFinal.append("Total de Jardins: ").append(contJardins).append("\n");
        relatorioFinal.append("Jardins Grandes (>= 100m²): ").append(contGrande).append("\n");
        relatorioFinal.append("Jardins Pequenos (< 100m²): ").append(contPequeno).append("\n\n");

        relatorioFinal.append("Área Total: ").append(area).append(" m²\n");
        relatorioFinal.append("Média das Áreas: ").append(Estatisticas.calcularMedia(vetor, contJardins)).append(" m²\n");
        relatorioFinal.append("Moda das Áreas: ").append(Estatisticas.calcularModa(vetor, contJardins)).append(" m²\n");
        relatorioFinal.append("Mediana das Áreas: ").append(Estatisticas.calcularMediana(vetor, contJardins)).append(" m²\n");
        relatorioFinal.append("Máxima Área: ").append(Estatisticas.calcularMaximo(vetor, contJardins)).append(" m²\n");
        relatorioFinal.append("Mínima Área: ").append(Estatisticas.calcularMinimo(vetor, contJardins)).append(" m²\n\n");

        relatorioFinal.append("=== SERVIÇOS SELECIONADOS ===\n");
        relatorioFinal.append("Plantio: ").append((int) contServiço1).append(" vezes\n");
        relatorioFinal.append("Poda: ").append((int) contServiço2).append(" vezes\n");
        relatorioFinal.append("Controle de Pragas: ").append((int) contServiço3).append(" vezes\n");
        relatorioFinal.append("Adubação: ").append((int) contServiço4).append(" vezes\n");
        relatorioFinal.append("Irrigação: ").append((int) contServiço5).append(" vezes\n\n");

        relatorioFinal.append("Desconto aplicado: ").append(descontoTotal).append("%\n");
        relatorioFinal.append("Valor final com desconto: R$").append(precoFinalTotal).append("\n");

        relatorioFinal.append("\n=== Frequência relativa dos serviços ===\n");
        relatorioFinal.append(ProbabilidadeServicos.gerarRelatorioFrequencia(
            contServiço1, contServiço2, contServiço3, contServiço4, contServiço5
        ));

            try {
        FileWriter escritor = new FileWriter("relatorio_final.txt");
        escritor.write(relatorioFinal.toString());
        escritor.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar o relatório: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
  }
}