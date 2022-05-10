package se.Lexicon.model;

import java.util.Objects;

public class TodoItemTask {

    private int id;
    private boolean assigned; // true
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        this.id = id;
        setTodoItem(todoItem);
        setAssignee(assignee);
    }



    public TodoItemTask(TodoItem todoItem) {
        if (todoItem==null)throw new IllegalArgumentException("TodoItem task should not be null");
        this.todoItem = todoItem;
    }

    public TodoItemTask(int id, boolean assigned) {
        this.id = id;
        this.assigned = assigned;

        if (assignee==null); throw new IllegalArgumentException("TodoItem Assigned should not be null ");
    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    // this method takes a person parameter
    public void setAssignee(Person assignee) {
        if(assignee != null){
            setAssigned(true);
        }
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned+
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && Objects.equals(todoItem, that.todoItem) && Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem, assignee);
    }
}

