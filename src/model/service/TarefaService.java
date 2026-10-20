package model.service;

import model.entity.Status;
import model.entity.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class TarefaService {
    private static int id = 1;

    Set<Tarefa> ListaDeTarefas = new HashSet<>();

    public void criar(){
        Tarefa t = new Tarefa();
        t.setId(id++);
        t.setTitulo(IO.readln("Digite a sua atividade: "));
        t.setDescricao(IO.readln("Digite a descrição: "));
        t.setStatus(Status.ANDAMENTO);

        ListaDeTarefas.add(t);
    }

    public void mostrartarefas(){
        IO.println(ListaDeTarefas);
    }

}
