package view;

import controller.TarefaController;
import model.service.TarefaService;
public class ViewTarefa {
    void main() {
        TarefaService tarefaService = new TarefaService();
        TarefaController tarefaController = new TarefaController(tarefaService);
        tarefaController.criarTafera();
        tarefaController.mostrarTarefa();
    }

}