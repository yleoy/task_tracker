import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> lista = new ArrayList<>();

    TaskManager() {

    }

    void AddTask(Task task) {
        Task novaTarefa = new Task();

        lista.add(task);
        System.out.println("Tarefa adicionada.");
    }

    String ViewLista() {
        if (lista.isEmpty()) {
            System.out.println(" Lista Vazia");
        }
        StringBuilder format = new StringBuilder();
        for (Task tasks : lista) {
            format.append(tasks.toString()).append("\n");
        }
        return format.toString();
    }

    void UpdateTask() {

    }

    void DeleteTask() {

    }


}
