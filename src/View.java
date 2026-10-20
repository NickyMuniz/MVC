import controller.TarefaController;
import model.service.TarefaService;

void main() {
    TarefaService tarefaService = new TarefaService();
    TarefaController tarefaController = new TarefaController(tarefaService);
    tarefaController.criarTafera();
    tarefaController.mostrarTarefa();
}