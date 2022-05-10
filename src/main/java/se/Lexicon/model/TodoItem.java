package se.Lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, boolean done, LocalDate deadLine, Person creator) {
        this(title,taskDescription,done,deadLine,creator);
        this.id = id;
    }
    public TodoItem(String title, String taskDescription, boolean done, LocalDate deadLine, Person creator) {
    setTitle(title);
    setCreator(creator);
    setDone(done);
    setDeadLine(deadLine);
    setTaskDescription(taskDescription);
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
        //if (title == null) throw new IllegalArgumentException("Title should not be null");
        Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).andThen(Validation.checkMaxLength20).accept(title,"Title");
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
        //if (deadLine == null) throw new RuntimeException("The date should not be null");
        Validation.checkDateNotNull.andThen(Validation.checkNotEmpty).accept(String.valueOf(deadLine),"Localdate");
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
        if(creator==null)throw new IllegalArgumentException("Creator is null");
        this.creator = creator;
    }
    public boolean isOverdue(){
        return LocalDate.now().isAfter(deadLine);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && Objects.equals(deadLine, todoItem.deadLine);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }
}




