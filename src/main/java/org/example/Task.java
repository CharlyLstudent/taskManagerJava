package org.example;

public class Task {
    private int identifier;
    private String description;
    private boolean state;

    public Task(int identifier, String description, boolean state) {
        this.identifier = identifier;
        this.description = description;
        this.state = state;
    }

    @Override
    public String toString(){
        return "id : " + identifier + " Description : " + description + " State : " + state;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
