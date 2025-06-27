package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fases")
@RestController

public class FaseJogoController {
    @GetMapping
    public int mostrarQrdeFases(){
            return 7;
        }
}
