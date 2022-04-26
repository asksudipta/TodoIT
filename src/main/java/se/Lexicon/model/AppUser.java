package se.Lexicon.model;

import java.util.Objects;

public class AppUser {
    private String userName;
    private String password;
    private AppRole roll;

    public AppUser(String userName, String password, AppRole roll) {
        this.userName = userName;
        this.password = password;
        this.roll = roll;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null) throw new IllegalArgumentException("The UserName should not null or empty");
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("The Password should not null or empty");
        this.password = password;
    }

    public AppRole getRoll() {
        return roll;
    }

    public void setRoll(AppRole roll) {
        if (roll == null) throw new IllegalArgumentException("The field roll should not null or empty");
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(userName, appUser.userName) && roll == appUser.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, roll);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + userName + '\'' +
                '\'' + ", roll=" + roll +
                '}';
    }
}

