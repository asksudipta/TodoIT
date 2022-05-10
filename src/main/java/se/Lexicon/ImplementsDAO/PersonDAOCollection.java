package se.Lexicon.ImplementsDAO;

import se.Lexicon.InterfacesDao.PersonDAO;
import se.Lexicon.Sequencer.dao.PersonIdSequencer;
import se.Lexicon.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {

    private List<Person> people;

    public PersonDAOCollection() {
        people=new ArrayList<>();
    }

    @Override
    public Person persist(Person person) {
        if(person==null)throw new IllegalArgumentException("Person field is Null");
        if(findByMail(person.getEmail())!=null)
            throw new IllegalArgumentException("Email"+ person.getEmail()+ "is already taken");
        person.setId(PersonIdSequencer.nextId());
        people.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        if(id==0)throw new IllegalArgumentException("Id is Zero");
        //Declare by Lambda expression
        return people.stream().filter(person -> person.getId()==id).findFirst().orElse(null);
    }

    @Override
    public Person findByMail(String email) {
        if(email==null)throw new IllegalArgumentException("Email is null");
        return people.stream().filter(person -> person.getEmail()
                .equalsIgnoreCase(email)).findFirst().orElse(null);
    }

    @Override
    public Person findByUserName(String username) {
        if(username==null)throw new IllegalArgumentException("Username is null");
        return people.stream().filter(person -> person.getCredential().getUserName()
                .equalsIgnoreCase(username)).findFirst().orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return people;
    }

    @Override
    public void remove(int id) {
        Person result=findById(id);
        if(result!=null)people.remove(result);

    }
}
