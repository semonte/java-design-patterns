package org.designpatterns.abstractfactory;

public class CacheUserRepository implements IUserRepository {

    public User getUserByName(String name) {
        return new User("I am a user from cache!");
    }
}
