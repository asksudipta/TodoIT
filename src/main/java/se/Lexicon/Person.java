package se.Lexicon;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //Constructor
    public Person() {
    }

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        setFirstName(firstName);
        this.lastName = lastName;

        this.email = email;
    }


    //Methods


    public String getSummery() {
        return "name:- " + firstName + " " + lastName + " email :-" + email + " Id :- " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("firstName should not be null!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

