package model.service;

import model.entity.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PessoaService {
    private static int id = 1;

    Set<Pessoa> bancoDeDados = new HashSet<>();

    // Crud

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln());
        p.setEmail(IO.readln());
        p.setSenha(IO.readln());
        bancoDeDados.add(p);
    }
    public void mostrarPessoa(){
        IO.println(bancoDeDados);
    }


}
