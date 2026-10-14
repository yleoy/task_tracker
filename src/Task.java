import java.util.ArrayList;
import java.util.List;

public class Task {

    int id;
    String dataInit;
    String description;
    String stats;
    String updateData;

    Task() {

    }

    public Task(String dataInit, String description, String stats, String updateData) {
        this.dataInit = dataInit;
        this.description = description;
        this.stats = stats;
        this.updateData = updateData;
    }

    public String toString() {
        return "--- Tarefa ---" +
                "\n Data de Inicialização: " + dataInit +
                "\n Descrição: " + description +
                "\n Status: " + stats +
                "\n Última Atualização: " + updateData + "\n";
    }

}
