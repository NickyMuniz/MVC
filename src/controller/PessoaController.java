package controller;

import model.entity.Pessoa;
import model.service.PessoaService;

import java.util.ArrayList;
import java.util.List;


public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void criaPessoa(){
        pessoaService.criar();
        IO.println("Criado com sucesso");
    }

    public void mostrarPessoa(){
        pessoaService.mostrarPessoa();
    }

    //var anos = [bla, bla, bla,]
}
