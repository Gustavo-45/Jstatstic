package com.jkalango.webapi.jogadores;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name="jogador")
@Entity(name="Jogador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogador {
    public Jogador(DadosCadastroJogador dados){
        this.nome = dados.nome();
        this.nickname = dados.nickname();
        this.email = dados.email();
        this.celular = dados.celular();
        this.senha = dados.senha();

    }
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String nome; 
    private String nickname; 
    private String email;
    private String celular; 
    private String senha;

}
