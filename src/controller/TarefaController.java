package controller;

import model.entity.Status;
import model.entity.Tarefa;
import model.service.PessoaService;
import model.service.TarefaService;

public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void criarTarefa(){
        tarefaService.criar();
        IO.println("Criado com sucesso");
    }

    public void mostrarTarefa(){
        tarefaService.mostrartarefas();
    }

    public void criarTafera() {
        tarefaService.criar();
    }
}
