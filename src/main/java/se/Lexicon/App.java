package se.Lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person mehrdad= new Person(1,"mehrdad","javan","test@gmail.com");
        Person sudipta= new Person(2,"Sudipta","Mishra","Sudipta@gmail.com");


        TodoItem task1=new TodoItem(1,"task1","Inheritance",mehrdad);

        TodoItemTask taskForSudipta = new TodoItemTask(2,task1,sudipta);

        Person sandip= new Person(3,"Sandip","Mohapatra","sandip@gmail.com");
        TodoItem task2=new TodoItem(2,"task2","workload",sudipta);
        TodoItemTask taskForSandip=new TodoItemTask(3,task2,sandip);

        System.out.println(sudipta.getSummery()+task1);
        System.out.println(task1);
    }


}
