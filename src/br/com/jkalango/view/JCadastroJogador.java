package br.com.jkalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JCadastroJogador extends JFrame {
    //Construtor inicializa os componentes do formulário
    private JLabel lbl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JTextField txt;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JPasswordField password;

    public JCadastroJogador(){
        setTitle("Faça parte do JKalango");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,50,20));

        lbl = new JLabel("Nome");
        add(lbl);

        txt = new JTextField(20);
        add(txt);

        lbl1 = new JLabel("nickname");
        add(lbl1);

        txt1 = new JTextField(20);
        add(txt1);

        lbl2 = new JLabel("email");
        add(lbl2);

        txt2 = new JTextField(20);
        add(txt2);

        lbl3 = new JLabel("Telefone");
        add(lbl3);

        txt3 = new JTextField(20);
        add(txt3);

        lbl4 = new JLabel("Senha");
        add(lbl4);

        password = new JPasswordField(20);
        add(password);

        


        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null,"Jogador cadastrado com sucesso");
            }           
        });

        setVisible(true);


    }

}