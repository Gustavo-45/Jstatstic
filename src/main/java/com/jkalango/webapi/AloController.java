package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/alo")
@RestController
public class AloController {
    //Requisição e respostas (REQUEST e RESPONSE)
    @GetMapping
    public String aloMundo(){
        return "Alô Mundo - JKalango!";
    }
}
