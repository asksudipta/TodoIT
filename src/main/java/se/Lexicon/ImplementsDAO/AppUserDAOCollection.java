package se.Lexicon.ImplementsDAO;

import se.Lexicon.InterfacesDao.AppUserDAO;
import se.Lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO {

    private List<AppUser> appUsers;

    public AppUserDAOCollection() {
        appUsers = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("Appuser is null");
        if (findByName(appUser.getUserName()) != null)
            throw new IllegalArgumentException("Username" + appUser + " is already taken ");
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByName(String username) {
        if (username == null) throw new IllegalArgumentException("Username is null");
        return appUsers.stream().filter(appUser -> appUser.getUserName().equalsIgnoreCase(username)).findFirst().orElse(null);
    }

    @Override
    public List<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public void remove(String username) {
        AppUser findUser = findByName(username);
        if (findUser != null) appUsers.remove(findUser);

    }
}