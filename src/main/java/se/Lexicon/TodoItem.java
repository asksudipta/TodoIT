package se.Lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem() {
    }

    public TodoItem(int id, String title, String taskDescription, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.creator = creator;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Title should not be null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) throw new RuntimeException("The date should not be null");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        if (done == true)
            this.done = true;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getSummery(Person Person) {
        return getSummery(Person);
    }

    public boolean isOverDue() {
        boolean Date;
        // If condition
        return true;

    }
}




