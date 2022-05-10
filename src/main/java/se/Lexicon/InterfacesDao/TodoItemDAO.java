package se.Lexicon.InterfacesDao;

import se.Lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);

    TodoItem findBy(int id);

    List<TodoItem> findAll();

    List<TodoItem> findAllByDoneStatus(boolean done);

    List<TodoItem> findByTitleContains(String title);

    List<TodoItem> findByPersonId(int id);

    List<TodoItem> findByDeadlineBefore(LocalDate deadline);

    List<TodoItem> findByDeadlineAfter(LocalDate afterdaedline);

    void remove(int id);

}
