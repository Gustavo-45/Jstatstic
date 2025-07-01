package br.com.jkalango.view;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSplash extends JFrame{
    //o Formulario(JFRAME)
    public JSplash(){
    setTitle("JKAlango THE BEST OF GAME");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
 
    //Adicionar o JButton com titulo start
    JButton starButton = new JButton("Start");
    add(starButton);
    
    //Adicionar um evento ao botão que ao clicar mostre "JKalango"
    starButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           new JIntro();
        }
    });
    //Mostrar o formulario
    setVisible(true);
}
    
    //Colocar a imagem do kalando (sem animação)
     
}
