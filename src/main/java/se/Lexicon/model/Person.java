package se.Lexicon.model;


import javax.xml.validation.Validator;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credential;

    //DEFAULT Constructor:
    public Person() {
    }

    //Constructor with value:
    public Person(int id, String firstName, String lastName, String email) {
        this(firstName, lastName, email);
        this.id = id;
    }

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }
//Methods

    public AppUser getCredential() {
        return credential;
    }

    public void setCredential(AppUser credential) {
        this.credential = credential;
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
        //if (firstName == null) {throw new IllegalArgumentException("firstName should not be null!");}
        //Using Validation Interface:
        Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).andThen(Validation.checkMaxLength20).accept(firstName, "FirstName");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //if (lastName == null) {throw new IllegalArgumentException("Lastname should not be null");}
        Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).andThen(Validation.checkMaxLength20).accept(lastName,"Lastname");

        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        //if (email == null) {throw new IllegalArgumentException("Email should not be null");}
        Validation.checkStringNotNull.andThen(Validation.checkNotEmpty).andThen(Validation.checkMinLength3).accept(email,"Email");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

