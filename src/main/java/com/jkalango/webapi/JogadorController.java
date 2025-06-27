package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;

import com.jkalango.webapi.jogadores.DadosCadastroJogador;
import com.jkalango.webapi.jogadores.Jogador;
import com.jkalango.webapi.jogadores.JogadorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jogador")
@RestController
public class JogadorController {
    @Autowired
    private JogadorRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroJogador dados){
        repository.save(new Jogador(dados));
       // System.out.println(dados);
    }
}
