import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        TaskManager ListaTarefas = new TaskManager();

        do {

            System.out.println("Rastreador de Tarefas");
            System.out.println("Digite o número de acordo sua Escolha");
            System.out.println("1 - Listar todas Tarefas");
            System.out.println("2 - Iniciar nova Tarefa");
            System.out.println("3 - Atualizar Tarefa");
            System.out.println("4 - Deletar Tarefa");


            switch (Keyboard.nextInt()) {
                case 1:
                    Keyboard.nextLine();

                    System.out.println(ListaTarefas.ViewLista());
                    System.out.println("Pressione 1 para continuar");
                    Keyboard.nextLine();
                    break;
                case 2:
                    Keyboard.nextLine();

                    Task novaTarefa = new Task();
                    System.out.println("Digite as informações Solicitadas:");
                    System.out.println("Data de Inicialização: ");
                    novaTarefa.dataInit = Keyboard.nextLine();

                    System.out.println("Descrição: ");
                    novaTarefa.description = Keyboard.nextLine();

                    System.out.println("Status: ");
                    novaTarefa.stats = Keyboard.nextLine();

                    System.out.println("Data de ultima atualizacao: ");
                    novaTarefa.updateData = Keyboard.nextLine();

                    ListaTarefas.AddTask(novaTarefa);
                    System.out.println("Pressione qualquer tecla para continuar");
                    break;

                case 3:
                    Keyboard.nextLine();

                case 4:
                    Keyboard.nextLine();
            }

        } while (!Keyboard.next().equals("0"));


        Keyboard.close();
    }

}