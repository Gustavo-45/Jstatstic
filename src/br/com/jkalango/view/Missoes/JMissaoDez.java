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
public class JMissaoDez extends JFrame {
//o Formulario(this)
public JMissaoDez(){
// --- Configurações do JFrame (Formulário) ---
    setTitle("JKalango: O Porto Lógico Contratual"); // Título da janela
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
                        + "Finalmente, os portões para o abismo que você vê... eles são, na verdade, Interfaces."
                        + "Uma Interface é um porto lógico, um contrato estrito de comunicação. A Interface I_AcessoAoAbismo não se importa com quem ou o que você é." 
                        + "Ela apenas exige que qualquer Objeto que queira se conectar a ela deve saber como executar os métodos abrirConexaoSegura() e transmitirSinalDeLoucura()."
                        + "É por isso que as JFormigas e as JAbelhinhas, outrora tão diferentes, agora podem se conectar aos mesmos portais de pesadelo." 
                        + "Elas foram forçadas a implementar a mesma Interface "
                        + "</body></html>");

    // Centraliza o texto horizontalmente dentro do JLabel
    mensagemLabel.setHorizontalAlignment(JLabel.CENTER);
    // Define a cor da fonte diretamente no HTML ou aqui para garantir
    mensagemLabel.setForeground(Color.WHITE); // Garante a cor branca da fonte
    // O tamanho da fonte já está no HTML, mas podemos setar um Font object se preferir um tipo específico
    mensagemLabel.setFont(new Font("Serif", Font.PLAIN, 16)); // Exemplo: fonte Serif, simples, tamanho 16

    // --- 2. Criar e Adicionar o JButton ---
    JButton iniciarMissaoButton = new JButton("Iniciar Faze FINAL");

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
            JOptionPane.showMessageDialog(JMissaoDez.this, "BOA SORTE! \nVC VAI PRECISAR.......");
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
