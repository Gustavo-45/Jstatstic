package br.com.jkalango.view.Missoes;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
public class JMissaoQuatro extends JFrame {
//o Formulario(this)
public JMissaoQuatro(){
// --- Configurações do JFrame (Formulário) ---
    setTitle("JKalango: O Código-Fonte Primordial"); // Título da janela
    setSize(700, 400); // Tamanho da janela (ajustado para a mensagem)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
    setLocationRelativeTo(null); // Centraliza a janela na tela
    ImageIcon backgroundImage = new ImageIcon("background.png");
    JLabel lblImg = new JLabel(backgroundImage);
    getLayeredPane().add(lblImg, JLayeredPane.DEFAULT_LAYER);
    // --- Definir o fundo Dark (ideia de filme de terror) ---
    getContentPane().setBackground(Color.DARK_GRAY); // O painel de conteúdo do JFrame

    // --- 1. Mensagem do JKalango ---
    JLabel mensagemLabel = new JLabel();
    // Usamos HTML para quebrar a linha e aplicar a cor branca e tamanho da fonte
    mensagemLabel.setText("<html><body style='text-align: center; color: white; font-family: \"Press Start 2P\", cursive; font-size: 10px; text-shadow: 1px 1px 2px black;'>"
                        + "Não confunda o que uma coisa é com o que ela faz. O que ela faz são seus Métodos — suas funções executáveis." 
                        + "Você possui Métodos como renderizarLuzPura() e executarDiagnostico()." 
                        + "As criaturas corrompidas agora executam Métodos como gritarEstatica(), invocarLoopDeErro() e corromperArquivoProximo()." 
                        + "Um Método é uma sub-rotina, uma sequência de comandos que um Objeto pode ser ordenado a executar."
                        + "</body></html>");

    // Centraliza o texto horizontalmente dentro do JLabel
    mensagemLabel.setHorizontalAlignment(JLabel.CENTER);
    // Define a cor da fonte diretamente no HTML ou aqui para garantir
    mensagemLabel.setForeground(Color.WHITE); // Garante a cor branca da fonte
    // O tamanho da fonte já está no HTML, mas podemos setar um Font object se preferir um tipo específico
    mensagemLabel.setFont(new Font("Serif", Font.PLAIN, 16)); // Exemplo: fonte Serif, simples, tamanho 16

    // --- 2. Criar e Adicionar o JButton ---
    JButton iniciarMissaoButton = new JButton("Iniciar Terceira Missão");

    // Define a cor do texto do botão (opcional, mas complementa o tema)
    iniciarMissaoButton.setForeground(Color.WHITE);
    // Define a cor de fundo do botão (um cinza escuro para combinar com o tema)
    iniciarMissaoButton.setBackground(new Color(50, 50, 50)); // Um cinza bem escuro
    // Remove a borda padrão do botão (opcional, para um visual mais "limpo" de terror)
    iniciarMissaoButton.setFocusPainted(false); // Remove o "quadrado" de foco

    // --- 3. Adicionar ação ao botão ---
    iniciarMissaoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Ao clicar, mostra a mensagem "Primeira Missão Iniciada"
            JOptionPane.showMessageDialog(JMissaoQuatro.this, "Quarta Missão Iniciada");
            new JMissaoQuatro();
        }
    });

    // --- Layout e Adição dos Componentes ---
    // Usamos BorderLayout para colocar a mensagem no centro e o botão no sul (parte inferior)
    setLayout(new BorderLayout()); // Define o gerenciador de layout do JFrame

    // Adiciona a mensagem ao centro
    add(mensagemLabel, BorderLayout.CENTER);

    // Cria um JPanel para o botão para que ele não ocupe toda a largura do BorderLayout.SOUTH
    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.DARK_GRAY); // Fundo do painel do botão igual ao do JFrame
    buttonPanel.add(iniciarMissaoButton); // Adiciona o botão ao painel

    // Adiciona o painel do botão ao sul (parte inferior) do JFrame
    add(buttonPanel, BorderLayout.SOUTH);

    // --- Tornar o JFrame visível (sempre por último) ---
    setVisible(true);
    }


    }
