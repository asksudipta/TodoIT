package se.Lexicon;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;

    }

    public TodoItemTask(TodoItem todoItem) {
        if (todoItem==null)throw new IllegalArgumentException("TodoItem task should not be null");
        this.todoItem = todoItem;
    }

    public TodoItemTask(int id, boolean assigned) {
        this.id = id;
        if (assignee==null);
        this.assigned = assigned;
    }
}

