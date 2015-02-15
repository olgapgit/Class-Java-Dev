package com.company;

/**
 * Created by Hackeru on 2/15/2015.
 */
public class Task {
    private String taskName;
    private boolean isCompleted;

    public Task(String taskName, boolean isCompleted) {
        taskName = this.getTaskName();
        isCompleted = this.isCompleted();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
