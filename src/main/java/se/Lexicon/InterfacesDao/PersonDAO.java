package se.Lexicon.InterfacesDao;

import se.Lexicon.model.Person;

import java.util.List;

public interface PersonDAO {
    Person persist(Person person);

    Person findById(int id);

    Person findByMail(String email);

    Person findByUserName(String username);

    List<Person> findAll();

    void remove(int id);

}
