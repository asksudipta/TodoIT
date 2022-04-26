package se.Lexicon.model;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    public AppUser credential;

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
        if (firstName == null) {
            throw new IllegalArgumentException("firstName should not be null!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName== null){
            throw new IllegalArgumentException("Lastname should not be null");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null){
            throw new IllegalArgumentException("Email should not be null");
        }
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

