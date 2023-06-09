package org.example;

public class TaskManager {
    private ApplicationConsole applicationConsole;
    TaskList list = new TaskList();
    public TaskManager(ApplicationConsole applicationConsole){
        this.applicationConsole = applicationConsole;
    }

    public void menu() {
        while (true) {
            applicationConsole.showMessage("Enter a command: (add, remove, mark, list, exit)");
            String command = applicationConsole.readLine();

            // add switch on command types
            if(command.equals("add")){
                applicationConsole.showMessage("id de votre tâche");
                String identifier = applicationConsole.readLine();
                applicationConsole.showMessage("Description de votre tâche");
                String description = applicationConsole.readLine();
                list.add(Integer.parseInt(identifier),description,false);
            }

            if(command.equals("list")){
                for(Task task: list.getTaskList()){
                    applicationConsole.showMessage(task.toString());
                }
            }

            if (command.equals("exit")){
                return;
            }
        }
    }
}
