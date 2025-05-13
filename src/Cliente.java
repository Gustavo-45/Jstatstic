import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String endereço;

    public Cliente (String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;

    }
    public void exibir(){
        JOptionPane.showMessageDialog(null, "Olá "+getNome()+"\nSeu endereço foi definido como: "+getEndereço(),"CLIENTE", JOptionPane.QUESTION_MESSAGE);
    }

    public void setNome(String nome){
     this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;

    }
    public String getEndereço(){
        return endereço;
    }
}