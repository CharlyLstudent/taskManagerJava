package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<>();
    }

    public void add(int identifier, String description, boolean state) {
        Task task = new Task(identifier, description, state);
        taskList.add(task);
    }

    public void delete(int identifier) {
        Task taskToRemove = null;
        for (Task task : taskList) {
            if (task.getIdentifier() == identifier) {
                taskToRemove = task;
            }
        }
        if (taskToRemove != null) {
            taskList.remove(taskToRemove);
        }

    }
    public void update(int identifier){
        Task taskToUpdate = null;
        for (Task task : taskList) {
            if (task.getIdentifier() == identifier) {
                taskToUpdate = task;
            }
        }
        if(taskToUpdate != null){
            taskToUpdate.setState(!taskToUpdate.isState());
        }
    }
    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
