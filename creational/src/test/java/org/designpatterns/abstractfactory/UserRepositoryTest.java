package org.designpatterns.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRepositoryTest {

    @Test
    public void thatUserIsFetchedFromCache() {

        IUserRepositoryFactory userRepositoryFactory = getUserRepository();

        UserService userService = new UserService(userRepositoryFactory);

        User userFromCache = userService.getUserByName(RepositoryType.CACHE, "");

        assertEquals("I am a user from cache!", userFromCache.name);
    }

    @Test
    public void thatUserIsFetchedFromDatabase() {

        IUserRepositoryFactory userRepositoryFactory = getUserRepository();

        UserService userService = new UserService(userRepositoryFactory);

        User userFromDatabase = userService.getUserByName(RepositoryType.DATABASE, "");

        assertEquals("I am a user from database!", userFromDatabase.name);
    }

    private IUserRepositoryFactory getUserRepository() {
        IUserRepository databaseUserRepository = new DatabaseUserRepository();
        IUserRepository cacheUserRepository = new CacheUserRepository();

        return new UserRepositoryFactory(databaseUserRepository, cacheUserRepository);
    }
}
