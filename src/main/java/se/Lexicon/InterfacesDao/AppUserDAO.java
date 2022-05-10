package se.Lexicon.InterfacesDao;

import se.Lexicon.model.AppUser;

import java.util.List;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);

    AppUser findByName(String username);

    List<AppUser> findAll();

    void remove(String username);
}
