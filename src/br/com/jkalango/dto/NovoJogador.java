package br.com.jkalango.dto;

import javax.swing.JOptionPane;

public class NovoJogador {
 private String nome;

 public String getNome() {
    return nome;
 }

 public void setNome(String nome) {
    this.nome = nome;
 }
public NovoJogador(String nome){
    this.nome = nome;
}
public NovoJogador(){}
public void Verificar(){
    if(nome.contains("java")){
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
    }
    else{
        JOptionPane.showMessageDialog(null,"ERROR, VOCÊ NÃO É UM JAVA MEN");
    }
}
}
