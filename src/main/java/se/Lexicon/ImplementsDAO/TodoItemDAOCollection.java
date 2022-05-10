package se.Lexicon.ImplementsDAO;

import se.Lexicon.InterfacesDao.TodoItemDAO;
import se.Lexicon.model.AppUser;
import se.Lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoItemDAOCollection implements TodoItemDAO {

    private List<TodoItem> todoItems;

    public TodoItemDAOCollection() {
        todoItems = new ArrayList<>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        //step1: check the parameter
        //step2: add  todoitem to the collection
        if (todoItem == null) throw new IllegalArgumentException("Todoitem is null");
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findBy(int id) {
        if (id == 0) throw new IllegalArgumentException("Id is zero");
        return todoItems.stream().filter(todoItem -> todoItem.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        //step1 check the status
        //step2 filter the status is done
        //step3: add to the list
       List<TodoItem> filteredList =  todoItems.stream().filter(todoItem -> todoItem.isDone()).collect(Collectors.toList());
        return filteredList;
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        //step 1: check the titile not null.
        //step 2:filter the title where title match
        //step 3 :add to the list
        if (title==null)throw new IllegalArgumentException("Title is null");
        List<TodoItem> titleList= todoItems.stream().filter(todoItem -> todoItem.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
        return titleList;
    }

    @Override
    public List<TodoItem> findByPersonId(int id) {
        //step 1: check the person id not null.
        //step2 :filter by personId.
        //step 3: Add to the collection list.
        if (id==0)throw new IllegalArgumentException("Id is zero");
        List<TodoItem> personIdList= todoItems.stream().filter(todoItem -> todoItem.getId()==id).collect(Collectors.toList());
        return personIdList;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate deadline) {
        //step1 :check the date is before the current date
        //step2 :filter the date
        //step3 :add the date to the list
        List<TodoItem> deadLineBeforeList=
        todoItems.stream().filter(todoItem -> todoItem.getDeadLine().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        return deadLineBeforeList;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate afterdaedline) {
        //step 1: check the date is after the current date
        //step 2: filter the date
        //step 3:add the date to list
        List<TodoItem> deadLineAfterList=
                todoItems.stream().filter(todoItem -> todoItem.getDeadLine().isAfter(LocalDate.now()))
                        .collect(Collectors.toList());
        return deadLineAfterList;
    }

    @Override
    public void remove(int id) {
        //step1 : find by the id.
        //step 2:remove the id.
        TodoItem removeId=findBy(id);
        if(removeId!=null)todoItems.remove(removeId);
    }
}
